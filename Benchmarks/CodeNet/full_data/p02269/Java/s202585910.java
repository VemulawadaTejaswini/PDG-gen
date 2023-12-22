import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    static final int INF = 1000000000;     
    
    public static void main(String[] args) throws Exception {                
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < n; ++i) {
            String op = input.next();
            String st = input.next();
            if (op.equals("insert")) {
                set.add(st);
            } else if (op.equals("find")) {
                if (set.contains(st)) System.out.println("yes");
                else System.out.println("no");
            }
        }
    }                
}