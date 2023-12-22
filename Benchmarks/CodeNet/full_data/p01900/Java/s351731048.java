import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] modCounts = new int[3];
		for (int i = 0; i < n; i++) {
		    modCounts[sc.nextInt() % 3]++;
		}
		if (modCounts[1] == 0 && modCounts[2] == 0) {
		    System.out.println(1);
		} else if (modCounts[1] == modCounts[2]) {
		    System.out.println(n);
		} else if (modCounts[1] < modCounts[2]) {
		    modCounts[2] -= modCounts[1];
		    System.out.println(Math.min(n, n - (modCounts[2] - 3)));
		} else {
		    modCounts[1] -= modCounts[2];
		    System.out.println(Math.min(n, n - (modCounts[1] - 3)));
		}
	}
}

