import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		char g[][] = new char[h+2][w+2];
		for(int i=0; i<h+2; i++) {
			g[i][0]='.';
			g[i][w+1]='.';
		}
		for(int i=0; i<w+2; i++) {
			g[0][i]='.';
			g[h+1][i]='.';
		}
		for(int i=1; i<=h; i++) {
			String s = sc.next();
			for(int j=1; j<=w; j++) {
				g[i][j]=s.charAt(j-1);
			}
		}

		boolean ok=true;
		for(int i=1; i<=h; i++) {
			for(int j=1; j<=w; j++) {
				if(g[i][j]=='#' && g[i][j+1]=='.' && g[i+1][j]=='.' && g[i][j-1]=='.' && g[i-1][j]=='.') {
					ok=false;
					break;
				}
			}
		}
		if(ok)System.out.println("Yes");
		else System.out.println("No");
		sc.close();
	}
}
