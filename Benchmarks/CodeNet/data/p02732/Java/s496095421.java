import static java.lang.System.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int N = sc.nextInt();
        int[] a = new int [N];
        int[] count = new int[200001];
        for (int i=0; i<N; i++) {
            int num = sc.nextInt();
            a[i] = num;
            count[num] += 1;
        }
        long ans = 0;
        boolean[] check = new boolean[200001];
        for (int j=0; j<N; j++) {
            int cnum = count[a[j]];
            ans += (check[cnum])? 0: cnum*(cnum-1)/2;
            check[cnum] = true;
        }
        for (int k=0; k<N; k++)
            out.println(ans-(count[a[k]]-1));
    }
}