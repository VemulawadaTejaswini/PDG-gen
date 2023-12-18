import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N+1];
		int B[] = new int[N];
		int Ai;
		//　モンスターの撃退数
		int count = 0;
		//trueのとき前の勇者gまだ倒せる
		boolean jud;
		
		//input
		for(int i=0;i<=N;i++) {
			A[i] = sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			B[i] = sc.nextInt();
		}
		//method
		
		if(A[0] >= B[0]){
			count = B[0];
			jud = false;
		}else {
			B[0] = B[0] - A[0];
			count = A[0];
			jud = true;
		}
		
		for(int i=1;i<N;i++) {
			if(jud) {
				Ai = A[i] - B[i-1];
				//　前の勇者が倒してまだ残っている＆残りのモンスター数が今の勇者が倒せる数より大きい→モンスターが残る
				if(Ai >= 1 && Ai >= B[i]){
					count = count + B[i-1]+B[i];
					jud = false;
				}//残りのモンスターが今の勇者が倒せる数より小さい→今の勇者の残数を次に持ちこし
				else if(Ai >= 1 && Ai < B[i]) {
					count = count + A[i];
					B[i] = B[i] - Ai;
					jud = true;
				}//　前の勇者の残りで全てのモンスターを倒せた場合
				else{
					count = count + A[i];
					jud = true;
				}
			}//前の勇者の数が残っていない場合
			else {
				if(A[i] >= B[i]) {
					count = count + B[i];
					jud = false;
				}else {
					B[i] = B[i] - A[i];
					count = count + A[i];
					jud = true;
				}
			}
		}
		
		if(jud){
			if(A[N] <= B[N-1]) {
				count = count + A[N];
			}else {
				count = count + B[N-1];
			}
		}
		
		System.out.println(count);
	}
}