/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
        public static void main (String[]args)
        {
            // your code goes here
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            int b = s.nextInt();
            int h = s.nextInt();
            int m = s.nextInt();
            double hang = m*1/2+h*30-(int)(h/12 * 360);
            double mang = m*6;
            double theta = hang-mang;
            double rad = Math.toRadians(theta);
            double costheta = Math.cos(rad);
            double csq = Math.pow(a, 2)+Math.pow(b, 2)-2*a*b*costheta;
            double c = Math.sqrt(csq);
            System.out.println(c);
        }
}
