import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		sc.close();

		List<Integer> a = new ArrayList<>();
		a.add(A + B);
		a.add(A - B);
		a.add(A * B);

		out.println(Collections.max(a));

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
