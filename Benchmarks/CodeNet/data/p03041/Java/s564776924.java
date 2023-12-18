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

//        String str1 = scan.next();
        int int1 = Integer.parseInt(scan.next());
        int int2 = Integer.parseInt(scan.next());
        String str3 = scan.next();
        int ans_int = 0;
        double ans_dob = 0;
        String ans = "";


        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        sb.replace(int2-1,int2,String.valueOf(str3.charAt(int2-1)).toLowerCase());
        PrintWriter out = new PrintWriter(System.out);
        out.println(sb);
        out.flush();
        scan.close();
    }
}
