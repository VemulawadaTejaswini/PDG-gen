import java.util.*;
import java.lang.*;

public class Main
{
    public static void main (String[] args)
    {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        System.out.println(((t/1000)+1)*1000-t);
    }
}
