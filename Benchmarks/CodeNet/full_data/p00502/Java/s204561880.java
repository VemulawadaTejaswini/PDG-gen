import java.util.*;

class Clothes{
	public int small;
	public int large;
	public int hade;
	Clothes(int down, int up, int hd){
		small=down;
		large=up;
		hade=hd;
	}
}

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();//D：日数
		int N = sc.nextInt();//N：服の種類
		int[] wthr = new int[D];//温度の配列
		int[][] field = new int[N][];//動的計画法のフィールド
		int[][] field_result = new int[N][];//動的計画法での計算結果
		Clothes[] data = new Clothes[N];//服の情報のクラス配列
		for(int i=0; i<D; ++i) wthr[i]=sc.nextInt();
		for(int i=0; i<N; ++i){
			field[i] = new int[D];//N行D列
			field_result[i] = new int[D];
			data[i] = new Clothes(sc.nextInt(), sc.nextInt(), sc.nextInt());
		}		
		for(int j=0; j<D; ++j){
			for(int i=0; i<N; ++i){
				if(data[i].small <= wthr[j] && wthr[j] <= data[i].large){
					field[i][j]=data[i].hade;
					field_result[i][j]=0;
				}else{
					field[i][j]=-1;
					field_result[i][j]=-1;
				}
			}
		}
		for(int j=1; j<D; ++j){
			for(int i=0; i<N; ++i){
				if(field[i][j]==-1) continue;
				int big=0;
				int bigIndex=0;
				for(int k=0; k<N; ++k){
					if(field[k][j-1]==-1) continue;
					if(field_result[i][j] < Math.abs(field[k][j-1]-field[i][j])+field_result[k][j-1]){
						field_result[i][j] = Math.abs(field[k][j-1]-field[i][j])+field_result[k][j-1];				
//						System.out.println("k:"+k+" i:"+i+" j:"+j+" "+field_result[i][j]);
					}
				}
			}
		}
//最大値の検索
		int ans=field_result[0][D-1];
		for(int i=1; i<N; ++i){
			if(ans<field_result[i][D-1]) ans=field_result[i][D-1];
		}
		System.out.println(ans);
	}
}