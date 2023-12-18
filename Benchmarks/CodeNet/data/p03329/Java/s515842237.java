import java.util.*;

class Main
{
    private static Scanner scan = new Scanner(System.in);

    public static void out(int i)
    {
        System.out.println(i);

    }

    public static void main(String[] args)
    {
        int money = scan.nextInt();
        int count = 0;
        int temp = 9;

        while (money >= temp)
        {
            temp *= 9;
        }
        temp /= 9;
        if (temp != 1)
        {
            money -= temp;
            count += 1;
        }

        temp = 6;
        while (money >= temp)
        {
            temp *= 6;
        }
        temp /= 6;
        if (temp != 1)
        {
            money -= temp;
            count += 1;
        }

        while (money > 0)
        {
            count += 1;
            money -= 1;
        }

        out(count);
    }
}