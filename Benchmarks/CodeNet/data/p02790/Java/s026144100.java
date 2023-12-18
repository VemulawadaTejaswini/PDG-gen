import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        //
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        //int m = sc.nextInt();

        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder stb1 = new StringBuilder();
        for (int i = 0;i<b;++i) stb1.append(a);
        Long l1 =  Long.parseLong(stb1.toString());

        StringBuilder stb2 = new StringBuilder();
        for (int i = 0;i<a;++i) stb2.append(b);
        Long l2 =  Long.parseLong(stb2.toString());

        if (l1 >= l2) System.out.println(l1);
        else if (l2 >= l1) System.out.println(l2);
        //if (n >= m) System.out.println("Yes");
        //else System.out.println("No");

        sc.close();
    }
}