import java.util.Scanner;

public class abc101_c
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String a = in.nextLine();
        System.out.println(n/(k-1));
    }
}
