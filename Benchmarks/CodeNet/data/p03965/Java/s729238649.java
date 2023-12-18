import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int fr=0, fp=0, sr=0, sp=0;
		for (char ch : sc.next().toCharArray()) {
			switch (ch) {
				case 'g': sr++; break;
				case 'p': sp++; break;					
			}
			if (fp+1<=fr && sp<=sr) fp++;	
			else fr++;
		}
		System.out.println((fp-sp>0) ? fp-sp : 0);
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}