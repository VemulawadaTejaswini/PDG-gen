import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		sc.close();

		long ans = 0L;
		for(int i=1;i<n;i++) {
			int tmp;
			if(n%i==0) {
				tmp = n/i-1;
			}else {
				tmp = n/i;
			}
			ans = ans +tmp;
		}
		System.out.println(ans);
	}
}
