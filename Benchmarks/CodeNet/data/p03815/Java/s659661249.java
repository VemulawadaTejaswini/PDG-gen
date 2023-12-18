import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		sc.close();
		if(x <= 6) {
			System.out.println(1);
		}else if(x <= 11){
			System.out.println(2);
		}else {
			if(x % 11 == 0) {
				long ans = (x / 11) * 2 + 1;
				System.out.println(ans);
			}else {
				long ans = (x / 11) * 2 + 1;
				System.out.println(ans);
			}
		}
	}
}