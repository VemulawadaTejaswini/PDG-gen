import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int size = 1000;
		int[][] imos = new int[size + 1][size + 1];
		for (int i = 0; i < n; i++) {
		    int x1 = sc.nextInt();
		    int y1 = sc.nextInt();
		    int x2 = sc.nextInt();
		    int y2 = sc.nextInt();
		    imos[x1][y1]++;
		    imos[x2][y2]++;
		    imos[x1][y2]--;
		    imos[x2][y1]--;
		}
		int max = imos[0][0];
		for (int i = 1; i <= size; i++) {
		    imos[i][0] += imos[i - 1][0];
		    max = Math.max(imos[i][0], max);
		}
		for (int i = 1; i <= size; i++) {
		    imos[0][i] += imos[0][i - 1];
		    max = Math.max(imos[0][i], max);
		    for (int j = 1; j <= size; j++) {
		        imos[j][i] += imos[j - 1][i] + imos[j][i - 1] - imos[j - 1][i - 1];
		        max = Math.max(imos[j][i], max);
		    }
		}
		System.out.println(max);
	}
}

