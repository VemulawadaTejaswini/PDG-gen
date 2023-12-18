import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] a = new int[n];

		int target = 1;
		int breakCount = 0;
		for (int i=0; i<n; i++) {
			int x = in.nextInt();
			if (x != target)
				breakCount++;
			else
				target++;
		}
		if (breakCount == n)
			System.out.println(-1);
		else
			System.out.println(breakCount);
	}
}

