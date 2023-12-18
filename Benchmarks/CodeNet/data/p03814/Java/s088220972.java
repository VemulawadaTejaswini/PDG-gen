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

	int bg = s.indexOf("A");
	int ed = s.lastIndexOf("Z");

	out(ed - bg + 1);
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

    void out(char c)
    {
	System.out.print(c);
    }
    
    void out(String s)
    {
	System.out.println(s);
    }
}
