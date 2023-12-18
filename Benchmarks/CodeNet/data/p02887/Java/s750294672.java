import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int n = nextInt();
        String s = next();
        String[] strArray = s.split("");

        int Answer = 1;

        for (int i = 0; i < n - 1; i++) {
        	if (!strArray[i].equals(strArray[i + 1])) {
        		Answer += 1;
        	}
        }

        println(Answer);
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
