import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int cyoten = sc.nextInt();
			if(cyoten==0) break;
			
			int mati=0;
			int miti[][] = new int[cyoten][3];
			
			
			for(int i=0; i<cyoten; i++){
				for(int j=0; j<3; j++){
					miti[i][j] = sc.nextInt();
					if(j<2){
					mati=Math.max(mati, miti[i][j]);
					}
				}
			}
			
			/*↑のfor分の処理は街の数を算出する為の手順*/
			
			mati++;
			
			int num[][]= new int[mati][mati];
			
			for(int i=0; i<mati; i++){
				for(int j=0; j<mati; j++){
					num[i][j] = 100000000;
				}
				num[i][i]=0;
			}
			
			/*↑のfor文の処理は使う部分に0を入れてそれ以外の部分に大きい値を入力する。
			 準備段階*/
			
			for(int i=0; i<mati; i++){
				int a = miti[i][0];
				int b = miti[i][1];
				int c = miti[i][2];
				num[a][b] = c;
				num[b][a] = c;
			}
			
			/*入力したものをそれぞれの変数に格納する
			 準備段階*/
			
			for(int k=0; k<mati; k++){
				for(int i=0; i<mati; i++){
					for(int j=i; j<mati; j++){
						num[i][j] = Math.min(num[i][j], num[i][k]+num[k][j]);
					}
				}
			}
			
			/*↑のfor1文はワーシャルフロイド法まんまコピペ*/
	
			int ans = Integer.MAX_VALUE;
			int ans2 = 0;
			for(int i=0; i<mati; i++){
				int total =0;
				for(int j=0; j<mati; j++){
					total += num[i][j];
				}
				if(total<ans){
					ans = total;
					ans2 = i;
				}
			}
			System.out.println(ans2+" "+ans);

		}
	}
}