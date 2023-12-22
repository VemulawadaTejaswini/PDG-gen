import java.util.Scanner;

public class Main{
    static int gcd(int a, int b){
        if(b == 0){
            return a;
        } return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = Integer.parseInt(in.next());
        int b = Integer.parseInt(in.next());
        System.out.println(gcd(a,b));

        in.close();
    }
}
