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
            int n = s.nextInt();
            int r = n%10;
            if(r==2||r==4||r==5||r==7||r==9)
                System.out.println("hon");
            else if(r==0||r==1||r==6||r==8)
                System.out.println("pon");
            else
                System.out.println("bon");
 
        }
}