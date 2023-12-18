import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		int a = n / 100;
		int b = n % 100 / 10;
		int c = n % 100 % 10;
		
		if(a == 7 || b == 7 || c ==7) {
		    System.out.println("Yes");
		}
		else System.out.println("No");
		
	}
}