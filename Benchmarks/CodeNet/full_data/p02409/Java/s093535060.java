import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		件数
		int n = sc.nextInt();
		//カウンター
		int c = 0;
		//入れ子
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
				
			box[b-1][f-1][r-1]=v;
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
			System.out.println("####################");
		}
		System.out.println("");
		
		}
	

}

