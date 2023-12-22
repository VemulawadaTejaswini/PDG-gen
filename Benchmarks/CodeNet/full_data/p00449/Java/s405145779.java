import java.util.Scanner;

public class Main {

	static int a,b;

	public static void main(String args[]){

		Scanner s=new Scanner(System.in);
		while(true){
			a=s.nextInt();
			b=s.nextInt();
			if(a==0)System.exit(0);
			int[][] map = new int[a+1][a+1];
			for(int i=1; i<=a; i++) {
				for(int j=1; j<=a; j++) {
					map[i][j] = 1<<25;
					if(i==j)map[i][j]=0;
				}
			}

			for(int n=0; n<b; n++) {
				int c = s.nextInt();
				if(c==1) {
					int p = s.nextInt();
					int q = s.nextInt();
					int w = s.nextInt();
					if(map[p][q]<=w)continue;
					map[p][q] =  w;
					map[q][p] = w;

					for(int k=1; k<=a; k++) {
						for(int i=1; i<=a; i++) {
							for(int j=1; j<=a; j++) {
								if(map[i][j]>map[i][k]+map[k][j]) {
									map[i][j]=map[i][k]+map[k][j];
								}
							}
						}
					}
				} else  {
					int x=s.nextInt();
					int y=s.nextInt();
					if(map[x][y]==1<<25) {
						System.out.println(-1);
					} else {
						System.out.println(map[x][y]);
					}
				}
			}
		}
	}

}

