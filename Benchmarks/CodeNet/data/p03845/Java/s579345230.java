import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;

public class Main
{
    int n;
    int t[] = new int[101];
    int m;
    int p[] = new int[101];
    int x[] = new int[101];
    
    public static void main(String args[])
    {
	new Main().solve();
    }
    
    void solve()
    {
	in();

	for(int i = 0; i < m; i++) {
	    out(t[n] + x[i] - (t[p[i]] - t[p[i] - 1]));
	}
    }

    void in()
    {
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	for(int i = 1; i <= n; i++) {
	    int tt = sc.nextInt();
	    t[i] = tt + t[i - 1];
	}
	m = sc.nextInt();
	for(int i = 0; i < m; i++) {
	    p[i] = sc.nextInt();
	    x[i] = sc.nextInt();
	}
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
