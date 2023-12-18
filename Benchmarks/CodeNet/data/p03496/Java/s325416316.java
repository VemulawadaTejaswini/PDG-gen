import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int maxIdx = 0;
		int min = Integer.MAX_VALUE;
		int minIdx = 0;
		for (int i = 0; i < n; i++) {
		    int x = sc.nextInt();
		    if (max < x) {
		        max = x;
		        maxIdx = i + 1;
		    }
		    if (min > x) {
		        min = x;
		        minIdx = i + 1;
		    }
		}
		StringBuilder sb = new StringBuilder();
		if (Math.abs(max) >= Math.abs(min)) {
		    for (int i = 1; i <= n; i++) {
		        sb.append(maxIdx).append(" ").append(i).append("\n");
		    }
		    for (int i = 1; i < n; i++) {
		        sb.append(i).append(" ").append(i + 1).append("\n");
		    }
		} else {
		    for (int i = 1; i <= n; i++) {
		        sb.append(minIdx).append(" ").append(i).append("\n");
		    }
		    for (int i = n; i > 1; i--) {
		        sb.append(i).append(" ").append(i - 1).append("\n");
		    }
		}
		System.out.println(n * 2 - 1);
		System.out.print(sb);
    }
}

