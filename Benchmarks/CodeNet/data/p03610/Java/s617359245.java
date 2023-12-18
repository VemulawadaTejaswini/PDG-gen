import java.io.PrintWriter;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        String s = sc.next();
        char[] arr = s.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<s.length(); i++) {
            if (i%2==0) sb.append(arr[i]);
        }

        System.out.println(sb.toString());
    }
}