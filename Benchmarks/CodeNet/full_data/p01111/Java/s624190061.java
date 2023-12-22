

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//int[] sumArray = new int[1000000000];

		StringBuffer sb = new StringBuffer();

//		HashMap<Long, Integer> map = new HashMap<Long, Integer>();
//
//		for(int i = 1;i < 1_000_000_000 ; i++){
//			long sum = (long)i*(i + 1)/2;
//
//			//System.out.println("add "+sum+" (i = "+i+")");
//			map.put(sum, i);
//		}
//		System.out.println("Init finished");

		while(true){
			int n = Integer.parseInt(br.readLine());

			if(n == 0){
				break;
			}

			//合計が同じなら下から始めた方が多くのスペースを使えるので
			//しゃくとり法で探す
			int from = 1;
			int to = calcN(n);
			long sum = calcSum(to);

//			while(sum != n){
////				System.out.println("from "+from+" to "+to +" current sum "+sum);
////				if(from == 1){
////					try {
////						Thread.sleep(100);
////					} catch (InterruptedException e) {
////						// TODO 自動生成された catch ブロック
////						e.printStackTrace();
////					}
////				}
//
//				if(sum < n){
//					to++;
//					sum += to;
//				}
//				else if(sum > n){
//					sum -= from;
//					from++;
//
////					long diff = sum - n;
////					int tmpN = calcN(diff + calcSum(from - 1));
////					System.out.println("diff "+diff+" tmpN " + tmpN);
////					sum -= calcSum(tmpN) - calcSum(from -1);
////					from = tmpN + 1;
//				}
//			}

			int m = 0;
			int a = 0;
			for(int i = calcN(n); i >= 1; i--){
				if(2*n % i == 0){
					int tmp2a = 2*n/i - i + 1;

					if(tmp2a%2 == 0 && tmp2a >= 2){
						m = i;
						a = tmp2a/2;
						break;
					}
				}
			}

			//System.out.println(from + " " + (to - from + 1));
//			sb.append(from + " " + (to - from + 1)+"\n");
			sb.append(a + " " + m+"\n");
		}

		System.out.print(sb);

	}

	static int calcN(long sum){
		return (int) Math.ceil((-1 + Math.sqrt(1 + (double)8*sum))/2);
	}

	static long calcSum(long n){
		return (n*(n + 1)/2);
	}
}

