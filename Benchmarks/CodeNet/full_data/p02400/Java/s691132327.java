import java.util.Scanner;

class Main{
	static public void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double r = sc.nextLong();

		double area = 0.0;
		double around = 0.0;

		around = 2 * r * Math.PI;
		area = Math.pow(r,2) * Math.PI;

		System.out.printf("%.6f %.6f",area,around);
	}
}