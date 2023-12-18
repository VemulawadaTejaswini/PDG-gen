import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();

		int pp = N/K;
		long ans = 0;



		if(K%2!=0){
			ans = (long)Math.pow(pp, 3);
		}
		else{
			int q = K/2;
			int qq = 1+((N-q)/K);
			ans = (long)(Math.pow(qq, 3) + Math.pow(pp, 3));
		}

		if(N ==1 && K == 1){
			System.out.println("0");
		}else{
		System.out.println(ans);
		}
	}
}

