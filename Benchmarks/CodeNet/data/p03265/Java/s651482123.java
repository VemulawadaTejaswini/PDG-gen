import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {
    static int gcd(int x, int y) {
        int r = Math.max(x, y) % Math.min(x, y);
        if (r == 0) return Math.min(x, y);
        else return gcd(Math.min(x, y), r);
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int x1 = Integer.parseInt(s[0]);
        int y1 = Integer.parseInt(s[1]);
        int x2 = Integer.parseInt(s[2]);
        int y2 = Integer.parseInt(s[3]);
        int xdiff = x2-x1;
        int ydiff = y2-y1;
        int x3, y3, x4, y4;
        
        x3 = x2 - ydiff;
        y3 = y2 + xdiff;
        x4 = x3 - xdiff;
        y4 = y3 - ydiff;
        
        
        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }
}



