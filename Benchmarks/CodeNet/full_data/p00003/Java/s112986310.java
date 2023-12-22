import java.io.*;
import java.util.Scanner;
public class Test {


	public static void main(String[] args) {
		
		//int n;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;
		for(i = 1;i <= n; i++){
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		if(x*x+y*y==z*z)
			System.out.println("YES");
		else 
			System.out.println("NO");
		}
			
		
		
		
		

	}

}