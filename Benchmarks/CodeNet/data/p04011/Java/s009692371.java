import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    static private Scanner scan = new Scanner(System.in);
    public static void main(String args[]) {
        int int1 = Integer.parseInt(scan.next());
        int int2 = Integer.parseInt(scan.next());
        int int3 = Integer.parseInt(scan.next());
        int int4 = Integer.parseInt(scan.next());
//        String temp_str1 = "";
//        String temp_str2 = "";
        int temp_int1 = 0;
//        String str1 = scan.next();
//        String str2 = scan.next();
//        String str3 = scan.next();
        int ans_int = 0;
        String ans = "";
//        double ans_dob = 0;
        if(int2>=int1){
            ans_int = int1*int3;
        }else{
            ans_int = int2*int3 + (int1-int2)*int4;
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(ans_int);
        out.flush();
        scan.close();
    }
}
