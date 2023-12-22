import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static int mod = 1000000007;

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();

        if(A >= K){
            System.out.println(K);
        } else if(A + B >= K){
            System.out.println(A);
        } else {
            System.out.println(A - (K - A - B));
        }
    }

}







