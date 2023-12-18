import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] imos = new int[n + 1];
        for (int i = 0; i < m; i++) {
            imos[sc.nextInt() - 1]++;
            imos[sc.nextInt()]--;
        }
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (imos[i - 1] == m) {
                count++;
            }
            imos[i] += imos[i - 1];
        }
		System.out.println(count);
   }
}
