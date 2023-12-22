import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/*https://onlinejudge.u-aizu.ac.jp/#/problems/2015*/
class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for(;;){
			//入力
			Scanner scanner = new Scanner(br.readLine());
			int H[] = new int[scanner.nextInt()],
			    W[] = new int[scanner.nextInt()];
			scanner.close();
			if(H.length==0) break;
			for(int i=0; i<H.length; i++){
				H[i] = Integer.parseInt(br.readLine());
			}for(int i=0; i<W.length; i++){
				W[i] = Integer.parseInt(br.readLine());
			}

			//右上角を変えながら正方形を探す
			int numberOfSquare = 0;
			for(int yIndex=0; yIndex<H.length; yIndex++){//下の角に移る
				for(int xIndex=0; xIndex<W.length; xIndex++){//右の角に移る
					int height=0, width;
					for(int i=yIndex; i<H.length; i++){//縦幅を変える
						height += H[i];
						width = 0;
						for(int j=xIndex; j<W.length; j++){//横幅を変える
							width += W[j];
							if(height < width) break;//無駄な計算をしないように
							if(height == width){
								numberOfSquare++;
								/*System.out.printf("%d %d", xIndex, yIndex);
								System.out.println();*/
								break;
							}
						}
					}
				}
			}
			System.out.println(numberOfSquare);
		}

		br.close();
	}

}

