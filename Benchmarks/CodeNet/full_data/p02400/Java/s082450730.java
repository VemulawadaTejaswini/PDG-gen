import java.util.Scanner;

class Main{
	static public void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double r = sc.nextLong();

		double area = 0.0;
		double around = 0.0;

		area = 2 * r * Math.PI;
		around = Math.sqrt(r) * Math.PI;

		System.out.printf("%f %f",area,around);
	}
}