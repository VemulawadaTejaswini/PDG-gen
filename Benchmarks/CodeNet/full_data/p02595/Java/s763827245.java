import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static long mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long D = sc.nextLong();
        int ans = 0;

        for(int i=0;i<N;i++){
            long X = sc.nextLong();
            long Y = sc.nextLong();
            if(X*X + Y*Y <= D*D){
                ans++;
            }
        }
        System.out.println(ans);


    }

}


