import java.util.Scanner;

public class Main
{
    public int computeMultiplication(int a, int b)
    {
        if(a > 9 || b > 9 || a == 0 || b == 0)
        {
            return -1;
        }

        return a * b;
    }

    public static void main(String args[]) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        Main m = new Main();
        //System.out.println("Enter a string");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(m.computeMultiplication(a, b));
    }
}
