import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        String S = next();

        if (S.equals("SUN")) {
        	println("7");
        } else if (S.equals("MON")) {
        	println("6");
        } else if (S.equals("TUE")) {
        	println("5");
        } else if (S.equals("WED")) {
        	println("4");
        } else if (S.equals("THU")) {
        	println("3");
        } else if (S.equals("FRI")) {
        	println("2");
        } else if (S.equals("SAT")) {
        	println("1");
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