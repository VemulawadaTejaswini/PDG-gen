import java.util.Scanner;

public class Main {
	public static Scanner sc;
	
	public static void main(String [] args){
		sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a%2==0 || b%2==0 || c%2==0){
			System.out.println(0);
		} else {
			int e = a*b;
			int d = b*c;
			int f = c*a;
			
			int ans = Math.min(f,Math.min(d,e));
			System.out.println(ans);
		}
	}
}
