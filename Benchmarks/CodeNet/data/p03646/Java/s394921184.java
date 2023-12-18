import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();
		if (k == 0) {
		    System.out.println(2);
		    System.out.println("1 1");
		    return;
		} else if (k == 1) {
		    System.out.println(2);
		    System.out.println("0 2");
		    return;
		} else if (k <= 50) {
		    System.out.println(k);
		    StringBuilder sb = new StringBuilder();
		    for (int i = 0; i < k; i++) {
		        if (i != 0) {
		            sb.append(" ");
		        }
		        sb.append(i + 1);
		    }
		    System.out.println(sb);
		    return;
		}
		long add = k / 50;
		long mod = k % 50;
		long[] arr = new long[50];
		for (int i = 0; i < 50; i++) {
		    arr[i] = add + 1 + i;
		}
		for (int i = 0; i < mod; i++) {
		    arr[50 - i - 1]++;
		}
		StringBuilder sb = new StringBuilder();
		sb.append(50).append("\n");
		for (int i = 0; i < 50; i++) {
		    if (i != 0) {
		        sb.append(" ");
		    }
		    sb.append(arr[i]);
		}
	    System.out.println(sb);
   }
}


