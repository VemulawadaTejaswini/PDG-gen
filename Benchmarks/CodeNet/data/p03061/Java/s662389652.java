import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] a = new int[N];
        for(int i = 0; i<N; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        if(N==2) {
            System.out.println(Math.max(a[0],a[1]));
            return;
        }
        int ans = 0;
        int gcda = a[0];
        int min = Integer.MAX_VALUE;
        int minI = 0;
        int preMinI = 0;
        for(int i = 0; i<N; i++) {
            gcda = gcd(gcda,a[i]);
            if(min > gcda) {
                min = gcda;
                preMinI = minI;
                minI = i;
            }
        }
        //        System.out.println(minI);
        gcda = a[0];
        for(int i = 0; i<N; i++) {
            if(minI == 0 && i == minI) {
                gcda = a[1];
                continue;
            }
            if(i == minI)continue;
            gcda = gcd(gcda, a[i]);
        }
        ans = gcda;

        for(int i = 0; i<N; i++) {
            if(preMinI == 0 && i == preMinI) {
                gcda = a[1];
                continue;
            }
            if(i == preMinI)continue;
            gcda = gcd(gcda, a[i]);
        }


        System.out.println(Math.max(ans, gcda));
    }

    public static int gcd(int a, int b) {
        if(b==0)return a;
        return gcd(b, a%b);
    }
}