import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] x = new int[n];
		int[] y = new int[n];
		double[][] distance = new double[n][n];
		double ans = 0;
		int cnt = 0;
		for(int i = 0 ; i < n; i++) {
			x[i] = Integer.parseInt(sc.next());
			y[i] = Integer.parseInt(sc.next());
		}
		
		for(int i = 0 ; i < n -1; i++) {
			for(int j = i + 1 ; j < n; j++) {
				double tmp_x = Math.pow((x[j] - x[i]), 2);
				double tmp_y = Math.pow((y[j] - y[i]), 2);
				double tmp = Math.sqrt(tmp_x + tmp_y);
				distance[i][j] = tmp;
				ans += tmp;
				cnt ++;
			}
		}
		
		
		System.out.println(ans*2/n);
		
		
	}

}