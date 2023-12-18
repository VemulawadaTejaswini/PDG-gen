import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[] arr = sc.next().toCharArray();
		ArrayDeque<Integer> deq = new ArrayDeque<>();
		int idx = n;
		while (idx > 0) {
		    int next = Math.max(idx - m, 0);
		    while (arr[next] == '1' && next < idx) {
		        next++;
		    }
		    if (next == idx) {
		        System.out.println(-1);
		        return;
		    }
		    deq.push(idx - next);
		    idx = next;
		}
		boolean flag = false;
		StringBuilder sb = new StringBuilder();
		while (deq.size() > 0) {
		    if (flag) {
		        sb.append(" ");
		    }
		    sb.append(deq.pop());
		    flag = true;
		}
		System.out.println(sb);
	}
}
