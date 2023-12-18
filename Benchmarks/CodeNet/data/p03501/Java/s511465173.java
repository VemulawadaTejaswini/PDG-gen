
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		 String result = ""+num;
		 int length = result.length();
		 int add=0;
		 int keta;
		 int mod=0;
		 for(int i=0; i<length; i++){
			 keta=(new Integer(result.charAt(length-(i+1))) ).intValue();
			 add = add+keta;
		 }
		 mod = num%add;
		 if(mod==0){
			 System.out.println("Yes");
		 }else{
			 System.out.println("No"); 
		 }
				

	}
}