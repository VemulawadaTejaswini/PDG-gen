import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		
      　//入力表示
		int N = sc.nextInt();
      	//Aの配列を作成
		int A[]=new int[N];
		
		for(int i=0;i<A.length;i++) {
			 A[i]=sc.nextInt();

		}
      	//スキャナーに入れたものをきれいに並べる
		Arrays.sort(A);
     　 //最大値から最小値を引く計算
		int ans=A[A.length-1] - A[0];
		
		System.out.println(ans);
	}
}