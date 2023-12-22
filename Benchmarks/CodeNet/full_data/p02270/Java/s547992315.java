import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		final int k = sc.nextInt();
		
		long sum = 0;
		long max = Long.MIN_VALUE;
		int[] ws = new int[n];
		
		for(int i = 0; i < n; i++){
			final int w = sc.nextInt();
			ws[i] = w;
			sum += w;
			max = Math.max(max, w);
		}
		
		long lower = max - 1; // 
		long upper = sum;
		
		while(upper - lower != 1){
			long mid = (lower + upper) / 2;
			
			int count = 1;
			long can_use = mid;
			for(int i = 0; i < n; i++){
				if(can_use < ws[i]){
					count++;
					can_use = mid - ws[i];
				}else{
					can_use -= ws[i];
				}
			}
			
			if(count <= k){
				upper = mid;
			}else{
				lower = mid;
			}
		}
		
		System.out.println(upper);
		
	}
	
	public static class Scanner {
	    private BufferedReader br;
	    private StringTokenizer tok;

	    public Scanner(InputStream is) throws IOException {
	        br = new BufferedReader(new InputStreamReader(is));
	    }

	    private void getLine() throws IOException {
	        while (!hasNext()) { tok = new StringTokenizer(br.readLine()); }
	    }

	    private boolean hasNext() {
	        return tok != null && tok.hasMoreTokens();
	    }

	    public String next() throws IOException {
	        getLine(); return tok.nextToken();
	    }

	    public int nextInt() throws IOException {
	        return Integer.parseInt(next());
	    }
	    
	    public long nextLong() throws IOException {
	    	return Long.parseLong(next());
	    }
	    
	    public void close() throws IOException {
	        br.close();
	    }
	}

}