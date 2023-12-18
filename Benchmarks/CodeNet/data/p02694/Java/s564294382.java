import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		Scanner stdIn =new Scanner(System.in);
		long X =stdIn.nextLong();
		long Y=100;
		long i;
		
		for(i=0;Y<X;i++) {
			Y=(long) (Y*1.01);
			Y=Y/1;
		}
		System.out.println(i);
		
		
	}
 
}