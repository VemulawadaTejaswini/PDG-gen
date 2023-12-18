import java.util.*;
import java.io.*;
 
public class Main {
    public static void main (final String[] args) {
        final Scanner s = new Scanner(System.in);
        double x = Double.parseDouble(s.next());
 
        boolean flag = true;
 
        if (x < 0) {
            x = Math.abs(x);
            flag = false;
        }
        
        double temp = 0;
        double h = 0;
        double a,b = 0;
 
        while(Math.pow(temp, 5) < x) {
            temp += 1;
        }
 
        if ((Math.pow(temp, 5) - x) > (x - Math.pow(temp-1, 5))) temp -= 1;
 
        h = Math.pow(temp, 5) - x;
 
        if (Math.pow(temp, 5) - x == 0) {
            a = temp;
            b = 0;
        } else if (Math.pow(temp, 5) - x > 0) {
            a = temp;
            while (Math.pow(b, 5) < h) b += 1;
        } else {
            a = temp;
            while (Math.pow(b, 5) > h) b -= 1;
        }

        a = Math.round(a);
        b = Math.round(b);
 
        if (flag) System.out.println((int)a + " " + (int)b);
        else System.out.println(-(int)a + " " + -(int)b);
    }
}