import java.util.*;

public class Main {

    static long pow(long a,int n) {
        long res=1;
        while (n>0) {
            if ((n-n/2*2)==1) {
                res=res*a;
            }
            a=a*a;
            n>>=1;
        }
        return res;
    }

    static long gcd(long a,long b) {
        long temp;
        while ((temp=a%b)!=0) {
            a=b;
            b=temp;
        }
        return b;
    }

    static long lcm(long a, long b) {
        return a*b/gcd(a, b);
    }

    static int f(int x) {
        int res = 0;
        while (x%2==0) {
            x/=2;
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[N];
        for (int i=0;i<N;i++) {
            a[i] = sc.nextInt();
            a[i]/=2;
        }

        int t = f(a[0]);
        for (int i=0;i<N;i++) {
            if (f(a[i]) != t) {
                System.out.println(0);
                return;
            }
            a[i]>>=t;
        }
        M>>=t;

        long l = 1;
        for (int i=0;i<N;i++) {
            l = lcm(l, a[i]);
            if (l>M) {
                System.out.println(0);
                return;
            }
        }

        M/=l;
        int ans = (M+1)/2;
        System.out.println(ans);
    }
}
