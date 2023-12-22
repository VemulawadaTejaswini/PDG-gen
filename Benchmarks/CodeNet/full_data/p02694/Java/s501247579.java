import java.util.Scanner;


public class Main {

	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		long x =  Long.parseLong(sc.next());
		
		int ans = 0;
		long money = 100;
		while(x > money) {
			long temp = (long) (money *0.01);
			money += temp;
			ans++;
		}
		
		System.out.println(ans);
	}
	
}