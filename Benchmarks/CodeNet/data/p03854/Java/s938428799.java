import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		if (judge(s)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
	
	public static boolean judge(String s) {
		if (s.equals("")) {
			return true;
		}
		
		boolean f = false;
		
		if (s.length() >= 7 && s.substring(0, 7).equals("dreamer")) {
			f |= judge(s.substring(7));
		} 
		if(s.length() >= 5 &&  s.substring(0, 5).equals("dream")) {
			f |= judge(s.substring(5));
		} 
		if(s.length() >= 6 &&  s.substring(0, 6).equals("eraser")) {
			f |= judge(s.substring(6));
		} 
		if(s.length() >= 5 &&  s.substring(0, 5).equals("erase")) {
			f |= judge(s.substring(5));
		} 
		
		return f;
	}
}