import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main
{
    String str;
    
    public static void main(String args[])
    {
	new Main().solve();
    }
    
    void solve()
    {
	in();

	int ans = 1;
	
	for(int i = str.length() - 1; i > 0; i--) {
	    if(i % 2 == 1) continue;
	    String s = str.substring(0, i);

	    String l = s.substring(0, i / 2);
	    String r = s.substring(i / 2, i);
	    if(l.equals(r)) {
		ans = i;
		break;
	    }
	}
	 	
	out(ans);
    }

    void in()
    {
	Scanner sc = new Scanner(System.in);
	str = sc.next();
    }

    void out()
    {
	
    }
    
    void out(int ans)
    {
	System.out.println(ans);
    }
}
