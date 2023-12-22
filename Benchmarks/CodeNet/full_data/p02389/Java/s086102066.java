import java.util.Scanner;

public class Main1 {

	 public static void main(String[] args){  
	
		 Scanner out = new Scanner(System.in);
		
		 String str =out.nextLine();
		 String[] sss=str.split(" ");
		 int a= Integer.parseInt(sss[0]);
		 int b= Integer.parseInt(sss[1]);
		 System.out.println( a*b+" "+(a+b)*2 );
	    }   



}