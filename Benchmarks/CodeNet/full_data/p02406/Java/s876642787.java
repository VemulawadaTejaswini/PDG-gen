import java.io.*;
import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            int x = i;
            if (x % 3 == 0) {
                System.out.printf(" %d", x);
            }
            else if (x % 10 == 3) {
                System.out.printf(" %d", x);
            }
            else {
                x /= 10;
                if (x == 1) {
                    if (x % 10 == 3) {
                        System.out.printf(" %d", x);
                    }
                }
            }
        }
    	System.out.printf("\n");           
    }
}