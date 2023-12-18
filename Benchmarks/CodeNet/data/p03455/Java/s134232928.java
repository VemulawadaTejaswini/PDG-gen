import java.util.Scanner;
public class OddorEven {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
				int a=stdIn.nextInt();
		        int b=stdIn.nextInt();
		        
		        if(a%2==0||b%2==0) {
		        	System.out.println("Even");
		        }
		        else
		        	System.out.println("Odd");


	}

}
