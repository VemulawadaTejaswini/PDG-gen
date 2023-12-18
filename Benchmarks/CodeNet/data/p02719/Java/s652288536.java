import java.util.Scanner;


public class Main {

	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		Long n = Long.parseLong(sc.next());
		Long k = Long.parseLong(sc.next());
		
		Long s = n % k;
		Long ans = Math.abs(s-k);
		System.out.println(Math.min(s, ans));
		
		
	}
}
