import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;

public class Main
{
    int n;
    
    public static void main(String args[])
    {
	new Main().solve();
    }
    
    void solve()
    {
	in();

	long p = 1;
	for(int i = 1; i <= n; i++) {
	    p *= i;
	    p %= 1000000007;
	}
	
	out(p);
    }

    void in()
    {
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
    }

    void out()
    {
	
    }
    
    void out(long n)
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
