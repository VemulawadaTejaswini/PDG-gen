import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int tx = sc.nextInt();
		int ty = sc.nextInt();

		int x1 = sx;
		int y1 = sy;
		int x2 = tx;
		int y2 = ty;
		for(int i = 1; i <= 4; i++){
			while(true){
				if(x1 == x2){
					break;
				}else if(x1 < x2){
					System.out.print("R");
					x1++;
				}else{
					System.out.print("L");
					x1--;
				}
			}
			while(true){
				if(y1 == y2){
					break;
				}else if(y1 < y2){
					System.out.print("U");
					y1++;
				}else{
					System.out.print("D");
					y1--;
				}
			}
			if(i % 2 == 1){
				x1 = tx;
				y1 = ty;
				x2 = sx;
				y2 = sy;
			}else{
				x1 = sx;
				y1 = sy;
				x2 = tx;
				y2 = ty;
			}
		}
		//経路データ作成

		//重複座標リスト作成
		//最短経路選別

		sc.close();
	}
}
