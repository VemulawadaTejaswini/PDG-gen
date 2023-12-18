import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
       
        if((a*b)%2==0) {
        	System.out.print("Even");
        }	
        else {
        	System.out.print("Odd");
        }
    }
}