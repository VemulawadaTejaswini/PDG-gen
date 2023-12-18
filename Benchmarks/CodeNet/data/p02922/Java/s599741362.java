import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();

		if(b == 1) {
			System.out.println(0);
			return;
		}

		int ans = 1;
		if(a >= b) {

		}else {
			int temp = b - a;
			ans += temp / (a - 1);
			if(temp % (a - 1) != 0)
				ans++;
		}
		System.out.println(ans);
	}
}