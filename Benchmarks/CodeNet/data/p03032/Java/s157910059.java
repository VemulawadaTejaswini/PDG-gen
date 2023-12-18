import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        int[] lsum = new int[n+1];
        for(int i=0; i<n; i++) {
            lsum[i+1] = lsum[i] + a[i];
        }


        int res = 0;
        for(int l=0; l<=n; l++) {
            for(int r=0; r<=n; r++) {
                if(l+r > k) break;

                int[] b = new int[l+r];
                System.arraycopy(a, 0, b, 0, l);
                System.arraycopy(a, n-r, b, l, r);
                Arrays.sort(b);
                for(int i=0; i<k-(l+r) && i<l+r; i++) {
                    if(b[i] < 0) b[i] = 0;
                }
                int ss = 0;
                for(int i=0; i<l+r; i++) {
                    ss+=b[i];
                }
                res = Math.max(res, ss);

            }
        }


        System.out.println(res);


    }

}
