import java.util.*;
public class Main
{
    public static void main (String [] args)
    {
        Scanner cin = new Scanner (System.in);
        a = cin.nextInt();
        b = cin.nextInt();
        c = cin.nextInt();
        if((b * 10 + c ) % 4 == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}