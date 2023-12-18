import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		sc.close();
		
		int r = 1;
		while(L/(int)Math.pow(2,(r+1)) > 0) r++;
		
		int N = r + 1;
		StringBuilder sb = new StringBuilder();
		int cnt = 0;
		for(int i=0;i<r;i++) {
			sb.append((i+1) + " " + (i+2) + " " + 0 + "\n");
			sb.append((i+1) + " " + (i+2) + " " + (int)Math.pow(2, i) + "\n");
			cnt += 2;
		}
		
		int tmpMax = (int)Math.pow(2,r)-1;
		int rem = (L-1) - tmpMax;
		
		for(int i=25;i>=0;i--) {
			if(((rem>>i)&1)==1) {
				sb.append((i+1) + " " + N + " "  + (tmpMax+1) + "\n");
				tmpMax += (1<<i);
				cnt ++;
			}
		}
		
		System.out.println(N + " " + cnt);
		System.out.println(sb.toString());
	}
}