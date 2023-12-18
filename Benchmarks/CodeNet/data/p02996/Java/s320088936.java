import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		int N = Integer.parseInt(W);


		TreeMap<Long ,ArrayList<Long>> map = new TreeMap<Long ,ArrayList<Long>>();
		ArrayList<Long> list ;
		//データを締め切り毎にリスト化
		for(int i=0;i<N;i++){
			W = in.readLine();
			long A =  Long.parseLong(W.split(" ")[0]);
			long B =  Long.parseLong(W.split(" ")[1]);

			if(map.containsKey(B)){
				list = map.get(B);
				boolean flg = true;
				for(int x=0;x<list.size();x++){
					if(A < list.get(x)){
						list.add(A);
						flg = false;;
						break;
					}
				}
				if(flg){
					list.add(A);
				}
			}else{
				list = new ArrayList<Long>();
				list.add(A);
				map.put(B, list);
			}
		}

		long time =0;
		String ans = "Yes";
		Set<Long> st = map.keySet();
		for(long key : st){
			list = map.get(key);
			for(long val:list){
				time += val;
				if(time <= key){
					continue;
				}else{
					ans = "No";
					break;
				}
			}
		}


		System.out.println(ans);
	}


}
