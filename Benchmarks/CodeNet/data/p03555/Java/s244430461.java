import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String[] c = new String[2];
		c[0] = in.next();
		c[1] = in.next();
		if(c[0].charAt(0)==c[1].charAt(2)&&c[0].charAt(1)==c[1].charAt(1)&&c[0].charAt(2)==c[1].charAt(0))System.out.println("YES");
		else System.out.println("NO");
	}
}