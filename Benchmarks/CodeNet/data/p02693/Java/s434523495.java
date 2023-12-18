import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		Scanner stdIn =new Scanner(System.in);
		double X =stdIn.nextDouble();
		double Y=100;
		double i;
		
		for(i=0;Y<X;i++) {
			Y=Y*1.01;
			Y=(int)Y/1;
		}
		System.out.println(i);
		
		
	}
 
}