import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws Exception {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		
		// <数列, 色数>
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for(int i = 0; i < n; i++){
		    
		    if ( map.containsKey(a[i]) ){
		        map.put(a[i], map.get(a[i]) + 1);
		    } else {
		        map.put(a[i], 1);
		    }
		    
		    Integer l = map.lowerKey(a[i]);
		    if ( l == null ) continue;
		    int v = map.get(l);
		    if( v == 1 ){
		        map.remove(l);
		    } else {
		        map.put(a[i], v - 1);
		    }
		}
		
		int ans = 0;
		for(Integer k : map.keySet() ){
		    ans += map.get(k);
		}
		
		System.out.println(ans);
        
    }
}
