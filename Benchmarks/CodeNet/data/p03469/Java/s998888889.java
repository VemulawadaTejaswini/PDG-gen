import java.io.PrintWriter;
import java.lang.reflect.Array;
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

        arr[3] = '8';

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++) sb.append(arr[i]);

        out.print(sb.toString());
        out.flush();



    }

}
