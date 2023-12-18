import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int h = s.nextInt();
        int n = s.nextInt();
        int a[] = new int[n+1];
        int b[] = new int[n+1];
        long[] mh = new long[h+1];
        Arrays.fill(mh, -1);
        for(int i=0;i<n;i++) {
            a[i] = s.nextInt();
            b[i] = s.nextInt();
        }
        long cus = 0;
        for (int i = 0; i<n; i ++) {
            for (int j = 1; j<=h; j ++) {
                if (j - a[i] <= 0) {
                    cus = 0;
                } else {
                    cus = mh[j - a[i]];
                }
                if (mh[j] < 0 || mh[j] > cus + b[i]) {
                    mh[j] = cus + b[i];
                }
            }
        }

        System.out.println(mh[h]);
    }
}