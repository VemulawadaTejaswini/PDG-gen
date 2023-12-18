import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;
        import java.util.Scanner;

public class Main {
    static private Scanner scan = new Scanner(System.in);
    public static void main(String args[]) {
//        int int1 = Integer.parseInt(scan.next());
//        int int2 = Integer.parseInt(scan.next());

        String str1 = scan.next();
        String str2 = scan.next();
//        String str3 = scan.next();
        int ans_int = 0;
        double ans_dob = 0;
        String ans = "";
        BigDecimal bd = new BigDecimal((Double.parseDouble(str1) + Double.parseDouble(str2))/2);
        ans_int = bd.setScale(0, BigDecimal.ROUND_HALF_UP).intValue();

        PrintWriter out = new PrintWriter(System.out);
        out.println(ans_int);
        out.flush();
        scan.close();
    }
}
