
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		int cnt0=0,cnt1=0;
		char alt0='0',alt1='1';
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==alt0) {
				cnt1++;
			}else {
				cnt0++;
			}
			if(alt0=='0') {
				alt0='1';
				alt1='0';
			}else {
				alt0='0';
				alt1='1';
			}
		}
		System.out.println(Math.min(cnt0, cnt1));
	}

}
