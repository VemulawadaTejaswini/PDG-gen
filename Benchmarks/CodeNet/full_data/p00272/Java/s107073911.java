import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] chicket = new int[]{6000, 4000, 3000, 2000};
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext()) {
			int t = stdIn.nextInt();
			int n = stdIn.nextInt();
			System.out.println(chicket[t - 1] * n);
		}
	}
}