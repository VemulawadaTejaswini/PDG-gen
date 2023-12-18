import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        int r = 1;
        for(int k=0; k<N; k++) {
            int tmp[] = new int[N-1];
            for(int i=0; i<N; i++) {
                if(i==k) continue;
                if(i<k) {
                    tmp[i]=A[i];
                } else {
                    tmp[i-1]=A[i];
                }
            }
            int t_r = fact(tmp);
            if(t_r>r) r=t_r;
        }
        System.out.println(r);
   }

   static int fact(int[] x) {
        int ans = x[0];
        for(int i=1; i<x.length; i++) {
            ans = fact(ans, x[i]);
        }
        return ans;
   }

   static int fact(int a, int b) {
        return (b!=0) ? fact(b, a % b) : a;
   }
}