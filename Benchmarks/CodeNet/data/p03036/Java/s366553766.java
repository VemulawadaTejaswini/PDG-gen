import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int d = sc.nextInt();
        int xb = sc.nextInt();
        
        for (int i = 2001; i <= 2010; i++) {
            int x = r * xb - d;
            System.out.println(x);
            xb = x;
        }
    }
}