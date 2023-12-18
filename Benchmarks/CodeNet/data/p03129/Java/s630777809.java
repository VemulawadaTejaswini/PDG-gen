
import java.io.*;
import java.util.Scanner;
import java.util.TreeSet;

public class Main{
    /*public static void */
    public static void main(String []args) throws IOException
    {
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        if(n%k==1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}