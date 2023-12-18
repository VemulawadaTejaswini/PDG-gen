import java.lang.Math;
import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();

        long ans;

        ans = (long)(Math.pow(2,n)-combi(n,a)-combi(n,b)-1);
        ans = ans % 1000000007;

        System.out.print(ans);
    }

    public static long combi(long a,long b){
        long x=a;
        for(long i = 1 ; i<b ; i++){
            x = x*(a-i)/i;
        }
        for(long i = b ; i <= a-b ; i++){
            x = x/i;
        }
        return x;
    }
}