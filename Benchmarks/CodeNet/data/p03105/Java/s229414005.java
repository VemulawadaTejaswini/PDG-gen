import java.util.*;

public class a
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println((int)Math.min(b/a, c));
        in.close();
    }
}