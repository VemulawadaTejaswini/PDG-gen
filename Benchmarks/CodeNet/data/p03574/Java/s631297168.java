import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String[] HLine = new String[H];
		for(int h = 0;h < H;h++) {
			HLine[h] = sc.next();
		}
		String[][] HW = new String[H][W];
		for(int h = 0;h < H;h++) {
			String[] HLineSplit = HLine[h].split("");
			for(int w = 0;w < W;w++) {
			//System.out.println(HW[h][w]);

			HW[h][w] = HLineSplit[w];
			//System.out.print(HW[h][w]);

			}
		}

		for(int h = 0;h < H;h++) {
			for(int w = 0;w < W;w++) {
				if(HW[h][w].equals("#")) {

				}else {
				HW[h][w] = "0";
				}

			}
		}
		for(int h = 0;h < H;h++) {
			for(int w = 0;w < W;w++) {
				if(HW[h][w].equals("#")) {
					if(h==0 && w==0) {
					//HW[h-1][w]
						if(!(HW[h][w+1].equals("#"))) {
							HW[h][w+1] = String.valueOf(Integer.parseInt(HW[h][w+1])+1);
						}
						if(!(HW[h+1][w].equals("#"))) {
							HW[h+1][w] = String.valueOf(Integer.parseInt(HW[h+1][w])+1);
						}
						if(!(HW[h+1][w+1].equals("#"))) {
							HW[h+1][w+1] = String.valueOf(Integer.parseInt(HW[h+1][w+1])+1);
						}
					}else if(h==0 && w==W-1) {
						//中央
						if(!(HW[h][w-1].equals("#"))) {
							HW[h][w-1] = String.valueOf(Integer.parseInt(HW[h][w-1])+1);
						}
						//下
						if(!(HW[h+1][w-1].equals("#"))) {
							HW[h+1][w-1] = String.valueOf(Integer.parseInt(HW[h+1][w-1])+1);
						}
						if(!(HW[h+1][w].equals("#"))) {
							HW[h+1][w] = String.valueOf(Integer.parseInt(HW[h+1][w])+1);
						}

					}else if(h==H-1 && w==0) {
						if(!(HW[h-1][w].equals("#"))) {
							HW[h-1][w] = String.valueOf(Integer.parseInt(HW[h-1][w])+1);
						}
						if(!(HW[h-1][w+1].equals("#"))) {
							HW[h-1][w+1] = String.valueOf(Integer.parseInt(HW[h-1][w+1])+1);
						}
						if(!(HW[h][w+1].equals("#"))) {
							HW[h][w+1] = String.valueOf(Integer.parseInt(HW[h][w+1])+1);
						}
					}else if(h==H-1 && w==W-1) {
						if(!(HW[h-1][w-1].equals("#"))) {
							HW[h-1][w-1] = String.valueOf(Integer.parseInt(HW[h-1][w-1])+1);
						}
						if(!(HW[h-1][w].equals("#"))) {
							HW[h-1][w] = String.valueOf(Integer.parseInt(HW[h-1][w])+1);
						}
						if(!(HW[h][w-1].equals("#"))) {
							HW[h][w-1] = String.valueOf(Integer.parseInt(HW[h][w-1])+1);
						}



					}else if(h == 0 && w > 0 && w < W-1){
						//中央
						if(!(HW[h][w-1].equals("#"))) {
							HW[h][w-1] = String.valueOf(Integer.parseInt(HW[h][w-1])+1);
						}

						if(!(HW[h][w+1].equals("#"))) {
							HW[h][w+1] = String.valueOf(Integer.parseInt(HW[h][w+1])+1);
						}
						//下
						if(!(HW[h+1][w-1].equals("#"))) {
							HW[h+1][w-1] = String.valueOf(Integer.parseInt(HW[h+1][w-1])+1);
						}
						if(!(HW[h+1][w].equals("#"))) {
							HW[h+1][w] = String.valueOf(Integer.parseInt(HW[h+1][w])+1);
						}
						if(!(HW[h+1][w+1].equals("#"))) {
							HW[h+1][w+1] = String.valueOf(Integer.parseInt(HW[h+1][w+1])+1);
						}

					}else if(w == 0 && h > 0 && h < H-1){
						if(!(HW[h-1][w].equals("#"))) {
							HW[h-1][w] = String.valueOf(Integer.parseInt(HW[h-1][w])+1);
						}
						if(!(HW[h-1][w+1].equals("#"))) {
							HW[h-1][w+1] = String.valueOf(Integer.parseInt(HW[h-1][w+1])+1);
						}
						if(!(HW[h][w+1].equals("#"))) {
							HW[h][w+1] = String.valueOf(Integer.parseInt(HW[h][w+1])+1);
						}
						if(!(HW[h+1][w].equals("#"))) {
							HW[h+1][w] = String.valueOf(Integer.parseInt(HW[h+1][w])+1);
						}
						if(!(HW[h+1][w+1].equals("#"))) {
							HW[h+1][w+1] = String.valueOf(Integer.parseInt(HW[h+1][w+1])+1);
						}
					}else if(h == H-1 && w > 0 && w < W-1){
						//中央
						if(!(HW[h][w-1].equals("#"))) {
							HW[h][w-1] = String.valueOf(Integer.parseInt(HW[h][w-1])+1);
						}

						if(!(HW[h][w+1].equals("#"))) {
							HW[h][w+1] = String.valueOf(Integer.parseInt(HW[h][w+1])+1);
						}
						//上
						if(!(HW[h-1][w-1].equals("#"))) {
							HW[h-1][w-1] = String.valueOf(Integer.parseInt(HW[h-1][w-1])+1);
						}
						if(!(HW[h-1][w].equals("#"))) {
							HW[h-1][w] = String.valueOf(Integer.parseInt(HW[h-1][w])+1);
						}
						if(!(HW[h-1][w+1].equals("#"))) {
							HW[h-1][w+1] = String.valueOf(Integer.parseInt(HW[h-1][w+1])+1);
						}
					}else if(w == W-1 && h > 0 && h < H-1){
						//上
						if(!(HW[h-1][w-1].equals("#"))) {
							HW[h-1][w-1] = String.valueOf(Integer.parseInt(HW[h-1][w-1])+1);
						}
						if(!(HW[h-1][w].equals("#"))) {
							HW[h-1][w] = String.valueOf(Integer.parseInt(HW[h-1][w])+1);
						}
						//中央
						if(!(HW[h][w-1].equals("#"))) {
							HW[h][w-1] = String.valueOf(Integer.parseInt(HW[h][w-1])+1);
						}
						if(!(HW[h+1][w-1].equals("#"))) {
							HW[h+1][w-1] = String.valueOf(Integer.parseInt(HW[h+1][w-1])+1);
						}
						if(!(HW[h+1][w].equals("#"))) {
							HW[h+1][w] = String.valueOf(Integer.parseInt(HW[h+1][w])+1);
						}
					}else {
						//上
						if(!(HW[h-1][w-1].equals("#"))) {
							HW[h-1][w-1] = String.valueOf(Integer.parseInt(HW[h-1][w-1])+1);
						}
						if(!(HW[h-1][w].equals("#"))) {
							HW[h-1][w] = String.valueOf(Integer.parseInt(HW[h-1][w])+1);
						}
						if(!(HW[h-1][w+1].equals("#"))) {
							HW[h-1][w+1] = String.valueOf(Integer.parseInt(HW[h-1][w+1])+1);
						}

						//中央
						if(!(HW[h][w-1].equals("#"))) {
							HW[h][w-1] = String.valueOf(Integer.parseInt(HW[h][w-1])+1);
						}

						if(!(HW[h][w+1].equals("#"))) {
							HW[h][w+1] = String.valueOf(Integer.parseInt(HW[h][w+1])+1);
						}

						//下
						if(!(HW[h+1][w-1].equals("#"))) {
							HW[h+1][w-1] = String.valueOf(Integer.parseInt(HW[h+1][w-1])+1);
						}
						if(!(HW[h+1][w].equals("#"))) {
							HW[h+1][w] = String.valueOf(Integer.parseInt(HW[h+1][w])+1);
						}
						if(!(HW[h+1][w+1].equals("#"))) {
							HW[h+1][w+1] = String.valueOf(Integer.parseInt(HW[h+1][w+1])+1);
						}
					}
				}



			}
		}
		for(int h = 0;h < H;h++) {
			for(int w = 0;w < W;w++) {
				System.out.print(HW[h][w]);
			}
			System.out.println();
		}


//		for(int w = 0;w < W;w++) {
//
//		HW[0][w] = sc.next();
//
//		}

//		char a = '1';
//		System.out.println(a);
	}

}