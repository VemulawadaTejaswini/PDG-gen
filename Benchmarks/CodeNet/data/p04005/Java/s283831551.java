import java.util.Scanner;

public class A {
	public static Scanner sc;
	
	public static void main(String [] args){
		sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int maxi = Math.max(a,Math.max(c, b));
		
		if(a%2==0 || b%2==0 || c%2==0){
			System.out.println(0);
		} else {
			System.out.println( (a*b*c)/maxi );
		}
	}
}
