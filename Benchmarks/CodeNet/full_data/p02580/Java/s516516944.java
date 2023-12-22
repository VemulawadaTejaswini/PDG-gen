import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
	static void add(Map<Integer, Integer> map, int v){
		if(!map.containsKey(v)){
			map.put(v, 1);
		}else{
			int c = map.get(v);
			map.put(v, c + 1);
		}
	}
	static int max(Map<Integer , Integer> map){
		int m = 0;
		for(int v : map.values()){
			m = Math.max(m, v);
		}
		return m;
	}
	static int maxNum(Map<Integer , Integer> map, int max){
		int m = 0;
		for(int v : map.values()){
			if(v == max){
				++m;
			}
		}
		return m;
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String arr[] = line.split(" ");
//		int H = Integer.parseInt(arr[0]);
//		int W = Integer.parseInt(arr[1]);
		int M = Integer.parseInt(arr[2]);
		int xs[] = new int[M];
		int ys[] = new int[M];
		Map<Integer, Integer> rcount = new HashMap<Integer, Integer>();
		Map<Integer, Integer> ccount = new HashMap<Integer, Integer>();
		for(int i = 0 ; i < M ; ++i){
			line = br.readLine();
			arr = line.split(" ");
			int h = Integer.parseInt(arr[0]) - 1;
			int w = Integer.parseInt(arr[1]) - 1;
			add(rcount , h);
			add(ccount , w);
			xs[i] = w;
			ys[i] = h;
		}
		int mr = max(rcount);
		int mc = max(ccount);
		int mr_num = maxNum(rcount, mr);
		int mc_num = maxNum(ccount, mc);
		long cnt = 0;
		for(int i = 0 ; i < M ; ++i){
			int h = ys[i];
			int w = xs[i];
			if(mr == rcount.get(h) && mc == ccount.get(w)){
				++cnt;
			}
		}
		long cross = (long)mr_num * (long) mc_num;
		if(cross > cnt){
			System.out.println(mr+mc);
		}else{
			System.out.println(mr+mc - 1);			
		}
	}
}
