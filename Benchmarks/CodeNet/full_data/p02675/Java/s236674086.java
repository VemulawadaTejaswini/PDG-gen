import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N=sc.next();
		char[] s = N.toCharArray();
		int a=s.length;
		
		if(s[a-1]=='2'||s[a-1]=='4'||s[a-1]=='5'||s[a-1]=='7'||s[a-1]=='9') {
			System.out.println("hon");
		}
		else if(s[a-1]=='0'||s[a-1]=='1'||s[a-1]=='6'||s[a-1]=='8') {
			System.out.println("pon");
		}
		else {
			System.out.println("bon");
		}
		
		sc.close();
	}
}
