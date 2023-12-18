import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;



public class Main {
	public static void main(String[] args) throws IOException {
		InputReader r = new InputReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		int n = r.nextInt();
		int[] arr = new int[n];
		Arrays.fill(arr, -1);
		out.write("0\n");
		out.flush();
		String response = r.next();
		if(response.equals("Vacant")){
			System.exit(0);
		}else if(response.equals("Male")){
			for (int i = 0; i < arr.length; i++) {
				arr[i] = i%2;
			}
		}else{
			for (int i = 0; i < arr.length; i++) {
				arr[i] = (i+1)%2;
			}
		}
		int low = 0, high = n, itr = 18;
		while(itr-->0){
			int mid = (low+high)/2;
			out.write(mid+"\n");
			out.flush();
			response = r.next();
			if(response.equals("Vacant")){
				System.exit(0);
			}else if(response.equals("Male")){
				if(arr[mid]==0)
					low = mid;
				else
					high = mid;
			}else{
				if(arr[mid]==1)
					low = mid;
				else
					high = mid;
			}
		}
	}

	static class InputReader {
		private BufferedReader reader;
		private StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream));
			tokenizer = null;
		}

		public InputReader(FileReader stream) {
			reader = new BufferedReader(stream);
			tokenizer = null;
		}

		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}
	}
}
