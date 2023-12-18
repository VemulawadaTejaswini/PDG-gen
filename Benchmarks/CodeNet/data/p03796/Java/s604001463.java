import java.util.Scanner;


public class Main {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int power=1;
		
		for(int i=1;i<=n;i++) {
			
			power=power*i%1000000000+7;
			
		}
		
		System.out.println(power);
		
		sc.close();


	}



}

