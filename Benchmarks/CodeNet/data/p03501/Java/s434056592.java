import java.util.Scanner;
public class test{
	public static void main(String[] args) { 
 		String n = args[0]; 
		String a = args[1];  
		String b = args[2];
		if (n * a > b) { 
			System.out.println(b);		
             } else {
			System.out.println(n * a);
		}
	}
}
