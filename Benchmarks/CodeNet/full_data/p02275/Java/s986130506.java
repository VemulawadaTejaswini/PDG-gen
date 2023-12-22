import static java.lang.System.*;
import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] ar = new int[n+1];
		int[] count = new int[10001];
		for (int i=1; i<n+1; i++) {
			int temp = sc.nextInt();
			ar[i] = temp;
			count[temp]++;
		}
		
		for (int i=1; i<10001; i++) {
			count[i] = count[i] + count[i-1];
		}

		int[] ans = new int[n+1];
		for (int i=n; i>=1; i--) {
			ans[count[ar[i]]] = ar[i];
			count[ar[i]]--;
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(ans[1]);
		for (int i=2; i<n+1; i++) sb.append(" "+ans[i]);
		out.println(sb);
	}
}

