import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String s=scanner.next();
		StringBuilder sb=new StringBuilder(s);
		String sf=sb.reverse().toString();
		char[] ch=sf.toCharArray();
		String s2=String.valueOf(ch);
	
		for (int i=0;i<ch.length;i++) {
			if (ch[i]=='b') {
				ch[i]='d';
				continue;
			}
			if (ch[i]=='d') {
				ch[i]='b';
				continue;
			}
			if (ch[i]=='p') {
				ch[i]='q';
				continue;
			}
			if (ch[i]=='q') {
				ch[i]='p';
				continue;
			}
		}
		String s1=String.valueOf(ch);
		
		if (s1.equals(s)) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
	}
}