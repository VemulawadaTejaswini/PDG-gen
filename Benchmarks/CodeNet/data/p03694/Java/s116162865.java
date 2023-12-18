import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main
{
    int n;
    int a[] = new int[101];
    
    public static void main(String args[])
    {
	new Main().solve();
    }
    
    void solve()
    {
	in();

	Arrays.sort(a, 0, n);
	
	out(a[n - 1] - a[0]);
    }

    void in()
    {
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	for(int i = 0; i < n; i++) a[i] = sc.nextInt();
    }

    void out()
    {
	
    }
    
    void out(int ans)
    {
	System.out.println(ans);
    }
}
