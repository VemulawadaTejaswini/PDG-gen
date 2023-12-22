import java.util.Scanner;

class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		double PI = 3.141592653589;
		double r = sc.nextDouble();


		double area = PI * r * r;
		double len = 2.0 * PI * r; 

		System.out.println(String.format("%5f", area));
		System.out.println(String.format("%5f", len));
		

	}
}
