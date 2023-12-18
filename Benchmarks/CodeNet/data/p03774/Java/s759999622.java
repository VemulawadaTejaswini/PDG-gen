import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;

public class Main
{
    int n, m;
    int nx[] = new int[51];
    int ny[] = new int[51];
    int mx[] = new int[51];
    int my[] = new int[51];
    
    public static void main(String args[])
    {
	new Main().solve();
    }
    
    void solve()
    {
	in();

	for(int i = 0; i < n; i++) {

	    int l = 1 << 30;
	    int cp = 0;

	    for(int j = 0; j < m; j++) {
		int tmp = Math.abs(nx[i] - mx[j]) + Math.abs(ny[i] - my[j]);
		if(l > tmp) {
		    l = tmp;
		    cp = j + 1;
		}
	    }

	    out(cp);
	    
	}
    }

    void in()
    {
	Scanner sc = new Scanner(System.in);

	n = sc.nextInt();
	m = sc.nextInt();
	for(int i = 0; i < n; i++) {
	    nx[i] = sc.nextInt();
	    ny[i] = sc.nextInt();
	}
	for(int i = 0; i < m; i++) {
	    mx[i] = sc.nextInt();
	    my[i] = sc.nextInt();
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
