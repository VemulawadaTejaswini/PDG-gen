import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static long mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        String ans = "No";

        for(int i= 0;i<K;i++){
            if(A >= B){
                B = 2*B;
            } else if (B >= C){
                C = 2*C;
            }
        }
        if(A < B && B < C){
            ans = "Yes";
        }

        System.out.println(ans);



    }

}


