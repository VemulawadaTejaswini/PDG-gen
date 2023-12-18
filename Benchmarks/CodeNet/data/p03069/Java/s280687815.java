
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		String str=scan.next();
		int ans=0;
		int point=0;
		int hash=0;
		for(int i=0;i<str.length()-1;i++) {
			char ch=str.charAt(i);
			if(ch=='#') {
				if(point!=0) {
					ans+=Math.max(hash, point);
					point=0;
					hash=0;
				}
				hash++;
			}
			else {
				point++;
			}
		}
		if(str.charAt(str.length()-1)=='.') {
			point++;
			ans+=Math.min(hash, point);
		}
		else {
			hash++;
			ans+=Math.min(hash, point);
		}
		System.out.println(ans);
	}
}
