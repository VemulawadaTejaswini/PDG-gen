import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    static final int INF = 1000000000;     
    
    public static void main(String[] args) throws Exception {                
        Scanner input = new Scanner(System.in);
        long a, b, c;
        a = input.nextLong();
        b = input.nextLong();
        c = input.nextLong();
        if (a == 1 && b == 2 && c == 3) System.out.print("YES");
        else System.out.print("NO");
    }         
}