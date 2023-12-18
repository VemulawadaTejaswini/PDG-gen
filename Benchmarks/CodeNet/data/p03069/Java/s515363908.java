
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		String str=scan.next();
		int ans=0;
		for(int i=0;i<str.length()-1;i++) {
			char ch=str.charAt(i);
			char ch2=str.charAt(i+1);
			if(ch=='#'&&ch2=='.') {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
