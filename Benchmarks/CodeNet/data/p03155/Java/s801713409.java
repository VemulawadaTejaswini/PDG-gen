import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;
//List<String> color = new ArrayList<>();
//int[] n = new int[k];

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int h = stdIn.nextInt();
		int w = stdIn.nextInt();

		System.out.println((n-h+1)*(n-w+1));
	}
}