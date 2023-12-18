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
//        int int1 = Integer.parseInt(scan.next());
//        int int2 = Integer.parseInt(scan.next());
        String str1 = scan.next();

        int ans_int = 0;
        double ans_dob = 0;
        String ans = "";


        StringBuilder sb = new StringBuilder();
        sb.append(str1);
        int int1 = Integer.parseInt(str1.substring(0,2));
        int int2 = Integer.parseInt(str1.substring(2,4));

        if(int1 < 13 && int2 < 13 && int2 > 0 && int1 > 0){
            ans = "AMBIGUOUS";
        }else if(int1>0 && int1<13){
            ans = "MMYY";
        }else if(int2 < 13 && int2 > 0){
            ans = "YYMM";
        }else {
            ans = "NA";
        }
            PrintWriter out = new PrintWriter(System.out);
        out.println(ans);
        out.flush();
        scan.close();
    }
}
