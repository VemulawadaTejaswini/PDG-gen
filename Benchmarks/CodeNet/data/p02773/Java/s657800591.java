import java.io.*;
import java.util.*;

public class Main {

	final static long MOD = 1000000007;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		int N = Integer.parseInt(W);

		HashMap<String,Integer> map = new HashMap<>();

		for (int i = 0; i < N; i++) {
			W = in.readLine();
			if(map.containsKey(W)){
				map.put(W, map.get(W)+1);
			}else{
				map.put(W, 1);
			}
		}

		int most = 0;


		for(Iterator<String> itor = map.keySet().iterator();itor.hasNext();){
			String key = itor.next();
			most = Math.max(most,map.get(key));
		}
		ArrayList<String> list = new ArrayList<>();
		for(Iterator<String> itor = map.keySet().iterator();itor.hasNext();){
			String key = itor.next();
			if(most==map.get(key)){
				list.add(key);
			}

		}
		Collections.sort(list);
		for(String ans:list)
			System.out.println(ans);

	}

}
