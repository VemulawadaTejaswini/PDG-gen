import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int n = nextInt();
        String s = next();
        boolean flag = true;

        if (n % 2 == 1) {
        	flag = false;
        }

        String before = s.substring(0, n/2);
        String after = s.substring(n/2);

        for (int i = 0; i < n/2; i++) {
        	if (!before.substring(i, i + 1).equals(after.substring(i, i + 1))) {
        		flag = false;
        	}
        }
        if (flag) {
        	println("Yes");
        } else {
        	println("No");
        }
    }

    static int nextInt() {
        return Integer.parseInt(next());
    }

    static String next() {
        return sc.next();
    }

    static String nextLine(){
        return sc.nextLine();
    }

    static void println(Object o) {
        out.println(o);
        out.flush();
    }
}
