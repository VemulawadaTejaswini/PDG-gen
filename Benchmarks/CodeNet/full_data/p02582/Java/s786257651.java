import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        if(str.equals("SSS"))
            System.out.println(0);
        if(str.equals("SSR"))
            System.out.println(1); 
        if(str.equals("SRS"))
            System.out.println(1);
        if(str.equals("SRR"))
            System.out.println(2);
        if(str.equals("RSS"))
            System.out.println(1);
        if(str.equals("RSR"))
            System.out.println(1);
        if(str.equals("RRS"))
            System.out.println(2);
        if(str.equals("RRR"))
            System.out.println(3);
    }
}
