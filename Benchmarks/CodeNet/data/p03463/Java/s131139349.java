import java.util.Scanner;


public class Main {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int a=sc.nextInt();
		
		int b=sc.nextInt();
		
		int sukima=Math.abs(b-a-1);
		
		
		
		if(sukima%2==1) {
			System.out.println("Alice");
		}else {
			System.out.println("Borys");
		}
		

		sc.close();


	}



}
