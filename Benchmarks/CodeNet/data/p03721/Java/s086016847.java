import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] ss0 = br.readLine().trim().split(" ", 0);
		int N = Integer.parseInt(ss0[0]);
		int K = Integer.parseInt(ss0[1]);
		
		Map<Long, Long> m = new HashMap<Long, Long>();

		
		//long[] key = new long[N];
		//long[] val = new long[N];
		long count=0L;
		long min=Long.MAX_VALUE;
		long max=0L;
		
		long kosu=0L;
		long atai=0L;
		
		long key;
		long x;
		long val;
		long ans=0L;
		for(int i=0; i<N; i++){
			ss0 = br.readLine().trim().split(" ", 0);
			key = Long.parseLong(ss0[0]);
			val = Long.parseLong(ss0[1]);
			
			//System.out.println("key=[" + key + "], val=[" + val + "]");
			
			if(atai == 0L) { atai = key; }
			
			kosu += val;
			if(kosu > K){
				if(atai <= key) {
					if(m.containsKey(key)){
						val += m.get(key);
						m.remove(key);
					}
					m.put(key, val);
					atai = key;
				}
			}else{
				m.put(key, val);
				if(atai < key) {
					atai = key;
				}
			}
			
			//System.out.println("atai=[" + atai + "], kosu=[" + kosu + "]");
		}

        // List 生成 (ソート用)
        List<Map.Entry<Long, Long>> entries =  new ArrayList<Map.Entry<Long, Long>>(m.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<Long, Long>>() {
            @Override
            public int compare(
                  Entry<Long, Long> entry1, Entry<Long, Long> entry2) {
                return ((Long)entry1.getValue()).compareTo((Long)entry2.getValue());
            }
        });		
		
        // 内容を表示
        for (Entry<Long, Long> s : entries) {
            //System.out.println("s.getKey()=[" + s.getKey() + "], s.getValue()=[" + s.getValue() + "], count=[" + count + "]");
            
			//System.out.println("count=[" + count + "]");
            count += s.getValue();
            if(count >= K){
				ans = s.getKey();
				break;
			}
        }
//		System.out.println("count=[" + count + "]");
        
        System.out.println(ans);
        return;
    }


}