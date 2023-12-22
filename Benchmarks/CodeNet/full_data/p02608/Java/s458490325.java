

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count=0;

//		for(int i=1 ; i<=n ; i++) {
//			for(int x=1; x<=n ; x++) {
//				for(int y=1 ; y<=n ; y++) {
//					for(int z=1 ; z<=n ; z++) {
//						if(x*x + y*y + z*z + x*y + y*z + z*x == i) {
//							count++;
//						}
//					}
//				}
//			}
//			System.out.println(count);
//			count = 0;
//		}

//		for(int i=1 ; i<=n ; i++) {
//			for(int x=1; x<=n-3 ; x++) {
//				for(int y=1 ; y<=n - x*x -3 ; y++) {
//					for(int z=1 ; z<=n - x*x - y*y - x*y -3 ; z++) {
//						if(x*x + y*y + z*z + x*y + y*z + z*x == i) {
//							count++;
//						}
//					}
//				}
//			}
//			System.out.println(count);
//			count = 0;
//		}

		for(int i=1 ; i<=n ; i++) {
			for(int x=1; x<=n/2 ; x++) {
				for(int y=1 ; y<=n/2 ; y++) {
					for(int z=1 ; z<=n/2 ; z++) {
						if(x*x + y*y + z*z + x*y + y*z + z*x == i) {
							count++;
						}
					}
				}
			}
			System.out.println(count);
			count = 0;
		}



		scanner.close();

	}

}