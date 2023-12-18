import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int n = nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        double Answer = 0;

        for (int i = 0; i < n; i++) {
        	x[i] = nextInt();
        	y[i] = nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
        	for (int j = i + 1; j < n; j++) {
        		Answer += calcLength(x[i], y[i], x[j], y[j]);
        	}
        }
        println(Answer * 2 / n);
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

    static double calcLength(int x1, int y1, int x2, int y2) {
    	double xx = x1 - x2;
    	double yy = y1 - y2;
    	return Math.sqrt((xx * xx) + (yy * yy));
    }
}
