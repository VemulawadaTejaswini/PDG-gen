import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int min = a > b ? b : a;
		int ans = 0;
		for(int i = 1;i <= min;++i)
			ans++;
		System.out.println(ans);
	}
}
