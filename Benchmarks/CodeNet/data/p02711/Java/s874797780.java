import java.util.Scanner;

public class Main {

    static boolean isDigitPresent(int x)
    {
        while (x >100)
        {
            if (x % 100 == 117)
                break;
            x = x/100;
        }
        return (x>0);
    }
    static void printNumbers(int n)
    {
        for (int i = 100; i <= n; i++)
          if (i==117 || isDigitPresent(i))
                System.out.println(i+ " ");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the number: ");
        int n = scan.nextInt();
        if (100 <=n || n<= 999)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
