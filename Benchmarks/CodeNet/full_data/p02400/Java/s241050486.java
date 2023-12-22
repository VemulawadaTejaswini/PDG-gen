import java.util.Scanner;

class Main{
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	double pi = Math.PI;
	int r = scan.nextInt();
	System.out.println("%.6f %.6f",r * r * pi,2 * r * pi);
	}
}