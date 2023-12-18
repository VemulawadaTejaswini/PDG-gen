import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int M = scn.nextInt(), D = scn.nextInt();
		int ans = 0;
		for(int i = 1;i <= M;i++) {
			for(int j = 22;j <= D;j++) {
				int a = j/10;
				int b = j%10;
				if(b <2)continue;

				if(a*b == i) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}

}
