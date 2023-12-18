package ARC075;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int n,p;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        p = sc.nextInt();
        int odd = 0;
        int even = 0;
        for(int i = 0;i < n;i++)
            if(sc.nextInt() % 2 == 0)
                even++;
            else
                odd++;
        if(p == 0)
            System.out.println(((long) Math.pow(2,even)) * choice(odd,0));
        else
            System.out.println(((long) Math.pow(2,even)) * choice(odd,1));
    }
    private static long choice(int n ,int nd)
    {
        long counter = 0;
        while(n >= nd)
        {
            counter += p(n,nd) / p(nd,nd);
            nd += 2;
        }
        return counter;
    }
    private static long p(int n,int e)
    {
        long counter = 1;
        for(int i = 0;i < e;i++)
        {
            counter *= n;
            n--;
        }
        return counter;
    }
}
