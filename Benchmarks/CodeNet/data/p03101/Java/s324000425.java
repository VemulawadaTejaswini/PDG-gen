import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;
//List<Integer> list = new ArrayList<>();

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int h = stdIn.nextInt();
		int w = stdIn.nextInt();
		int h1 = stdIn.nextInt();
		int w1 = stdIn.nextInt();
		System.out.println((h-h1)*(w-w1));
		
	}
}