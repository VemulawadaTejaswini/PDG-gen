
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		String str=scan.next();
		int b=scan.nextInt();
		char ch=str.charAt(b);
		String ans="";
		for(int i=0;i<str.length();i++) {
			char chl=str.charAt(i);
			if(!(chl==ch)) {
				ans+="*";
			}
			else {
				ans+=chl;
			}
		}
		System.out.println(ans);
	}
}
