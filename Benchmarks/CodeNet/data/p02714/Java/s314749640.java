import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		
		String S =cin.next();
		
		int r = 0,g = 0,b = 0;
		
		for(int i = 0;i<S.length();i++) {
			if(S.charAt(i)=='R') r++;
			if(S.charAt(i)=='G') g++;
			if(S.charAt(i)=='B') b++;
		}
		
		int A = r*g*b;
		int B = 0;
		
		for(int i = 0;i<N-2;i++) {
			for(int j = i+1;j<N-1;j++) {
				int k = 2*j-i;
				if(k>=N||k<=j) break;

				if((S.charAt(i)!=S.charAt(j))
						&&(S.charAt(j)!=S.charAt(k))
						&&(S.charAt(i)!=S.charAt(k))) {
					B++;
				}
			}
		}
		
		int ans = A-B;
		System.out.println(ans);
	}


}