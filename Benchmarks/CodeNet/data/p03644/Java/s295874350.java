import java.util.Scanner;

public class Main
{
    int n;
    int ans = 1;
    
    public static void main(String args[])
    {
	new Main().run();
    }
    
    void run()
    {
	in();

	int mx = 0;
	for(int i = 1; i <= n; i++) {
	    int cnt = 0, m = i;
	    
	    while(m % 2 == 0) {
		cnt++;
		m /= 2;
	    }

	    if(mx < cnt) {
		mx = cnt;
		ans = i;
	    }
	}
	
	out();
    }

    void in()
    {
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
    }

    void out()
    {
	System.out.println(ans);
    }
}
