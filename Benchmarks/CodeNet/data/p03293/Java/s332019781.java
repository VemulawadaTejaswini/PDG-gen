import java.util.*;
public class Main {

	String rotated(String s, int i , int length)
	{
	String beg = s.substring(0, i);
	String end = s.substring( i , length);
	String last = end+ beg;
	return last;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Main one = new Main();
		String a, b;
		a = scan.next();
		b= scan.next();
		int alength = a.length();
//		System.out.println(one.rotated(a, alength-1, alength));
		boolean found = false;
		for( int i=0; i<alength ;i++)
			{
				if(a.charAt(i)==b.charAt(0))
				{
					String compare = one.rotated(a, i, alength);
					if(compare.equals(b))
					{
						found = true;
						break;
					}
				}
			
			}
		if(found)
			System.out.println("Yes");
		else
			System.out.println("No");

	
		scan.close();
	}

}
