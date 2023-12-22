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
					//計算量を減らすために横幅は先に計算して記憶
					int width[] = new int[W.length -xIndex];
					width[0] = W[xIndex];
					for(int i=1; i<width.length; i++) {
						width[i] = width[i-1]+W[xIndex+i];
					}
					//縦幅を変える
					int height=0;
					for(int i=yIndex; i<H.length; i++){
						height += H[i];
						for(int val : width) {
							if(height < val) break;//無駄なループを防ぐ
							if(height == val) {
								numberOfSquare++;
								break;
							}
						}
					}
				}
			}
			//出力
			System.out.println(numberOfSquare);
		}

		br.close();
	}

}

