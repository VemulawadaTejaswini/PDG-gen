import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void exec(InputStream in, PrintStream out){
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int result = 1;
        int min = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int c = sc.nextInt();
            if (min > c) {
                min = c;
                result ++;
            }
        }
        out.println(result);
    }

    public static void main(String[] args) {
        exec(System.in, System.out);
    }
}