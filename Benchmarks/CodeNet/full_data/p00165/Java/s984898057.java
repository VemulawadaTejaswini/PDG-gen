import java.io.*;
import java.util.*;

public class Main{
	static boolean[] p = new boolean[1000001];

	static void sosu(){
		Arrays.fill(p,true);
		p[0] = p[1] = false;
		for(int i=2;i<=999983;i++){
			if(p[i]){
				for(int j=i*2;j<=999983;j+=i){
					p[j] = false;
				}
			}
		}

		for(int i=999984;i<=1000000;i++){
			p[i] = false;
		}
 	}

	static int calX(int from,int to){
		int res = 0;
		if(from <= 2 && 2 <= to) res++;
		if(from % 2 == 0) from++;

		for(int i=from;i<=to;i+=2){
			if(p[i]) res++;
		}
		return res;
	}

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		sosu();

		while(true){
			int n = Integer.parseInt(br.readLine());
			if(n == 0) break;
			HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

			while(n-- > 0){
				String[] s = br.readLine().split(" ");
				int p = Integer.parseInt(s[0]);
				int m = Integer.parseInt(s[1]);

				if(map.get(p) == null) map.put(p,0);
				map.put(p,map.get(p)+calX(p-m<0?0:p-m, p+m>1000000?1000000:p+m));
			}

			int ans = 0;
			for(int key : map.keySet()){
				int count = map.get(key);
				if(count > 0) ans += count - 1;
				else if(count == 0) ans--;
			}

			System.out.println(ans);
		}
	}
}