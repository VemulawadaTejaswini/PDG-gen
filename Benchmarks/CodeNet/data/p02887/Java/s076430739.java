import java.util.Scanner;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt(),
				ans = 1;
		String S = sc.next();
		for(int i=1;i<N;i++) {
			if(S.charAt(i) != S.charAt(i-1)) ans++;
		}
		System.out.println(ans);
	}
}