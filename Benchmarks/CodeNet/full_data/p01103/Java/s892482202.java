import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String input = br.readLine();

			String[] tmpArray = input.split(" ");
			int h = Integer.parseInt(tmpArray[0]);
			int w = Integer.parseInt(tmpArray[1]);

			if(h == 0 && w == 0){
				break;
			}

			int map[][] = new int[h][w];

			//init map
			for(int i = 0; i < h; i++){
				tmpArray = br.readLine().split(" ");

				for(int j = 0; j < w; j++){
					map[i][j] = Integer.parseInt(tmpArray[j]);
				}
			}

			int result = 0;

			for(int width = 3; width <= w; width++){
				for(int height = 3; height <= h; height++){
//					System.out.println("height "+height+" width "+width);



					for(int i = 0; i + height <= h; i++){
						for(int j = 0; j + width <= w; j++){
//							System.out.println("left top ("+j+", "+i+")");

							int outerMinHeight = 10;
							int innerMaxHeight = 0;
							int sumHeight = 0;

							for(int k = i; k < i + height; k++){
								for(int l = j; l < j + width; l++){
									if(k == i || k == i + height - 1 || l == j || l == j + width - 1){
										outerMinHeight = Math.min(outerMinHeight, map[k][l]);
									}
									else {
										innerMaxHeight = Math.max(innerMaxHeight, map[k][l]);
										sumHeight += map[k][l];
									}
								}
							}

							if(outerMinHeight > innerMaxHeight){
								result = Math.max(result, (width - 2)*(height - 2)*outerMinHeight - sumHeight);
//								System.out.println("result update -> "+result);
							}
						}
					}
				}
			}

			System.out.println(result);
		}
	}

}

