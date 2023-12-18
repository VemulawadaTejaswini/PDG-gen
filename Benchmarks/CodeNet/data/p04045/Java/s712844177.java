
import java.util.*;

public class Main
{
    private final static Main main = new Main();

    public static void main(String[] args)
    {
        main.contest();
    }

    private void contest()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String regex = "[^";
        for(int i=0; i<k; ++i)
        {
            regex += sc.nextInt();
        }
        regex += "]+";
        System.out.println(solve(n, regex));
    }

    private int solve(int n, String regex)
    {
        while(!String.valueOf(n).matches(regex)) ++n;
        return n;
    }
}
