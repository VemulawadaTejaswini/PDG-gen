
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();

		int pp = N/K;
		int ans = 0;
		if(K%2!=0){
			ans = (int)Math.pow(pp, 3);
		}
		else{
			int q = K/2;
			int qq = 1+((N-q)/K);
			ans = (int)(Math.pow(qq, 3) + Math.pow(pp, 3));
		}
		System.out.println(ans);
	}
}

