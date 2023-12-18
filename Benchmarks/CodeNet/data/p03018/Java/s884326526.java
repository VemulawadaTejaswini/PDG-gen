import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char[] ch = scn.nextLine().toCharArray();
		int l = ch.length;
		int ans = 0;
		int A = 0;

		boolean B = false;
		for(int i = 0;i < l;i++) {
			if(B) {
				if(ch[i] == 'C') {
					ans += A;
					B = false;
				}
				if(ch[i] == 'A') {
					A = 1;
					B = false;
				}
				if(ch[i] == 'B') {
					A = 0;
				}
			}else {
				if(ch[i] == 'A') {
					A++;
				}
				if(ch[i] == 'B') {
					B = true;
				}
				if(ch[i] == 'C') {
					A = 0;
				}
			}
		}
		System.out.println(ans);
	}

}
