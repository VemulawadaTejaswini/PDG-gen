import java.util.Scanner;
public class test{
	public static void main(String[] args) { 
 		int n = args[0]; 
		int a = args[1];  
		int b = args[2];
		if (n * a > b) { 
			System.out.println(b);		
             } else {
			System.out.println(n * a);
		}
	}
}
