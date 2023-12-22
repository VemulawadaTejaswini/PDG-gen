import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			int n = Integer.parseInt(br.readLine());
			if(n == 0) break;

			HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
			int ans = -1;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int div = n / 2;
			int max = 0;

			for(int i=0;i<n;i++){
				if(div - max > n - i) break;
				int x = Integer.parseInt(st.nextToken());
				if(map.get(x) == null){
					if(i>div) continue;
					else map.put(x,0);
				}
				int time = map.get(x) + 1;
				if(time > max){
					max = time;
					ans = x;
					if(div<time) break;
				}
				map.put(x,time);
			}

			System.out.println(max<=div ? "NO COLOR" : ans);
		}
	}
}