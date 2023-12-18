import java.util.Scanner;

public class Main {
	

	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int a = 0;
		if(n%3==0) {
			a = n/3;
			System.out.println((double)a*a*a);
		}
		else if(n%3==1){
			System.out.println((double)(n/3)*(n/3)*(n/3+1));
		}
		else {
			a = n/3+1;
			System.out.println((double)(n/3+1)*(n/3)*(n/3+1));
		}
		
		
		
		
	}
}