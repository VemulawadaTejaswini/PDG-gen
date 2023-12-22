import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int ans = 0;
		while(a != 0){
			while(a != 0){
				ans += (a % 10);
				a = a / 10;
			}
			System.out.println(ans);
			ans = 0;
			a = sc.nextInt();
		}
	}
}