import java.util.*;

public class Main {
	static final int INF = Integer.MAX_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//nodeNにくるための最小を順次求めていく
		try(Scanner scan = new Scanner(System.in)){
			int N = Integer.parseInt(scan.next());
			int[] h = new int[N];
			int[] d = new int[N];
			//hに標準入力を格納
			//dpに最大値を格納 dp:コストの総和と考える
			for(int i=0;i<N;i++) {
				h[i] = Integer.parseInt(scan.next());
				d[i] = INF;
			}
			d[0]= 0;
			d[1]= Math.abs(h[1] - h[0]);
			
          	for(int i = 2; i<N; i++) {
				//2つ前からくる場合のd[i]のコスト
				int prepre = d[i-2] + Math.abs(h[i]-h[i-2]);
   			
                //1つ前からくる場合のd[i]のコスト
				int pre = d[i-1] + Math.abs(h[i]-h[i-1]);
              
				//１つ前と２つ前のどちらからきた時にコストが小さいか
				d[i] = Math.min(prepre, pre);
                
            }
			//d[N]にはNにおける最小コストが格納されている
			System.out.println(d[N-1]);
				
		}
	}

}
