import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.StringTokenizer;

class Main {
	
	static class InsertionSort {
		public void insertionsort (InputReader ir) {
			
			int n = ir.nextInt();
			int array[] = new int[n];
			StringBuilder sb = new StringBuilder ();
			
			//配列入力
			for (int i = 0; i < n; i++ ) {
				array[i] = ir.nextInt();
				
				if (i != 0) sb.append(" ");
				sb.append(array[i]);
			}
			
			System.out.println(sb);
			sb.setLength(0);
		
			//挿入ソート
			for (int i = 1; i < n; i++) {
				int v = array[i];
				int j = i - 1;
				
				while ( j >= 0 && array[j] > v) {
					array[j + 1] = array[j];
					j--;
				}
				array[j + 1] = v;
				
				for (int k = 0; k < n; k++ ) {
					if (k != 0) sb.append(" ");
					sb.append(array[k]);
				}
				System.out.println(sb);
				sb.setLength(0);
			}
			
			
		}
	}
	
	static class InputReader {
		BufferedReader br;
		StringTokenizer st;
		
		public String nextString() {
			
			 while (!st.hasMoreTokens()) {
	                try {
	                    st = new StringTokenizer(br.readLine(), " ");
	                } catch (IOException e) {
	                    throw new InputMismatchException();
	                }
	            }
			return st.nextToken();
		}
		
		public int nextInt() {
			return Integer.parseInt(nextString());
		}
					
		public InputReader (InputStream inputStream) {
			br = new BufferedReader (new InputStreamReader (inputStream));
			st = new StringTokenizer ("");
		}
		
	}
	
	public static void main (String[] args) {
		InputStream inputStream = System.in;
		InputReader in = new InputReader (inputStream);
		InsertionSort obj = new InsertionSort ();
		obj.insertionsort (in);
	}
	
}

