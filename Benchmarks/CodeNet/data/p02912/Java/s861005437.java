import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        double[] a = new double[n];

        for (int i=0; i<n; i++) a[i] = sc.nextDouble();

        Arrays.sort(a);

      if (a.length == 1) {
                System.out.println((long)(a[0]/Math.pow(2, m)));
                return;

            }else{

        while (m>0) {

                double tmp = a[n - 1] / a[n - 2];
                int t = (int) tmp;

                if (t == 0) {
                    a[n - 1] /= 2;
                    m -= 1;
                    Arrays.sort(a);
                } else if (m > t) {
//                if (t==0){
//                    a[n-1] /=2;
//                    Arrays.sort(a);
//                    m -= 1;
//                }else {
                    a[n - 1] /= Math.pow(2, t);
                    Arrays.sort(a);
                    m -= t;
//                }
                } else {
                    a[n - 1] /= Math.pow(2, m);
                    m = 0;
                }
            }
        }

        long ans = 0;
        for (int i=0; i<n; i++){
            ans += (long)a[i];
        }

        System.out.println(ans);



    }
}