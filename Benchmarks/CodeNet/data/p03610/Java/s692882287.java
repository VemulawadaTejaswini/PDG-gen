import java.util.Scanner;

public class Main
{
    String s;

    public static void main(String args[])
    {
	new Main().run();
    }
    
    void run()
    {
	in();
	
	for(int i = 0; i < s.length(); i += 2) {
	    System.out.print(s.substring(i, i + 1));
	}
	System.out.println();
    }

    void in()
    {
	Scanner sc = new Scanner(System.in);

	s = sc.next();
    }
}
