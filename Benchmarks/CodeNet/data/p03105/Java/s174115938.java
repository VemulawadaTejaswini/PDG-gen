import java.util.Scanner;


public  class Main  {


	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int i = 0;
		int counter = 0;
		boolean flag = false;
		int t = A*C;
		if(B>t) {flag = true; System.out.println(C);}
		else {
		
			for(i = B; i>0;i=i-A) {
				counter++;
			}
			System.out.println(counter);
		}
		
		
	}}