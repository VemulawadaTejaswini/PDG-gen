import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			int n, d;
			
			n = sc.nextInt();
			d = sc.nextInt();
			
			double[][] points = new double[n][d];
			
			int counter = 0;
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < d; j++) {
					points[i][j] = sc.nextInt();
					
				}
			}
			
			for (int i = 0; i < n - 1; i++) {
				for (int j = i+1; j < n; j++) {
					
					double total = 0;
					for (int k = 0; k < d; k++) {
						double tmpTotal = Math.abs(points[i][k] - points[j][k]);
						total += Math.pow(tmpTotal, 2);
					}
					total = Math.sqrt(total);

					int tmpTotal = (int) total;
					
					
					if (total == (double)tmpTotal) {
						counter++;
					}
				}
			}
			
			System.out.println(counter);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
