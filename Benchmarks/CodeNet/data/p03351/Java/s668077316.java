import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        boolean flag = false;

        if(Math.abs(a - c) < d) flag = true;
        if(Math.abs(a - b) < d && Math.abs(b - c) < d) flag = true;

        out(flag);
        scan.close();
    }

    public static void out(boolean flag)
    {
        if(flag) System.out.print("Yes");
        else System.out.println("No");
    }
}