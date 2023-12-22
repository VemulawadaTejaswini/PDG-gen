import java.util.Scanner;

class Main{
	public static void main(String[] aegs) {
		Scanner sc=new Scanner(System.in);

		while(true) {
			int H=sc.nextInt();
			int W=sc.nextInt();
			if(H*W==0) {
				System.exit(0);
			}
			else {
				int[][] meiro=new int[H+2][W+2];
				int[] vectorx= {1,0,-1,0};
				int[] vectory= {0,-1,0,1};		// migi ue hidari sita
				char[] vec= {'>','^','<','v'};
				boolean[][] visited=new boolean[H+2][W+2];
				int x=1;
				int y=1;
				boolean end=false;
				String[] me=new String[H+2];
				for(int i=0; i<H+2; i++) {
					me[0]=me[0]+".";
					me[H+1]=me[H+1]+".";
				}
				for(int i=0; i<H; i++) {
					me[i+1]="."+sc.next()+".";
				}

				for(int i=0; i<H+2; i++) {
					for(int j=0; j<W+2; j++) {
						if(me[i].charAt(j)=='.') {
							meiro[i][j]=4;
						}
						else {
							for(int k=0; k<4; k++) {
								if(me[i].charAt(j)==vec[k]) {
									meiro[i][j]=k;
								}
							}
						}
					}
				}

				while(true) {
					if(visited[y][x]==true) {
						System.out.println("LOOP");
						break;
					}
					else {
						visited[y][x]=true;
						if(meiro[y][x]==4) {
							end=true;
							System.out.println((x-1)+" "+(y-1));
							break;
						}
						else {
							x=x+vectorx[meiro[y][x]];
							y=y+vectory[meiro[y][x]];
						}
					}
				}
			}
		}
	}
}
