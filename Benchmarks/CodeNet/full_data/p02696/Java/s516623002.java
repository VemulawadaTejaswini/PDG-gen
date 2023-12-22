import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int ans = 0;
		
		for(int x = 1; x <= n; x++) {
			int calc = (int) (Math.floor(a*x/b) - (a * Math.floor(x/b))); 
			if(ans <= calc) {
				ans = calc;
			}
		}
		
		System.out.println(ans);
		sc.close();
	}

}