
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		 String s = scn.next();
		   if(s.charAt(0)=='A'){
			   if(s.charAt(1)=='B' || s.charAt(2)=='B'){
				   System.out.println("Yes");
			   }else{
				   System.out.println("No");
			   }
		   }else{
			   if(s.charAt(1)=='A' || s.charAt(2)=='A'){
				   System.out.println("Yes");
			   }else{
				   System.out.println("No");
			   }
		   }
		 

	}

}