import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] c = new char[N];
		String S = sc.next();
		
		
		for(int i=0; i<N; i++) {
			c[i] = S.charAt(i);
		}
		
		int cnt = 0;
		int bCnt = 0;
		for(int i=0; i<N-1; i++) {
			if(c[i] == '#') bCnt++;
			
			if(c[i] == '#' && c[i+1] == '.') {
				int wCnt = 0;
				int j = i+1;
				while(j < N && c[j] == '.') {
					wCnt++;
					j++;
				}
				
				if(wCnt == bCnt || wCnt > bCnt) {
					//modify white and reset bCnt
					for(int k=i-bCnt+1; k<=i; k++) {
						c[k] = '.';
						cnt++;
						bCnt = 0;
					}
				} else {
					for(int l=i+1; l<i+1+wCnt; l++) {
						c[l] = '#';
						cnt++;
					}
				}
				
			}
		}
		
		System.out.println(cnt);
	}
}