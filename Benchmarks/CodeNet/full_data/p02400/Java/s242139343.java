import java.util.Scanner;

class Main{
	static public void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();

		System.out.printf("%.6f %.6f",(float)(Math.pow(r,2) * Math.PI),(float)(2 * r * Math.PI));
	}
}