import java.util.*;
import java.io.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String  a=sc.next();
        String  b = sc.next();
        String s =a+b;
        int n =Integer.parseInt(s);
        if(Math.sqrt(n)-(int)(Math.sqrt(n))==0)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}