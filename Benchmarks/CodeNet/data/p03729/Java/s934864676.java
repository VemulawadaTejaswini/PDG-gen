import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		String a=stdIn.next();
		String b=stdIn.next();
		String c=stdIn.next();
		int a1=a.length();
		int b1=b.length();
		int c1=c.length();
		String e="";
		String f;
		e=a.substring(a1-1,a1);
		f=b.substring(0,1);
		if(e.equals(f)){
			e=b.substring(b1-1,b1);
			f=c.substring(0,1);
			if(e.equals(f))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		else
			System.out.println("NO");
	}
}
