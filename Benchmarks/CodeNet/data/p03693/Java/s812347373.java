import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int r,g,b;
        r = sc.nextInt();
        g = sc.nextInt();
        b = sc.nextInt();
        int res = r * 100 + g * 10 + b;
        if(res % 4 == 0)
            System.out.println("YES");
        else
            System.out.println("No");
    }
}