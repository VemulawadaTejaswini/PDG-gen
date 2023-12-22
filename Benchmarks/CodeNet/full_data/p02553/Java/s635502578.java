
import java.util.Scanner;

public class Main {

    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        long a=gl();
        long b=gl();
        long c=gl();
        long d=gl();


        if(a>=0 && c>=0) {
            System.out.println(b*d);
        } else if(a>=0 && d<0) {
        	System.out.println(a*d);
        } else if(c>=0 && b<0) {
        	System.out.println(c*b);
        } else if(a>=0) {
        	System.out.println(b*d);
        } else if(c>=0) {
        	System.out.println(b*d);
        } else {
        	System.out.println(Math.max(a*c, b*d));
        }
    }

    // 文字列として入力を取得
    public static String gs() {
         return scanner.next();
    }

    // intとして入力を取得
    public static int gi() {
         return Integer.parseInt(scanner.next());
    }

    // longとして入力を取得
    public static long gl() {
         return Long.parseLong(scanner.next());
    }

    // doubleとして入力を取得
    public static double gd() {
         return Double.parseDouble(scanner.next());
    }
}