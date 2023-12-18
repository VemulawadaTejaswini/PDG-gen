import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static String[] test = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    public static void main(String[] args) {
    	int N = nextInt();
        String S = next();

        String Answer = "";

        for (int i = 0; i < S.length(); i++) {
        	String dummy = S.substring(i, i+1);
        	Answer += change(dummy, N);
        }
        println(Answer);
    }

    static String change (String str, int num) {
    	for (int i = 0; i < 26; i++) {
    		if (str.equals(test[i])) {
    			int num2 = (i + num) % 26;
    			return test[num2];
    		}
    	}
    	return null;
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
