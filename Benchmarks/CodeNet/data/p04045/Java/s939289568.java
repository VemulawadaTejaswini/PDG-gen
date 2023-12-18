import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr  = sc.next().toCharArray();
		int k = sc.nextInt();
		boolean[] can = new boolean[10];
		for (int i = 0; i < k; i++) {
		    can[sc.nextInt()] = true;
		}
		int min = 0;
		for (int i = 1; i < 10; i++) {
		    if (!can[i]) {
		        min = i;
		        break;
		    }
		}
		int[] next = new int[10];
		if (can[9]) {
		    next[9] = min * 10 + (can[0] ? min : 0);
		} else {
		    next[9] = 9;
		}
		for (int i = 8; i >= 0; i--) {
		    if (can[i]) {
		        next[i] = next[i + 1];
		    } else {
		        next[i] = i;
		    }
		}
		StringBuilder sb = new StringBuilder();
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
		    if (flag) {
		        sb.append(can[0] ? min : 0);
		    } else {
		        int x = arr[i] - '0';
		        if (can[x]) {
		            flag = true;
		            sb.append(next[x]);
		        } else {
		            sb.append(x);
		        }
		    }
		}
		System.out.println(sb);
	}
}
