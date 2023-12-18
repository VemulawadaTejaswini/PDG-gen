import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	void main() {
		byte[] cc = sc.next().getBytes();
		println(cc[2] == cc[3] && cc[4] == cc[5] ? "Yes" : "No");
	}
}
