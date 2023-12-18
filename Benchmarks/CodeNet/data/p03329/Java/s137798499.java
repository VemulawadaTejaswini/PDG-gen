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

        while (money >= 6)
        {
            //System.out.println(money);
            int six = 6;
            int nine = 9;
            while (six <= money)
            {
                six *= 6;
            }
            six /= 6;
            while (nine <= money)
            {
                nine *= 9;
            }
            nine /= 9;

            if (money % six > money % nine && money - six > money - nine)
            {
                money -= nine;
                count += 1;
            }
            else
            {
                money -= six;
                count += 1;
            }
            /*
            System.out.println("C:" + count);
            System.out.println("6:" + six);
            System.out.println("9:" + nine);
            System.out.println("M:" + money);
            System.out.println();
            */
        }

        while (money > 0)
        {
            count += 1;
            money -= 1;
        }

        out(count);
    }
}