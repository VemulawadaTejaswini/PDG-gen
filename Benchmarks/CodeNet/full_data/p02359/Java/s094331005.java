import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int[] imos = new int[t + 2];
		for (int i = 0; i < n; i++) {
		    imos[sc.nextInt()]++;
		    imos[sc.nextInt()]--;
		}
		int max = imos[0];
		for (int i = 1; i <= t; i++) {
		    imos[i] += imos[i - 1];
		    max = Math.max(max, imos[i]);
		}
		System.out.println(max);
	}
}

