import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		N = (10000 - N) % 1000; 
		System.out.println(N);
	}

}
