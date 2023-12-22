import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int s=a+(a*a)+(a*a*a);
        System.out.println(s);
    }
}