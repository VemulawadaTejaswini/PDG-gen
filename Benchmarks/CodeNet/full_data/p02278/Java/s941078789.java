import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;


public class Main {
	
	public static void main(String[] args) throws IOException {
		new Main().exec();
	}
	
	public void test() {
	}
	
	public void exec() throws IOException {
		SimpleInputUtil in = new SimpleInputUtil();
		PrintWriter out = new PrintWriter(System.out);
		int n = in.nextInt();
		int[] w = in.nextInt(new int[n], n);
		int[] sorted_w = Arrays.copyOf(w, n);
		Arrays.sort(sorted_w);
		HashMap<Integer,Integer> costMap = new HashMap<>();
		int minWeight = sorted_w[0];
		for(int i=0; i<n; i++){
			costMap.put(sorted_w[i], i);
			
		}
		int cost = 0;
		for(int i=0; i<n; i++){
			if(w[i]<0) continue;
			int weight = w[i];
			w[i] = -1;
			int firstPos = i;
			int loopCnt = 1;
			int loopCost = weight;
			int loopMinWeight = weight;
			int nextPos = costMap.get(weight);
			while(firstPos!=nextPos) {
				weight = w[nextPos];
				w[nextPos] = -1;
				loopCnt++;
				loopCost += weight;
				if(loopMinWeight>weight) loopMinWeight = weight;
				nextPos = costMap.get(weight);
			}
			if(loopCnt==1)
				continue;
			else if (loopCnt==2)
				cost += loopCost;
			else {
				cost +=  loopCost + Math.min(loopMinWeight*(loopCnt-2), loopMinWeight + minWeight*(loopCnt+1));
			}
		}
		out.println(cost);
		out.flush();
	}
	
}

class SimpleInputUtil {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public String[] readStrArray(String delim) throws NumberFormatException, IOException{
    	return br.readLine().split(delim);
    }
    
    public int nextInt() throws NumberFormatException, IOException{
    	return Integer.parseInt(br.readLine());
    }
    
    public int[] nextInt(int[] a, int num) throws NumberFormatException, IOException{
        int i=0;
        while(i<num) {
            for(String s: br.readLine().split(" ")){
            	if(i<num) {
                    a[i++] = Integer.parseInt(s);
            	}
            }
        }
        return a;
    }
}