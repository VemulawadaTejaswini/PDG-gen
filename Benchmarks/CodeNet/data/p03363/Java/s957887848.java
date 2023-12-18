
import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int n = Integer.parseInt(sc.next());
            long temp = 0;
            long count = 0;
            
            Map<Long, Integer> map = new HashMap<Long, Integer>();
            
            map.put((long)0, 1);
            
            for(int i=0; i<n; i++){
            	temp += Integer.parseInt(sc.next());
            	
            	if(map.get(temp) == null){
            		map.put(temp, 1);
            	}else{
            		map.put(temp, map.get(temp) + 1);
            	}
            }
            
    		for (Integer val : map.values()) {
    			if(val > 1){
    				count += val * (val-1) / 2;
    			}
    		}
            
            //出力
            System.out.println(count);
            sc.close();
        }
    }
	