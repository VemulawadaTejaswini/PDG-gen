import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i, j;
		Scanner sc = new Scanner(System.in);
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		char[][] a = new char[w+2][h+2];
		for(i=1;i<=h;i++){
			System.arraycopy(sc.next().toCharArray(), 0, a[i], 1, w);
		}
		sc.close();
		char[] kuro = {'#', '$'};
		int cnt = 0;
		boolean loop = true;
		boolean f = false;
		while(loop) {
			for(i=1;i<=w;i++){
				for(j=1;j<=h;j++){
//					System.out.print(a[i][j]);
					if(a[i][j] == '.'
					&&(a[i][j-1] == kuro[cnt%2]
					|| a[i][j+1] == kuro[cnt%2]
					|| a[i-1][j] == kuro[cnt%2]
					|| a[i+1][j] == kuro[cnt%2])){
						a[i][j] = kuro[(cnt+1)%2];
						f = true;
					}
				}
//				System.out.println("");
			}
			if(f) {
				cnt++;
			} else {
				loop = false;
			}
			f = false;
		}
		System.out.println(cnt);
	}
}
