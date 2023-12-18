import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String readStr = in.readLine();

		int N = Integer.parseInt(readStr.split(" ")[0]);
		int Q = Integer.parseInt(readStr.split(" ")[1]);

		HashMap<String,ArrayList<Integer>> map = new HashMap<String,ArrayList<Integer>>();

		readStr = in.readLine();
		String[] S = new String[N+2];
		String x = "2";
		ArrayList<Integer> list;
		for(int i=0;i<N;i++){
			x = String.valueOf(readStr.charAt(i));
			if(map.containsKey(x)){
				map.get(x).add(i+1);
			}else{
				list = new ArrayList<Integer>();
				list.add(i+1);
				map.put(x, list);
			}

		}
		int[] G = new int[N+2];
		Arrays.fill(G,1);

		String[] command ;
		int indx=0;
		for(int i=0;i<Q;i++){
			command = in.readLine().split(" ");
			list = map.get(command[0]);
			if(list == null){
				continue;
			}
			if("R".equals(command[1])){
				for (int k = list.size()-1;k>=0;k--){
					indx = list.get(k);
					G[indx+1]+= G[indx];
					G[indx]=0;
				}
			}else{
				for (int k = 0;k<list.size();k++){
					indx = list.get(k);
					G[indx-1]+= G[indx];
					G[indx]=0;
				}
			}
		}

		int ans = 0;
		for(int i=1;i<N+1;i++){
			ans+=G[i];
		}

		System.out.println(ans);
	}


}
