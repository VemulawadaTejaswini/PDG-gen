import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int N = sc.nextInt();
		int ans = 0;
		switch(D) {
		case 0:
			ans = N;
			if(ans % 100 == 0) {
				ans++;
			}
			break;
		case 1:
			ans = 100 * N;
			if(ans % 100 == 0 && N>1) {
				ans += 100;
			}
			break;
		case 2:
			ans = 100 * 100 * N;
			if(ans % (100 * 100) == 0 && N>1) {
				ans += 100*100;
			}
			break;
		}
		System.out.println(ans);
	}
}
