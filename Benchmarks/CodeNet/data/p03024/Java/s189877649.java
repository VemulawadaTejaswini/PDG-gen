import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		int maru=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='o') {
				maru++;
			}
		}
		maru+=(15-str.length());
		if(maru>=8) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
