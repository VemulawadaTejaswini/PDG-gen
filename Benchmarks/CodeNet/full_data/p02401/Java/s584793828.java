import java.io.PrintWriter;
import java.util.Scanner;

class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] Args) {
        while(true) {
            int a = Integer.parseInt(sc.next());
            String op = sc.next();
            int b = Integer.parseInt(sc.next());
            if(op.equals("+")) {
                out.println(a+b);
            } else if(op.equals("-")) {
                out.println(a-b);
            } else if(op.equals("*")) {
                out.println(a*b);
            } else if(op.equals("/")) {
                out.println(a/b);
            } else {
                break;
            }
        }
        out.flush();
    }
}