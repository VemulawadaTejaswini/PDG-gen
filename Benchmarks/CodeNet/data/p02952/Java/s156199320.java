import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String nStr = String.valueOf(N);
		
		int ans = 0;
		
		for(int i = 1; i <= N; i ++) {
			String str = String.valueOf(i);
			String[] len = str.split("");
			if(len.length % 2 == 1) {
				ans++;
			}
		}
		System.out.println(ans);
	}

}
