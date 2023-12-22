import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		件数
		int n = sc.nextInt();
		//カウンター
		int c = 0;
		int d = 0;
		//入れ子
		int z = 0;
		int x = 0;
		int box[][][] = new int[4][3][10];
	//件の繰り返し
	while(n>c){
//		棟の数
		int b = sc.nextInt();
//		階数
		int f = sc.nextInt();
//		部屋数
		int r = sc.nextInt();
//		人数
		int v = sc.nextInt();
		//0ならそのまま入れる
		if(box[b-1][f-1][r-1]==0){
			box[b-1][f-1][r-1]=v;
			z=v;
		}
		//数字が入っていれば計算する
		else{
		//boxに人数入力
			x=box[b-1][f-1][r-1]+v;
			box[b-1][f-1][r-1]=x;
		}
		c++;
	}

		//人数出力
		//棟の繰り返し
		for(int i=0;i<4;i++){
		//階の繰り返し
			for(int j=0;j<3;j++){
		//部屋のの繰り返し
				for(int k=0;k<10;k++){
			System.out.print(" "+box[i][j][k]);
				}
				System.out.println("");
			}
		if(d<3){
			System.out.println("####################");
			d++;
			}
		}


	}


}

