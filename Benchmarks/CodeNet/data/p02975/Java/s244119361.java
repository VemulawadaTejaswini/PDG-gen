import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}

		// 計算
		String result = "No";
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i = 0; i < n; i++){
			if(hm.get(a[i]) == null){
			    hm.put(a[i], 1);
			}else{
			    int v = hm.get(a[i]);
			    hm.put(a[i], v + 1);
			}
		}
		if(hm.keySet().size() == 1 && hm.keySet().contains(0)){
		    result = "Yes";
		}else if(hm.keySet().size() == 2){
		    if(hm.get(0) != null && hm.get(1) != null && hm.get(0)*2 == hm.get(1)){
		        result = "Yes";
		    }else{
		        result = "No";
		    } 
		}else if(hm.keySet().size() == 3){
		    result = "Yes";
		    int v = 0;
		    for(int i : hm.keySet()){
		        if(v == 0) v = hm.get(i);
	            if(v != hm.get(i)) result = "No";
		    }
	        ArrayList<Integer> list = new ArrayList<Integer>(hm.keySet());
	        if((list.get(0).intValue() ^ list.get(1).intValue()) != list.get(2).intValue()) result = "No";
		}
		
		// 出力
		System.out.println(result);
	}
	
}
