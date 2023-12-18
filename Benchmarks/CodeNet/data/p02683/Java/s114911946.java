import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int N = keyboard.nextInt();
		int M = keyboard.nextInt();
		int X = keyboard.nextInt();
		int[] C = new int[N];
		int[][] A = new int[N][M];
		
		for(int i=0; i<N; i++) {
			C[i] = keyboard.nextInt();
			for(int j=0; j<M; j++) {
				A[i][j] = keyboard.nextInt();
			}
		}
		
		//合計金額の暫定値
		int ans = N*100000+10;
		//最安値更新フラグ
		int flag = 0;
		
		//1:この本とこの本と(以下略)を買う、というのを0(買わない)、1(買う)で決める
		// 例:4個の箱があってそこに0と1を入れたい
		// 0000 から1ずつ足していって、1111までのすべてを試す時 
		// 1<<4によって最大値1111+1=10000を表せる
		int conN = 1 << N;
		//0b0は、bitで表した0のことで、例えば0b10なら数字の2を表せる。
		for(int c=0b0; c<conN; c++) {
			
			//2:1番で決めた組み合わせで本を買ったときに、各スキルのexpがXを超えるかを確認する
			int exp[] = new int[M];
			for(int m =0; m<M; m++) {
				for(int n=0; n<N; n++) {
				//(c>>N)で、bitの右からn桁目(0,1,2,3…)を見る (bitの並びから下n桁を削除する)
				//「右からn桁目」と「1」が両方とも1であることを「&」で確認する
					if(((c>>n)&1) == 1) {
						exp[m] += A[n][m];
					}
				}
			}//2
			
			//点数超えてるフラグ
			boolean ExpIsOK = true;
			
			for(int m2=0; m2<M; m2++) {
				//3-1:合計点数を確認してXを超える場合に、超えてるフラグをONにする
				if(exp[m2] >= X) {
				//何もしない
				}else {
					ExpIsOK = false;
				}
			}
				//3-2:本の合計金額sumが現在の合計金額より安ければansを更新する
			int sum = 0;
			if(ExpIsOK) {
				for(int n2=0; n2<N; n2++) {
					if(((c>>n2)&1) == 1) {
						sum += C[n2];
					}
				}
				if(sum < ans) {
					ans = sum;
				//3-3:ansを一度でも更新したらflagを1にする
					flag = 1;
				}
			}else {
			//3-4:1つでもXを満たせないスキルが出た時点で、次の組み合わせを確認する
			}//3
		}//1
		
		//一通り処理してflagが0(未更新、どの本の組み合わせを買ってもダメ)なら、ansを-1にする
		if(flag == 0) {
			ans = -1;
		}
		
		System.out.println(ans);
		keyboard.close();
	}
}
