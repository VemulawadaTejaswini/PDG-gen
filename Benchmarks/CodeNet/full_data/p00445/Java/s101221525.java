import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			char[] s = (cin.next()+"     ").toCharArray();
			int cnt1=0,cnt2=0;
			for(int i = 0;i<s.length-4;i++){
				if(s[i]=='I'&&s[i+1]=='O'&&s[i+2]=='I'){
					cnt2++;
				}
				if(s[i]=='J'&&s[i+1]=='O'&&s[i+2]=='I'){
					cnt1++;
				}
			}
			System.out.println(cnt1);
			System.out.println(cnt2);
		}

	}

}