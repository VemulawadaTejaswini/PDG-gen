import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long ans;
		if(K % 2 == 1)
			ans = (long)Math.pow(N/K, 3);
		else if(2*N/K % 2 == 1)
			ans = (long)(Math.pow(N/K, 3) + Math.pow(N/K+1, 3));
		else
			ans = (long)Math.pow(N/K, 3) * 2;
		System.out.println(ans);
	}

}