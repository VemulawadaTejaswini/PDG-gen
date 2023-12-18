import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int n = str.length();
		
		boolean flag = true;
		StringBuffer sb = new StringBuffer(str);
		String dst = sb.reverse().toString();
		if(!dst.equals(str))flag = false;
		
		int x =(n-1)/2;
		int y =(n+3)/2;

		sb = new StringBuffer(str.substring(0, x));
		dst = sb.reverse().toString();
		if(!dst.equals(str.substring(0, x)))flag = false;

		sb = new StringBuffer(str.substring(y - 1, n));
		dst = sb.reverse().toString();
		if(!dst.equals(str.substring(y - 1, n)))flag = false;
		
		System.out.println(((flag)?"Yes":"No"));
	}
}