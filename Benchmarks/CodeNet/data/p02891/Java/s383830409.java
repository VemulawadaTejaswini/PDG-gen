import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ch = sc.next().toCharArray();
		int k = sc.nextInt();
		sc.close();

		long cnt = 0;
		int cnt2 = 0;
		for(int i = 0;i < ch.length;i++) {
			if(ch[i] == ch[0]) {
				cnt2++;
			}else {
				break;
			}
		}
		for(int i = 0;i < ch.length -1;i++) {
			if(ch[i]==ch[i+1]) {
				cnt++;
				ch[i+1]='\\';
			}
		}
		long flg = 0;
		if(ch[0]==ch[ch.length-1]) {
			flg++;
			if(cnt2>0 && cnt2%2==0) {
				flg--;
			}
		}
		if(ch.length==1) {
			System.out.println(k/2);
			return;
		}
		if(ch.length==cnt2) {
			System.out.println(k*ch.length/2);
			return;
		}
		System.out.println(cnt*k+flg*(k-1));
	}
}