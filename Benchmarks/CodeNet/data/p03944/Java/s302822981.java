import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;

public class Main
{
    int w, h, n;
    int x, y, a;
    int l, r, u, d;
    
    public static void main(String args[])
    {
	new Main().solve();
    }
    
    void solve()
    {
	in();

	if(l < r && d < u) out((r - l) * (u - d));
	else out(0);
    }

    void in()
    {
	Scanner sc = new Scanner(System.in);
	w = r = sc.nextInt();
	h = u = sc.nextInt();
	n = sc.nextInt();
	l = d = 0;
	
	for(int i = 0; i < n; i++) {
	    x = sc.nextInt();
	    y = sc.nextInt();
	    a = sc.nextInt();

	    if(a == 1 && l < x) l = x;
	    if(a == 2 && x < r) r = x;
	    if(a == 3 && d < y) d = y;
	    if(a == 4 && y < u) u = y;
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
