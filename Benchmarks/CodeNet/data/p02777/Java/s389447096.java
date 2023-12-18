import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		String S=sc.next();
		String T=sc.next();
		int A=sc.nextInt();
		int B=sc.nextInt();
		String U=sc.next();
		if(S.equals(U))--A;
		else --B;
		System.out.println(A+" "+B);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
