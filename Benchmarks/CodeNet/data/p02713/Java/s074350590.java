import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int out = 0;
        for(int i = 1; i < k + 1; i++){
            for(int j = 1; j < k + 1; j++){
                for(int h = 1; h < k + 1; h++){
                    out += gcd(i, gcd(j, h));
                }
            }
        }

        System.out.println(out);
        sc.close();
    }
    static int gcd(int a, int b){
        if(a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        if(b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}