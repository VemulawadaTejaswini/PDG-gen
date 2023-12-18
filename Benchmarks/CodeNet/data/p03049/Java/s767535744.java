import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int ans = 0;
		int A = 0, B = 0;
		boolean minus = true;
		String[] str = new String[N];
		scn.nextLine();
		for(int i = 0;i < N;i++) {
			String buf = scn.nextLine();
			char[] ch = buf.toCharArray();
			boolean isA = false;
			for(int j = 0;j < ch.length;j++) {
				if(j == 0) {
					if(ch[j]=='B')B++;
				}
				if(j == ch.length-1) {
					if(ch[j] == 'A')A++;
					if(B!=A)minus = false;
				}
				if(isA) {
					if(ch[j]=='B') ans++;
				}

				if(ch[j]=='A') {
					isA = true;
				}else {
					isA = false;
				}
			}
		}
		ans+= Math.min(A, B);
		if(minus&&A!=0)ans--;
		System.out.println(ans);

	}

}
