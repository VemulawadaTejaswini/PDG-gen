import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Main m = new Main();
        m.p2();
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