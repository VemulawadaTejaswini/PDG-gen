import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
//        sc.useDelimiter("\n");
//        DecimalFormat df = new DecimalFormat("0.00000000");
        
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int temp;
        temp = a;   a = b;  b = temp;
        temp = a;   a = c;  c = temp;
        pw.println(a + " " + b + " " + c);

        pw.flush();
    }
}