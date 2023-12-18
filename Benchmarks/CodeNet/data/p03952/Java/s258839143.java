import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String args[] ) throws Exception {
    	new Main().exec(args);
    }

    public Main() {
    }

    public void exec(String args[]) throws Exception {
    	Scanner sc = new Scanner(System.in);
    	int N=sc.nextInt();
    	int x=sc.nextInt();
    	boolean flg=true;
    	if(x==1 || x==2*N-1) flg=false;
    	Map<Integer,Integer> output = new HashMap<Integer,Integer>();
    	Map<Integer,Integer> outputVal = new HashMap<Integer,Integer>();
    	System.out.println(flg?"Yes":"No");
    	if(flg) {
    		if(N==2) {
    			output.put(1,1);
    			output.put(2,2);
    			output.put(3,3);
    		}
    		else {
    			if(x==2) {
            		put(output,outputVal, N-1,2*N-1);
            		put(output,outputVal, N,x);
            		put(output,outputVal, N+1,1);
            	}else{
            		put(output,outputVal, N-2,2);
            		put(output,outputVal, N-1,2*N-1);
        			put(output,outputVal, N,x);
            		put(output,outputVal, N+1,1);
            	}
    		}
    		output(output, 2*N-1);
    	}

    }
    private void output(Map<Integer,Integer> map, int max) {
		for(int i=1; i<=max; i++) {
			if(map.containsKey(i)){
				System.out.println(map.get(i));
			}else{
				System.out.println(i);
			}
		}
    }
    private void put(Map<Integer,Integer>  map,Map<Integer,Integer>  valmap, int index, int val) {
    	int tmp_idxs_val = index;
    	int tmp_vals_idx = val;
    	if(map.containsKey(index)){
    		tmp_idxs_val = map.get(index);
    	}
    	if(valmap.containsKey(val)){
    		tmp_vals_idx = valmap.get(val);
    	}
    	map.put(index, val);
    	valmap.put(val, index);
    	map.put(tmp_vals_idx, tmp_idxs_val);
    	valmap.put(tmp_idxs_val, tmp_vals_idx);
    }
}