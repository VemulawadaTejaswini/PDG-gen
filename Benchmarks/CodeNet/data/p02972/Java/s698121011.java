import java.util.*;

public class Main {
 	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] arr = new boolean[n + 1];
		for (int i = 1; i <= n; i++) {
		    arr[i] = (sc.nextInt() == 1);
		}
		boolean[] ans = new boolean[n + 1];
		for (int i = n; i >= 1; i--) {
		    int count = 0;
		    for (int j = i; j <= n; j += j) {
		        if (ans[j]) {
		            count++;
		        }
		    }
		    ans[i] = arr[i] ^ (count % 2 == 1);
		}
		boolean flag = false;
		int count = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
		    if (ans[i]) {
		        if (flag) {
		            sb.append(" ");
		        }
		        sb.append(i);
		        count++;
		    }
		}
		System.out.println(count);
		System.out.println(sb);
   }
}


