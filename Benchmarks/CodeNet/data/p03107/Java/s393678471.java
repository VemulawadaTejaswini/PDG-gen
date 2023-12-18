import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		int Slen = S.length();
		int cnt0=0,cnt1=0;
		for(int i=0;i<Slen;i++) {
			if(S.substring(i,i+1).equals("0"))cnt0++;
			else cnt1++;
		}
		//System.out.println(cnt0+" "+cnt1);
		System.out.println(Slen-Math.abs(cnt0-cnt1));
	}
}
