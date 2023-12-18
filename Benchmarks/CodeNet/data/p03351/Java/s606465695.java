import java.io.PrintWriter;
        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;
        import java.util.Scanner;

public class Main {
    static private Scanner scan = new Scanner(System.in);
    public static void main(String args[]) {
        int int1 = Integer.parseInt(scan.next());
        int int2 = Integer.parseInt(scan.next());
        int int3 = Integer.parseInt(scan.next());
        int int4 = Integer.parseInt(scan.next());
        String ans = null;
        if((Math.abs(int3 - int1)<=int4) || (Math.abs(int2 - int3) <= int4 && Math.abs(int2 - int1) <= int4) || int3 == int1){
            ans = "Yes";
        }else{
            ans = "No";
        }
        PrintWriter out = new PrintWriter(System.out);
        out.println(ans);
        out.flush();
        scan.close();
    }
}
