import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.StringTokenizer;

class Main {
	
	static class BinarySearch {
		public void binarysearch (InputReader ir) {
			
			int count = 0;
			int n = ir.nextInt();
			int[] array = new int[n];
			
			for (int i = 0; i < n; i++) {
				array[i] = ir.nextInt();
			}
			
			Arrays.sort(array);
			
			int q = ir.nextInt();
			int[] array2 = new int[q];
			
			for (int i = 0; i < q; i++) {
				array2[i] = ir.nextInt();
			}
			 
			for (int i = 0; i < q; i++) {
				int left = 0;
				int right = n;
		            		        
				while (left < right) {
					int mid = (left + right)/2;   
					if (array2[i] == array[mid]) {
						count++;
						break;
						}    
					else if (array2[i] < array[mid]) right = mid;    
					else left = mid + 1;
		            
				}    
			}
			System.out.println(count);
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
		BinarySearch obj = new BinarySearch ();
		obj.binarysearch (in);
	}
}

