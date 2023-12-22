import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/*heightttps://onlinejudge.u-aizu.ac.jp/#/problems/2015*/
class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for(;;){
			//入力
			Scanner scanner = new Scanner(br.readLine());
			int height[] = new int[scanner.nextInt()],
			    width[] = new int[scanner.nextInt()];
			scanner.close();

			if(height.length==0) break;//入力の終了

			//先に足し合わせておく
			height[0] = Integer.parseInt(br.readLine());
			for(int i=1; i<height.length; i++){
				height[i] = height[i-1] +Integer.parseInt(br.readLine());
			}
			width[0] = Integer.parseInt(br.readLine());
			for(int i=1; i<width.length; i++){
				width[i] = width[i-1] +Integer.parseInt(br.readLine());
			}

			//右上角を変えながら正方形を探す
			int numberOfSquare = 0;
			for(int yIndex=0; yIndex<height.length; yIndex++){
				//中身をめちゃくちゃにしていい使い捨ての配列にコピー
				int W[] = new int[width.length];
				for(int i=0; i<width.length; i++) {
					W[i] = width[i];
				}
				for(int xIndex=0; xIndex<width.length; xIndex++){
					for(int i=yIndex; i<height.length; i++) {//高さを変える
						for(int j=xIndex; j<W.length; j++) {//幅を変える
							if(height[i] == W[j]) {
								numberOfSquare++;
								break;
							}
						}
					}

					//次のループでは右の角に移る、つまりWの各要素から列の頭になる分を引いておく
					for(int i=xIndex+1; i<W.length; i++) {
						W[i] -= W[xIndex];
					}
				}

				//次のループでは下の角に移る、つまりheightの各要素から列の頭になる分を引いておく
				for(int i=yIndex+1; i<height.length; i++) {
					height[i] -= height[yIndex];
				}
			}
			//出力
			System.out.println(numberOfSquare);
		}

		br.close();
	}

}

