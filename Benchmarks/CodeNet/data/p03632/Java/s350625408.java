import java.util.Scanner;

public class Main
{
    int a, b, c, d;
    int ans = 0;
    
    public static void main(String args[])
    {
	new Main().run();
    }
    
    void run()
    {
	in();

	a = Math.max(a, c);
	b = Math.min(b, d);
	ans = b - a;
	
	out();
    }

    void in()
    {
	Scanner sc = new Scanner(System.in);

	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.nextInt();
	d = sc.nextInt();
    }

    void out()
    {
	System.out.println(ans < 0 ? 0 : ans);
    }
}
