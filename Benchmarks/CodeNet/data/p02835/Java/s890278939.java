import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	void main() {
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		println(a1 + a2 + a3 >= 22 ? "bust" : "win");
	}
}
