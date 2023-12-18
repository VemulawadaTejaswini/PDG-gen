import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       // 配列の数N
		 int N = sc.nextInt();
       // 対象のカウント用
		 int count = 0;
       // 配列に数値を格納
		 int P[] = new int[N];
       //　pjを初期化
		 int Pj = 0;
		 for(int i=0; i<N; i++) {
			P[i]= sc.nextInt();
        // 配列の頭の数値
			Pj = P[0];
		 }
		 //最初に[0]番目をみてカウントする
		 //その後前の数と次の数を比べるようにし条件を満たせばカウントする
		 for(int i=0; i<N; i++) {
			if(P[i]<=Pj) {
				count++;
				Pj = P[i];
				}
		 }
		 System.out.println(count);
    }
}