
import java.util.Scanner;

public class Main{
	
	

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);

	int A=sc.nextInt();
	int B=sc.nextInt();
	int price=0;
	if(A<=5) {
		price=0;
	}else if(A>=6&&A<=12) {
		price=B/2;
	}else if(A>=13) {
		price=B;
	}
	
	System.out.println(price);
	
	
	
    

		
	}
	

	
}
		