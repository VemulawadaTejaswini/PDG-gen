import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	int a[];
	int color;
	public void run() {
		Scanner sc = new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		int n=sc.nextInt();
		a = new int[n];
		color=0;
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}

		int ans[][] = new int[h][w];
		for(int i=0; i<h; i++) {
			if(i%2==0) {
				for(int j=0; j<w; j++) {
					ans[i][j]=nextc();
				}
			}else {
				for(int j=w-1; j>=0; j--) {
					ans[i][j]=nextc();
				}
			}
		}
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++) {
				if(j>0)System.out.print(" ");
				System.out.print(ans[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}

	public int nextc() {
		if(a[color]==0) {
			color++;
		}
		a[color]--;
		return color+1;
	}



}
