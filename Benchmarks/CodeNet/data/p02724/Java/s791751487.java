import java.util.Scanner;
public class Main {
	 public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);

	int n=scanner.nextInt();
	int i=0;
	int m=0;

		
			i=n/500;
			n=n-500*i;
		
			m=n/5;
			
			System.out.println(1000*i+5*m);
	

	 }
}