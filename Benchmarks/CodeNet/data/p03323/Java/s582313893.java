import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int a = in.nextInt();
		int b = in.nextInt();
		if (a <= 8 && b <= 8)
			System.out.println("Yay!");
		else
			System.out.println(":(");
		in.close();
	}
}