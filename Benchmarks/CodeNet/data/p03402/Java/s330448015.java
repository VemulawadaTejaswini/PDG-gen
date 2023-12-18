import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		boolean re = false;
		if(a>b) {
			int tmp = a;
			a = b;
			b = tmp;
			re = true;
		}
		int ncol = 2*a+1;
		char g[][] = new char[100][ncol];
		int nrow = 1;

		if(a==b) {
			for(int i=0; i<2*a; i++) {
				System.out.print(i%2==0 ? "." : "#");
			}
			System.out.println();
			sc.close();
			return;
		}

		for(int i=0; i<ncol; i++) {
			if(i%2==0)	{
				g[0][i] = '#';
			}else {
				g[0][i] = '.';
			}
		}

		while(a+1<b) {
			for(int i=0; i<ncol; i++) {
				g[nrow][i]=g[nrow-1][i];
				g[nrow+1][i]=g[nrow-1][i];
			}
			if(a+1<b) {
				g[nrow][0]='.';
			}
			if(a+2<b) {
				g[nrow][ncol-1]='.';
			}
			a+=2;
			nrow+=2;
		}

		for(int i=0; i<nrow; i++) {
			for(int j=0; j<ncol; j++) {
				if(re) {
					if(g[i][j]=='.') {
						g[i][j]='#';
					}else {
						g[i][j]='.';
					}
				}
				System.out.print(g[i][j] + (j==ncol-1 ? "\n" : ""));
			}
		}
		sc.close();
	}
}
