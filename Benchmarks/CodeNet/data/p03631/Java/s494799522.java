import java.util.Scanner;

public
class Main
{
    public static
    void main(String[] args)
    {
        new Main().run();
    }

    private
    void run()
    {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        if (a / 100 == a % 10)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
