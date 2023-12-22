import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
	String s=sc.next();
	String c[]=new String[s.length()];
	String ans="";
	for(int i=0;i<s.length();i++) {
		c[i]=String.valueOf(s.charAt(i));
	}
	for(int i=0;i<s.length();i++) {
		if(c[i].equals("?")) {
			c[i]="D";
		}
	}
	for(int i=0;i<s.length();i++) {
	StringBuilder buf = new StringBuilder();
	buf.append(ans);
	buf.append(c[i]);
	ans = buf.toString();
	}
	System.out.println(ans);
	}
}