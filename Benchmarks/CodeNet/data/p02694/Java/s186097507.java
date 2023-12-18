import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		Scanner stdIn =new Scanner(System.in);
		int X =stdIn.nextInt();
		int Y=100;
		int i;
		
		for(i=0;Y<X;i++) {
			Y=(Y*1.01);
			Y=Y/1;
		}
		System.out.println(i);
		
		
	}
 
}