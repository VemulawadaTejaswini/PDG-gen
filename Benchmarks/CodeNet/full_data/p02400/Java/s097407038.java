import java.util.Scanner;


public class Main{
	public static void main(String[]args){
		double PI = 3.141592653589;
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		sc.close();
		System.out.println(r*r*PI+" "+2*r*PI);
	}
}