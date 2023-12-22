import java.util.Scanner;
//終了処理の雛形
class Main{
	public void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str;
		int[][] kami;		// yoko tate
		kami=new int[14][14];
		int x=0,y=0,scale=0;
		int zerokosu=0;
		int maxkosa=0;

		while(sc.hasNext()) {
			str=sc.next().split(",");
			x=Integer.parseInt(str[0]);
			y=Integer.parseInt(str[1]);
			scale=Integer.parseInt(str[2]);

			if(scale==1) {
				kami[x+2][y+2]++;
				kami[x+3][y+2]++;
				kami[x+1][y+2]++;
				kami[x+2][y+1]++;
				kami[x+2][y+3]++;
			}

			else if(scale==2) {
				kami[x+2][y+2]++;
				kami[x+3][y+2]++;
				kami[x+1][y+2]++;
				kami[x+2][y+3]++;
				kami[x+3][y+3]++;
				kami[x+1][y+3]++;
				kami[x+2][y+1]++;
				kami[x+3][y+1]++;
				kami[x+1][y+1]++;
			}

			else if(scale==1) {
				kami[x+2][y+2]++;
				kami[x+3][y+2]++;
				kami[x+1][y+2]++;
				kami[x+2][y+3]++;
				kami[x+3][y+3]++;
				kami[x+1][y+3]++;
				kami[x+2][y+1]++;
				kami[x+3][y+1]++;
				kami[x+1][y+1]++;
				kami[x][y+2]++;
				kami[x+2][y]++;
				kami[x+4][y+2]++;
				kami[x+2][y+4]++;
			}
		}

		for(int i=2; i<12; i++) {
			for(int j=2; j<12; j++) {
				if(kami[i][j]==0) {
					zerokosu++;
				}
				else {
					if(kami[i][j]>maxkosa) {
						maxkosa=kami[i][j];
					}
				}
			}
		}
		System.out.println(zerokosu);
		System.out.println(maxkosa);
	}
}
