import java.util.*;
import java.util.ArrayList;

public class Main{
	public static void main(String args[]){

		// 宣言
		int mod = 1_000_000_007;
		ArrayList<Integer> A = new ArrayList<>();
		ArrayList<Integer> B = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int num = 0;
		// 値取得
		int N = sc.nextInt();
		long K = sc.nextInt();
		int Ble = (int)K * N;
		// System.out.println(N);
		for(int i=0;i<N;i++){
			A.add(sc.nextInt());
			// System.out.println(A.get(i));
		}

		// リストB作成
		int index = 0;
		int cnt=0;
		while(cnt<Ble){

			B.add(A.get(index));
			if(index == N - 1){
				index = 0;
			}else{
				index++;
			}
			// System.out.println(B.get(cnt));
			cnt++;
		}
		// 転倒数を求める(自分より右にある小さい数字を足していく)
		int ten = 0;
		long ans = 0L;
		for(int k = 0;k<Ble;k++){
			for(int l = 0;l<Ble;l++){
				if(k < l){
					if(B.get(k) > B.get(l)){
						ten = ten + B.get(l);
					}					
				}				
			}
		}
		System.out.println(ten % mod);
        sc.close();
	}
}