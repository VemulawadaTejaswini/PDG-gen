import java.util.Scanner;
class A {

  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int x = in.nextInt();
        System.out.print("Input second number: ");
        int y = in.nextInt();
        System.out.print("Input third number: ");
        int z = in.nextInt();

        if (x == y && x == z)
        {
            System.out.println("Poor Number");
        }
        else if ((x == y) || (x == z) || (z == y))
        {
            System.out.println("Poor Number");
        }
}
}