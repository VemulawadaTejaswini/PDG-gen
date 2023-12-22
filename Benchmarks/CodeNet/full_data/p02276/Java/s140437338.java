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
	
	public static int partition(int[] A, int p, int r){
		final int x = A[r];
		
		int i = p - 1;
		for(int j = p; j < r; j++){
			if(A[j] <= x){
				i++;
				
				int tmp = A[i];
				A[i] = A[j];
				A[j] = tmp;
			}
		}
		
		int tmp = A[i + 1];
		A[i + 1] = A[r];
		A[r] = tmp;
		
		return i + 1;
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++){
			array[i] = sc.nextInt();
		}
		
		final int ret = partition(array, 0, n - 1);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++){
			sb.append(i == 0 ? "" : " ");
			sb.append(i == ret ? "[" : "");
			sb.append(array[i]);
			sb.append(i == ret ? "]" : "");
		}
		System.out.println(sb.toString());
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