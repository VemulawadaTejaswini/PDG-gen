import java.util.Scanner;

class Main
{
    public static void main(String[] agrs)
    {
        Scanner input = new Scanner(System.in);
        while(input.hasNext())
        {
            int a = input.nextInt();
            int b = input.nextInt();
            String s = Integer.toString(a + b);
            System.out.println(s.length());
        }
    }
}