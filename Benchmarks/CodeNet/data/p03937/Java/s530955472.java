import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] a = new char[H][];
		for(int i=0; i<H; i++) {
			a[i] = sc.next().toCharArray();
		}
		
		boolean ok = true;
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				if(a[i][j]=='#') {
					int cnt = 0;
					if(i>0 && a[i-1][j]=='#')
						cnt++;
					if(j>0 && a[i][j-1]=='#')
						cnt++;
					if(cnt>=2)
						ok = false;
				}
			}
		}
		
		System.out.println(ok ? "Possible" : "Impossible");
		sc.close();
	}
}
