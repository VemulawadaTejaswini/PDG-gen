import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		for(int i = 0;i < number ;i++){
			double[] x = new double[4];
			double[] y = new double[4];
			
			x[0] = sc.nextDouble();
			y[0] = sc.nextDouble();
			
			x[1] = sc.nextDouble();
			y[1] = sc.nextDouble();
			
			x[2] = sc.nextDouble();
			y[2] = sc.nextDouble();
			
			x[3] = sc.nextDouble();
			y[3] = sc.nextDouble();
			
			double det = (x[1] - x[0]) * (y[3] - y[2]) - (y[1] - y[0]) * (x[3] - x[2]);
			System.out.println(det == 0.0 ? "YES" : "NO");
		}
	}
}