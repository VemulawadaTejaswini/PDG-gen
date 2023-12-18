import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int ans = 0;
		int start_with_B = 0;
		int end_with_A = 0;
		for(int i=0;i<n;i++) {
			String s = in.next();
			for(int j=0;j<s.length()-1;j++) {
				if(s.substring(j, j+2).equals("AB")) ans++;
			}
			if(s.charAt(0)=='B') start_with_B++;
			if(s.charAt(s.length()-1)=='A') end_with_A++;
		}
		ans += Math.min(end_with_A, start_with_B);
		if(Math.min(end_with_A, start_with_B)==n) ans--;
		System.out.println(ans);
		in.close();
	}

}
