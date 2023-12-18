// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	void main() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = 1, j = m + 1; i < j; i++, j--)
			println(i + " " + j);
		for (int i = m + 2, j = m + m + 1; i < j; i++, j--)
			println(i + " " + j);
	}
}
