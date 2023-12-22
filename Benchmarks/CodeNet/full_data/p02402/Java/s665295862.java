import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] ints = new int[n];
		int sum = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i=0; i<n; i++) {
			ints[i] = sc.nextInt();
			sum += ints[i];
			min = Math.min(min,ints[i]);
			max = Math.max(max,ints[i]);
		}
		System.out.println(min+" "+max+" "+sum);
	}
}

