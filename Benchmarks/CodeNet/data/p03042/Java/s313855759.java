import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner s = new Scanner(System.in);
        
        String S = s.next();
        int a = Integer.parseInt(S.substring(0,2));
        int b = Integer.parseInt(S.substring(2,4));
        
        boolean a1 = (a > 12 || a == 0) ? false : true;
        boolean b1 = (b > 12 || b == 0) ? false : true;
        
        String res = a1 ? (b1 ? "AMBIGUOUS" : "MMYY") : (b1 ? "YYMM" : "NA");
        
        System.out.println(res);

    }
}
