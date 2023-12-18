import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main
{
    Map<String, Integer> map = new HashMap<>();
    
    public static void main(String args[])
    {
	new Main().run();
    }
    
    void run()
    {
	in();
	
	out();
    }

    void in()
    {
	String str;
	Scanner sc = new Scanner(System.in);
	str = sc.next();
	
	for(String c : str.split("")) map.put(c, 1);
    }

    void out()
    {
	for(String c : "abcdefghijklmnopqrstuvwxyz".split("")) {
	    if(map.get(c) == null) {
		System.out.println(c);
		break;
	    }
	    if(c.equals("z")) System.out.println("None");
	}
    }
}
