import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        String s = scan.next();
        String t = scan.next();
        int a = scan.nextInt();
        int b = scan.nextInt();
        String u = scan.next();
        
        if(s.equals(u)){
            a--;
        }else{
            b--;
        }
        
        out.println(a + " " + b);
        out.close();
        
    }
}