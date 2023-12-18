import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;

public class Main
{
    int n, k;
    
    public static void main(String args[])
    {
	new Main().solve();
    }
    
    void solve()
    {
	in();

	out(k * (int)Math.pow(k - 1, n - 1));
    }

    void in()
    {
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	k = sc.nextInt();
    }

    void out()
    {
	
    }
    
    void out(int n)
    {
	System.out.println(n);
    }

    void out(char c)
    {
	System.out.print(c);
    }
    
    void out(String s)
    {
	System.out.println(s);
    }
}
