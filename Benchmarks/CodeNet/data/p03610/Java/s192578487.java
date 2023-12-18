import java.util.Scanner;

public class Main
{
    String s;
    String ans = "";
    
    public static void main(String args[])
    {
	new Main().run();
    }
    
    void run()
    {
	in();
	
	for(int i = 0; i < s.length(); i += 2) {
	    ans += s.substring(i, i + 1);
	}
	
	out();
    }

    void in()
    {
	Scanner sc = new Scanner(System.in);

	s = sc.next();
    }

    void out()
    {
	System.out.println(ans);
    }
}
