import java.util.Scanner;

public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long ans = 0,work = 0;
		while(x != 0){
			work = x;
			while(work != 0){
				ans += work % 10;
				work /= 10;
			}
			System.out.println(ans);
			x = sc.nextLong();
			ans = 0;
		}
	}
}