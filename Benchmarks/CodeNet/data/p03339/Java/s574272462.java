import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] arr = sc.next().toCharArray();
		int[] lefts = new int[n];
		int[] rights = new int[n];
		for (int i = 1; i < n; i++) {
		    lefts[i] = lefts[i - 1];
		    if (arr[i - 1] == 'W') {
		        lefts[i]++;
		    }
		    rights[n - i - 1] = rights[n - i];
		    if (arr[n - i] == 'E') {
		        rights[n - i - 1]++;
		    }
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
		    min = Math.min(min, lefts[i] + rights[i]);
		}
		System.out.println(min);
	}
}
