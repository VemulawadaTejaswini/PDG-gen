import java.util.Scanner;

public class Main {

	public static int f(int n) {
		if(n % 2 == 0)return n / 2;
		else return 3 * n + 1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		sc.close();
		int ans = 1, tmp = s;
		while(tmp != 8) {
			tmp = f(tmp);
			++ans;
		}
		ans += 4;
		System.out.println(ans);
	}

}
