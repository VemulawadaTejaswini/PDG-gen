import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		long ans = 0L;
		for(long j=1L;j<=n;j++) {
			long tmp = 0;
			for(long i=1L;i*i<=j;i++) {
				if(j%i==0) {
					tmp++;
					if(j/i!=i) {
						tmp++;
					}
				}
			}
			ans = ans + j*tmp;
		}
		System.out.println(ans);


	}
}
