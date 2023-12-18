
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		String str=scan.next();
		int rui[]=new int[a];
		int co=0;
		for(int i=0;i<a;i++) {
			char ch=str.charAt(i);
			if(ch=='#') {
				co++;
			}
			rui[i]=co;
		}
		if(rui[a-1]==a) {
			System.out.println(0);
			return;
		}
		int ans=1145141919;
		int len=str.length();
		for(int i=0;i<str.length();i++) {
			int change=rui[i];
			int nokori=len-i-1;
			int zerosum=rui[a-1]-rui[i];
			change+=nokori-zerosum;
			if(ans>change) {
				ans=change;
			}
		}
		System.out.println(ans);
	}
}
