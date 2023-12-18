import java.util.Scanner;
public class Main {

			public static void main(String[]args) {
			
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				int max = 0;
				int min = 0;
				
				if(a>b) max = b; else max = a;
				if(n>(a+b)) min = 0; else min = (a+b)-n;
				
				System.out.println(max+  " "+ min);
				
				
			}
}
