import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		int len;
		str=sc.next();
		len=str.length();	
		if(len==2) {
			System.out.println(str);
		}else {
			StringBuffer sb=new StringBuffer(str);
			System.out.println(sb.reverse());
		}
	}
}
