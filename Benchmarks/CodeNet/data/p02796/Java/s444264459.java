import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		int N = Integer.parseInt(W);
		int[] L = new int[10^9];
		int[] X = new int[10^9];

		int[][] R = new int[N][2];
		int ans = N;
		HashMap<Integer,ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>();
		Arrays.fill(L, 0);
//		Arrays.fill(X, -1);

		for(int i=0;i<N;i++){
			W = in.readLine();

			String[] Ws = W.split(" ");
			int[] robo = new int[2];

			robo[0] = Integer.parseInt(Ws[0]);
			robo[1] = Integer.parseInt(Ws[1]);
			R[i] = robo;
			//アームの届く距離
			int st = Math.max(0, robo[0]-robo[1]);
			int ed = Math.min(10^9, robo[0]+robo[1])-1;
			int dist = ed - st;

			//距離毎に座標を保存
			if(map.containsKey(dist)){
				ArrayList<Integer> list = map.get(dist);
				list.add(i);
			}else{
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(i);
				map.put(dist, list);
			}
			for(int k=st;k<ed;k++){
				L[k]++;
			}
		}


		Integer[] keys = new Integer[map.keySet().size()];
		map.keySet().toArray(keys);
		for(int i=keys.length-1;i>=0;i--){
			ArrayList<Integer> list = map.get(keys[i]);
			for(int k=0;k<list.size();k++){
				int[] robo = R[list.get(k)];
				int st = Math.max(0, robo[0]-robo[1]);
				int ed = Math.min(10^9, robo[0]+robo[1])-1;
				boolean flg = false;
				for(int x=st;x<ed;x++){
					if(L[x] > 1){
						flg=true;
						ans--;
						break;
					}
				}
				if(flg){
					for(int x=st;x<ed;x++){
						L[x]--;
					}

				}
			}
		}

		System.out.println(ans);



	}

}
