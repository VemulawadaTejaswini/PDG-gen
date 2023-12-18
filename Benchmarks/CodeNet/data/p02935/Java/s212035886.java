
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] v = new int[n];
		for (int i = 0; i < v.length; i++) {
			v[i] = sc.nextInt();
		}
		
		Arrays.sort(v);
		double ans = v[0];
		for (int i = 1; i < v.length; i++) {
			ans = (v[i] + ans) / 2;
		}
		
		System.out.println(ans);
	}
}