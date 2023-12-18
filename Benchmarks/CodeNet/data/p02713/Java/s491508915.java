package main;

import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Main m = new Main();
        m.p3();
    }

    public void p3()
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int input = Integer.parseInt(str);
        int max = 0;
        int ans = 0;
        int sum = 0;
        for(int i = 1; i <= input; i++)
        {
            for(int j = 1;j <= input; j++)
            {
                for(int k = 1; k <= input; k++)
                {
                    //最大公約数
//                    max = Math.max(Math.max(i,j),k);
////                    for(int n = 1; n <= max;n++)
////                    {
////                        if(i % n == 0 && j % n == 0 && k % n == 0)ans = n;
////                    }
                    sum += gcd(gcd(i,j),k);
                    ans = 0;
                }
            }
        }
        System.out.println(sum);
    }
    static int gcd (int a, int b) {
        int temp;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return b;
    }

    public void p2()
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int input = Integer.parseInt(str);
        long sum = 0;
        for(int j = 0; j <= input; j++)
        {
            if(j % 3 != 0 && j % 5 != 0)sum += j;
        }
        System.out.println(sum);
    }

    public void p1()
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if(str.indexOf("7") != -1)System.out.println("Yes");
        else System.out.println("No");
    }
}
