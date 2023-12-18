import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;

public class Main
{
    String s;
    
    public static void main(String args[])
    {
	new Main().solve();
    }
    
    void solve()
    {
	in();

	String ans = "";
	for(int i = 0; i < s.length(); i++) {
	    String c = String.valueOf(s.charAt(i));
	    if(!c.equals("B")) {
		ans += c;
	    } else {
		if(ans.length() > 0)
		    ans = ans.substring(0, ans.length() - 1);
	    }
	}
	
	out(ans);
    }

    void in()
    {
	Scanner sc = new Scanner(System.in);
	s = sc.next();
    }

    void out()
    {
	
    }
    
    void out(int n)
    {
	System.out.println(n);
    }

    void out(double n)
    {
	System.out.println(n);
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
