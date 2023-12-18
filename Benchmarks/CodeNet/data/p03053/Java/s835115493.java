import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int H = sc.nextInt();
		int W = sc.nextInt();

		int a[][] = new int[H][W] ;

		for(int i = 0 ; i < H ; i ++) {
			String bw = sc.next();
			for(int j = 0 ; j < W ; j ++) {
				if(bw.charAt(j) == '.') {
					a[i][j] = 0 ;	//白 = 0
				}else {
					a[i][j] = 1 ;	//黒 = 1
				}
			}
		}
//		for(int i = 0 ; i < H ; i ++) {
//			for(int j = 0 ; j < W ; j ++) {
//				if(a[i][j] == 0) {
//					System.out.print("白");
//				}else {
//					System.out.print("黒");
//				}
//			}
//			System.out.println();
//		}
//
		int count = 0 ;
		boolean loop = true ;
		while(loop) {
			loop = false ;
			count ++ ;
			int work[][] = new int[H][W] ;
			for(int i = 0 ; i < H ; i ++) {
				for(int j = 0 ; j < W ; j ++) {
					work[i][j] = 0 ;
					if(a[i][j] == 0) {
						if(j + 1 < W && a[i][j + 1] == 1) {//右
							work[i][j] = 1 ;
						}else if( 0 < i && a[i - 1][j] == 1) {//上
							work[i][j] = 1 ;
						}else if( 0 < j  && a[i][j - 1] == 1) {//左
							work[i][j] = 1 ;
						}else if(i + 1 < H && a[i + 1][j] == 1) {//下
							work[i][j] = 1 ;
						}
					}else {
						work[i][j] = 1 ;
					}
					if(work[i][j] == 0) {
						loop = true ;
					}
				}
			}
			a = work ;
//			System.out.println("**********************");
//			for(int i = 0 ; i < H ; i ++) {
//				for(int j = 0 ; j < W ; j ++) {
//					if(a[i][j] == 0) {
//						System.out.print("白");
//					}else {
//						System.out.print("黒");
//					}
//				}
//				System.out.println();
//			}
		}



		// 出力
		System.out.println(count);

	}

}
