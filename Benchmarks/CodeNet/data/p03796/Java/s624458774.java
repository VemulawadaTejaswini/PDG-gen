import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long pw = 1;
		for(int i=1;i<=N;i++) {
			pw *= i;
			pw %= (Math.pow(10,9)+7);
		}
		System.out.println(pw);
	}

}