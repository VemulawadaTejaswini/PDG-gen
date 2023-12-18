
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solver();
	}

	void solver() {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		if(s.equals("Sunny")) {
			System.out.println("Cloudy");
		}else if(s.equals("Cloudy")) {
			System.out.println("Rainy");
		}else if(s.equals("Rainy")) {
			System.out.println("Sunny");
		}
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
