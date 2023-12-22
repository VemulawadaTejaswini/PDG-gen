import java.util.Scanner;

class Main {
	public static int h,w;

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			h = sc.nextInt();
			w = sc.nextInt();
			int[][] map = new int[h][w];

			for (int i=0; i<h; i++) {  //mapの読み込み
				for (int j=0; j<w; j++) {
					map[i][j] = sc.nextInt();
				}
			}

			int min = findShorten(map,Integer.MAX_VALUE,0,false,0,0,"","");

			System.out.println(min);

		}
	}

	public static int findShorten(int[][] map,int min,int count,boolean flagTree, int x, int y, String way,String way2) {  //マップ/最小値/木フラグ/今の位置(x,y)/今までの道
		if ((x==0)&&(y==0)&&(map[h-1][w-1]==0)) {  //スタートに戻った&&終点の木がなくなった
			min = Math.min(min, count);
			//System.out.println("おめでとう");
		} else {
			if (count > min) return min;  //最小値より大きかったら中断
			int[][] m = new int[h][w];
			for (int i=0; i<h; i++) {  //mapのコピー
				for (int j=0; j<w; j++) {
					m[i][j] = map[i][j];
				}
			}
			if (map[x][y] >= 0){
				if (map[x][y] > 0) {
					flagTree = true;
					way=way2;
					count--;
				}
				m[x][y]--;
			} else m[x][y]=0;
			count++;
			if ((x == 0)&&(y==0)) {
				 flagTree = false;  //木材加工工場に木をおろす
				 way=way2;
				 m[x][y]=-1;
			}

			/*			System.out.println("posit:::::" + x + " / " + y + "    "+ way+way.length()+ " ||||||| " + way2 + "  " +flagTree + "   count::::" + count +" / " + min);
						for (int i=0; i<h; i++) {  //mapのコピー
							for (int j=0; j<w; j++) {
								System.out.print(m[i][j]);
							}
							System.out.println();
						}*/

			String W = "";
			if (flagTree) {  //木持っている時
				if (way.length()>0) W = way.substring(way.length()-1);  //最後の文字
				//System.out.println(W);
				switch(W) {  //前の位置に戻る
					case "D":  //下だった→上
						//System.out.println("Next to U");
						if (way.length()>1)	min = findShorten(m,min,count,flagTree,x-1,y,way.substring(0,way.length()-1),way2);
						else min = findShorten(m,min,count,flagTree,x-1,y,way,way2);
						break;
					case "U":  //上だった→下
						//System.out.println("Next to D");
						if (way.length()>1)	min = findShorten(m,min,count,flagTree,x+1,y,way.substring(0,way.length()-1),way2);
						else min = findShorten(m,min,count,flagTree,x+1,y,way,way2);
						break;
					case "R":  //右だった→左
						//System.out.println("Next to L");
						if (way.length()>1)	min = findShorten(m,min,count,flagTree,x,y-1,way.substring(0,way.length()-1),way2);
						else min = findShorten(m,min,count,flagTree,x,y-1,way,way2);
						break;
					case "L":  //左だった→右
						//System.out.println("Next to R");
						if (way.length()>1)	min = findShorten(m,min,count,flagTree,x,y+1,way.substring(0,way.length()-1),way2);
						else min = findShorten(m,min,count,flagTree,x,y+1,way,way2);
						break;
				}
			} else { //木持ってない時
				if (way.length()>0) {
					W = way.substring(0,1); //最初の文字
					//System.out.println(W);
					switch(W) {
					case "U":  //上
						//System.out.println("Next to U");
						min = findShorten(m,min,count,flagTree,x-1,y,way.substring(1),way2);
						break;
					case "D":  //下
						//System.out.println("Next to D");
						min = findShorten(m,min,count,flagTree,x+1,y,way.substring(1),way2);
						break;
					case "L":  //左
						//System.out.println("Next to L");
						min = findShorten(m,min,count,flagTree,x,y-1,way.substring(1),way2);
						break;
					case "R":  //右
						//System.out.println("Next to R");
						min = findShorten(m,min,count,flagTree,x,y+1,way.substring(1),way2);
						break;
					}
				} else {  //行き先が決まってなかったら
					for (int i=0; i<4; i++) {  //4方向
						switch (i) {
						case 0:  //上
							if (x!=0) {
								if (!((x-1==0)&&(y==0))&&(m[x-1][y] >= 0)) min = findShorten(m,min,count,flagTree,x-1,y,way+'U',way2+'U');  //前の位置と工場に戻ることができない
							}
							break;
						case 1:  //下
							if (x!=h-1) {
								if (m[x+1][y] >= 0) min = findShorten(m,min,count,flagTree,x+1,y,way+'D',way2+'D');  //前の位置に戻ることができない
							}
							break;
						case 2:  //左
							if (y!=0) {
								if (!((x==0)&&(y-1==0))&&(m[x][y-1] >= 0)) min = findShorten(m,min,count,flagTree,x,y-1,way+'L',way2+'L');  //前の位置と工場に戻ることができない
								
							}
							break;
						case 3:  //右
							if (y!=w-1) {
								if (m[x][y+1] >= 0) min = findShorten(m,min,count,flagTree,x,y+1,way+'R',way2+'R');  //前の位置に戻ることができない
							}
							break;
						}
					}
				}
			}
		}
		return min;
	}
}

