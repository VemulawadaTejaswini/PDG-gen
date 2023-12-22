import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] cost = new int[n][2];
        int[] std = new int[m];
        for (int i=0; i<n; i++)
            cost[i][0] = sc.nextInt();
        for (int i=0; i<m; i++) 
            std[i] = sc.nextInt();
        java.util.Arrays.sort(std);
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (cost[j][0] <= std[i]) {
                    cost[j][1] += 1;
                    break;
                }
            }
        }
        int tmp = cost[0][1];
        int ans = 1;
        for (int i=0; i<n; i++) {
            if (tmp <cost[i][1]) {
                tmp = cost[i][1];
                ans = i+1;
            }
        }
        System.out.println(ans);
    }
}