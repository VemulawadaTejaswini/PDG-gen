
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = Long.parseLong(sc.next());
		long a = Long.parseLong(sc.next());
		long b = Long.parseLong(sc.next());
		
		long ans1 = Math.floorDiv(n, a+b);
		long temp = n %(a+b);
		
		long ans2 = 0;
		if(temp <= a) {
			 ans2 = temp;
		}
		else {
			 ans2 = a;
		}
		
		System.out.println(ans1*a+ans2);

	}

}
