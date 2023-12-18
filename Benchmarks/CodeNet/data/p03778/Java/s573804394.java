import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;

public class Main
{
    int w, a, b;
    
    public static void main(String args[])
    {
	new Main().solve();
    }
    
    void solve()
    {
	in();

	if(a > b) {
	    int tmp = a;
	    a = b;
	    b = tmp;
	}
	
	out(b - (a + w));
    }

    void in()
    {
	Scanner sc = new Scanner(System.in);
	w = sc.nextInt();
	a = sc.nextInt();
	b = sc.nextInt();
    }

    void out()
    {
	
    }
    
    void out(int n)
    {
	if(n > 0) System.out.println(n);
	else      System.out.println(0);
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
