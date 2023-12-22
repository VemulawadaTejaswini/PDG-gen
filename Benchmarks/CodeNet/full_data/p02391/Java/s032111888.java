import java.util.Scanner;

public class Main{
	public static void main (String[] args){
	
		Scanner standard = new Scanner(System.in);
	
		//Optional : To state what to input (Comment out if needed)
		//System.out.println("Please input 2 integers within -1001=<a, b>= 1001");
	
		int a = 0; 
		int b = 0; 
	
		a = standard.nextInt();
		b = standard.nextInt();
	
			if(a < b){
				System.out.println("a < b"); 
			}else if (a > b){
				System.out.println("a > b");
			}else if (a == b){
				System.out.println("a == b");
			}
	
	}
	
}