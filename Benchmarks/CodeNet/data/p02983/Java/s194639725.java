import java.util.Scanner;

public class Main{
	static long a;
	static long b;
	static long x;
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();
		int r = scan.nextInt();

		if(r - l > 2020) {
			r = l + 2020;
		}

		int ans = Integer.MAX_VALUE;
		for(int i = l; i <= r - 1; i++) {
			for(int j = i + 1; j <= r; j++) {
				if(ans > ((i % 2019) * j) % 2019) {
					ans = ((i % 2019) * j) % 2019;
				}
			}
		}
		System.out.println(ans);
	}
}
