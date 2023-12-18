import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		int N = Integer.parseInt(W);

		W = in.readLine();
		long key ;
		String[] w = W.split(" ");
		HashMap<Long,Integer> map = new HashMap<Long,Integer>();
		for(int i=0;i<w.length;i++){
			key = Long.parseLong(w[i]);
			if(map.containsKey(key)){
				map.put(key, map.get(key)+1);
			}else{
				map.put(key,1);
			}
		}

		Long[] a = new Long[map.keySet().size()];
		a = (Long[])map.keySet().toArray(a);
		Arrays.sort(a);
		long max = a[a.length-1];
		long m =1;
		while(max != 0){
			max = max >> 1;
			m = m << 1 + 1;
		}
		m = m -1;
		m = m >> 1;


		long[] q = new long[N];
		q[0]=a[0];
		map.put(a[0],map.get(a[0])-1);

		long l = ~a[0]&m;
		long r = l|a[0]&m;
		int ls = 0;
		while(l>q[0]){
			if(map.containsKey(l) && map.containsKey(r)){
				map.put(l,map.get(l)-1);
				if(map.get(l)==0){
					q[q.length-1]=l;
					map.remove(l);
				}
				map.put(r,map.get(r)-1);
				if(map.get(r)==0){
					q[1]=r;
					map.remove(r);
				}
				break;
			}
			ls++;
			l = (m >> ls) & l;
			r = (m >> ls) & r;
		}
		String ans = "Yes";
		if((l^r) == q[0]){
			int i=1;
			for(;i<q.length-2;i++){
				r = q[i-1]^q[i];
				if(map.containsKey(r)){
					map.put(r,map.get(r)-1);
					if(map.get(r)==0){
						map.remove(r);
					}
				}else{
					ans = "No";
					break;
				}
			}
		}else{
			ans = "No";
		}
		if((q[0]^q[q.length-2]) != q[q.length-1]){
			ans = "No";
		}
		System.out.println(ans);

	}


}
