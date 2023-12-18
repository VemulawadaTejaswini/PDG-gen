import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        String op = scan.next();
        int b = scan.nextInt();
        
        if(op.equals("+")) System.out.println((long)(a+b));
        else System.out.println((long)(a-b));
    }
}
