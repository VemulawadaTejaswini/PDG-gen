import java.util.*;
public class Main {

	public static void main(String[] args) {		
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		String t = scn.next();
		int min = t.length();
		for(int i=t.length()-1;i>=0;i--)
		{
			if(s.contains(t.substring(0,i))) {
				int val = t.length()-i;
			//	System.out.println(val);
				if(min>val)
					min= val;
			}
		}
		for(int i=0;i<t.length();i++)
		{
			if(s.contains(t.substring(i))) {
				int val = i;
			//	System.out.println(t.substring(i)+" "+val);
				if(min>val)
					min= val;
			}
		}
		System.out.println(min);
	}

}
