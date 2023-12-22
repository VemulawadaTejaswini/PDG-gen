import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int r=0;
		int c=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='R')c++;
			else {
				r=Math.max(c, r);
				c=0;
			}
		}
		System.out.println(r);
	}

}
