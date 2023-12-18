import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String w = scan.next();
		scan.close();
		int cnt[]=new int[26];
		for(int i=0;i<26;i++) {
			cnt[i]=0;
		}
		for(int i=0;i<w.length();i++) {
			int suffix=w.charAt(i)-(int)'a';
			cnt[suffix]+=1;
		}
		int check=1;
		for(int i=0;i<26;i++) {
			if(cnt[i]%2!=0) {
				check=0;
				break;
			}
		}
		System.out.println((check==1)? "Yes":"No");
	}
}
