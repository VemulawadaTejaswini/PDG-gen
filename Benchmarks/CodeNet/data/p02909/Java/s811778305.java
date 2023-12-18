package Begineers;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String[] strings = new String[110];
        strings=s1.split("");
        int cnt=0;
        for (int i=0;i<s1.length();i++)
        {
            if ( i%2==0 && s1.equals("L") )
            {
                cnt=1;
                break;
            }
            if ( i%2!=0 && s1.equals("R") )
            {
                cnt=1;
                break;
            }
        }
        if (cnt==0  )
            System.out.println("YES");
        else System.out.println("NO");

    }
}
