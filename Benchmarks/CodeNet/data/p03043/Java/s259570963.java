
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());//int型
		int K = Integer.parseInt(sc.next());
		double ans = 0;
		// サイコロの段階で勝ち確定
		ans = Math.max((N-K)/N, 0);

		
		for( int i=1; i<=Math.min(K, N);i++) {
			int countpow=0;
			for(int j=1; j<18;j++){
			    int p = (int) (i*Math.pow(2, j));
				if(p>=K) {
					countpow=j;
					break;
				}
			}
			ans += (double)1/N * Math.pow(0.5, countpow);
			
		}
		
		System.out.println(ans);
		
	}

}

