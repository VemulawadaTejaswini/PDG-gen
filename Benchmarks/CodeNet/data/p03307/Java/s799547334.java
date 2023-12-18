import java.util.Scanner;
 
public class Main {
     public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(multipleOf2andN(n));
    }

    private static int multipleOf2andN(int n)
    {
        return n % 2 == 0 ? n : 2 * n;
    }
}