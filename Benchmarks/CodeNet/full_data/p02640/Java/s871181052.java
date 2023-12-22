/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main {
    public static void main (String[] args) {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        if(y<=4*x)
        {
            System.out.println("No");
        }
        else {
            if((4*x-y)%2==1)
            {
                System.out.println("No");
            }
            else
                System.out.println("Yes");
        }

    }
}
