import java.util.Scanner;

class Main{
	static public void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();

		double area = 0.0;
		double around = 0.0;

		around = 2 * (double)r * Math.PI;
		area = (double)Math.pow(r,2) * Math.PI;

		System.out.printf("%.6f %.6f",area,around);
	}
}