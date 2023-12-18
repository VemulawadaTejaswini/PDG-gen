
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		String str=scan.next();
		int rui[]=new int[a];
		int co=0;
		int kirikaeshi=0;
		for(int i=0;i<a;i++) {
			char ch=str.charAt(i);
			if(i<a-1) {
				char ch2=str.charAt(i+1);
				if(ch!=ch2) {
					kirikaeshi++;
				}
			}
			if(ch=='#') {
				co++;
			}
			rui[i]=co;
		}
		int len=str.length();
		if(kirikaeshi==0) {
			System.out.println(0);
			return;
		}
		if(kirikaeshi==1) {
			int min=0;
			min=Math.min(rui[a-1], len-rui[a-1]);
			System.out.println(min);
			return;
		}
		int ans=1145141919;
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
