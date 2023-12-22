import java.util.Scanner;


public class Main {
	static int Main(int n){
		return n == 0 ? 1 : n * Main(n - 1);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(Main(n));
	}
}
				