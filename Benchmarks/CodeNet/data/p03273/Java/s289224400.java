import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h=scan.nextInt();
		int w=scan.nextInt();
		int hcheck[]=new int[h];
		int wcheck[]=new int[w];
		int grid[][]=new int[h][w];
		for(int i=0;i<h;i++) {
			String str = scan.next();
			hcheck[i]=1;
			int sum=0;
			for(int j=0;j<w;j++) {
				if(str.charAt(j)=='.')grid[i][j]=0;
				else grid[i][j]=1;

				sum+=grid[i][j];
			}
			if(sum==0)hcheck[i]=0;
		}
		scan.close();
		for(int i=0;i<w;i++) {
			wcheck[i]=1;
			int sum=0;
			for(int j=0;j<h;j++) {
				sum+=grid[j][i];
			}
			if(sum==0)wcheck[i]=0;
		}

		for(int i=0;i<h;i++) {
			if(hcheck[i]==1) {
				for(int j=0;j<w;j++) {
					if(wcheck[j]==1)System.out.print((grid[i][j]==1)? "#":".");
				}
				System.out.println();
			}
		}
	}
}