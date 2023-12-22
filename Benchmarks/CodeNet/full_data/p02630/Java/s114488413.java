import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[(int) (10e5+1)];
        int tmp = 0;
        long sum = 0;
        Arrays.fill(a,0);
        for (int i = 0; i < n; i++) {
            tmp = sc.nextInt();
            a[tmp] +=1;
            sum += tmp;
        }


        int q = sc.nextInt();
        long[] ans = new long[q+1];
        ans[0] = sum;
        int b, c;
    	StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= q; i++) {
            b = sc.nextInt();
            c = sc.nextInt();
            sb.append(sum);
            sb.append("\n");
            ans[i] = ans[i-1] +((c-b)*a[b]);
            a[c] +=a[b];
            a[b] = 0;
        }

	}
}