import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;


public class Main
{
    int a, b, c;
    
    public static void main(String args[])
    {
	new Main().solve();
    }
    
    void solve()
    {
	in();

	boolean flg = false;
	int r = a % b;
	if(r == c) flg = true;
	for(int i = 2; r * i % b != r; i++) {
	    if(r * i % b == c) flg = true;
	}
	
	if(flg) out("YES");
	else    out("NO");
    }

    void in()
    {
	Scanner sc = new Scanner(System.in);

	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.nextInt();
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
