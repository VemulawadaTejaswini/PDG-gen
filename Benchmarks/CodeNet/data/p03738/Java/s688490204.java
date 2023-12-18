//TEST
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;


public class Main
{
    String a, b;
    
    public static void main(String args[])
    {
	new Main().solve();
    }
    
    void solve()
    {
	in();

	if(a.length() == b.length()) {
	    int diff = 1;//a.compareTo(b);
	    
	    if(diff == 0) {
		out("EQUAL");
	    } else if(diff > 0) {
		out("GREATER");
	    } else {
		out("LESS");
	    }
	} else {
	    if(a.length() > b.length()) out("GREATER");
	    else out("LESS");
	}
	    
    }

    void in()
    {
	Scanner sc = new Scanner(System.in);
	a = sc.next();
	b = sc.next();
    }

    void out()
    {
	
    }
    
    void out(int ans)
    {
	System.out.println(ans);
    }
    
    void out(String ans)
    {
	System.out.println(ans);
    }
}
