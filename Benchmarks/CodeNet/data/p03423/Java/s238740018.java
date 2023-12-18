import java.io.PrintWriter;
        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;
        import java.util.Scanner;

public class Main {
    static private Scanner scan = new Scanner(System.in);
    public static void main(String args[]) {
        int int1 = Integer.parseInt(scan.next());
//        String str1 = scan.next();
//        String str2 = scan.next();
//        String str3 = scan.next();
        int ans_int = 0;
        ans_int = int1/3;

        PrintWriter out = new PrintWriter(System.out);
        out.println(ans_int);
        out.flush();
        scan.close();
    }
}
