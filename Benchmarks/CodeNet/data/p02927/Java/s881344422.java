import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int count=0;
		
		for(int i=1;i<=a;i++) {
			for(int k=1;k<=b;k++) {
				if((k+1)/10>=2 && k%10>=2 && ((k+1)/10)*(k%10)==i) {
					count++;
				}	
				
			}
			
		}
		
		
		System.out.println(count);
		


		
		
		

	}

}
