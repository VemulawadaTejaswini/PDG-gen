import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    int[] inputArray;
    Set<String> set = new HashSet<>();
    int K;

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = sc.nextDouble();

        System.out.println((long)nbCanDivide(a, b, x));
    }

    double manhattan(Ten point1, Ten point2){
        return Math.abs(point1.getX() - point2.getX()) + Math.abs(point1.getY() - point2.getY());
    }

    void substring(String s, int num){
        for(int i=1; i<=num; i++){
            if(i > K){
                break;
            }
            for(int j=0; j<num; j++){
                if(j + i-1 < num){
//                    System.out.println(s.substring(j, j+i));
                    set.add(s.substring(j, j+i));
                } else {
                    break;
                }
            }
        }
    }

    void permutation(String s, String ans){
        if(s.length() <= 1){
//            System.out.println(ans + s);
        } else {
            for(int i=0; i<s.length(); i++){
                permutation(s.substring(0, i) + s.substring(i + 1), ans + s.charAt(i));
            }
        }
    }

    //a以上b以下の数でxで割り切れるものの数をf(n)と置くと、
    //f(n) = f(b) - f(a-1)
    double nbCanDivide(double a, double b, double x){
//        System.out.println(String.format("%s %s %s", a, b, x));
        return canDivide(b, x) - canDivide(a-1, x);
    }
    double canDivide(double i, double x){
//        System.out.println(String.format("%s %s", i, x));
        if(i >= 0){
//            System.out.println(((i/x) + 1));
            return (Math.floor(i/x) + 1);
        } else {
            return 0;
        }
    }

}

class Ten{
    private int x;
    private int y;

    Ten(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
