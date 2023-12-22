import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	
	public static boolean search(final int cur_pos, final int n, int[] array, final int sum, final int m){
		
		for(int next_pos = cur_pos + 1; next_pos < n; next_pos++){
			final int next_value = sum + array[next_pos];
			
			if(next_value > m){
				break;
			}else if(next_value == m){
				return true;
			}else if(search(next_pos, n, array, next_value, m)){
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++){
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		
		final int q = sc.nextInt();
		for(int i = 0; i < q; i++){
			int m = sc.nextInt();
		
			System.out.println(search(-1, n, array, 0, m) ? "yes" : "no");
		}
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