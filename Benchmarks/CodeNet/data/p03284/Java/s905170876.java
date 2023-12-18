
public class Main {
	public static void main(String[] args) {
		int N = new java.util.Scanner(System.in).nextInt();
		int K = new java.util.Scanner(System.in).nextInt();
		
		if (N % K == 0) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
	}
}
