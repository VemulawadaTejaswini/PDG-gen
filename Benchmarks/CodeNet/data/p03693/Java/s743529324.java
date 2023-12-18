import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        int r = scan.nextInt()*100;
        int g = scan.nextInt()*10;
        int b = scan.nextInt();
        
        int n = r+g+b;
        
        if((n & 3) > 0) System.out.println("NO");
        else System.out.println("YES");

        
    }
}

