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
		int max = 0;
		for (int i = 1; i < 10; i++) {
		    if (min == 0 && !can[i]) {
		        min = i;
		    }
		    if (!can[i]) {
		        max = i;
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
		            flag = false;
		            if (max < x) {
		                sb.append(min).append(can[0] ? min : 0);
		            } else {
		                for (int j = x + 1; j < 10; j++ ) {
		                    if (!can[j]) {
		                        sb.append(j);
		                        break;
		                    }
		                }
		            }
		        } else {
		            sb.append(x);
		        }
		    }
		}
		System.out.println(sb);
	}
}
