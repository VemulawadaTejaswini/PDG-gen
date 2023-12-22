import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			StringBuilder out;
			String lb = System.getProperty("line.separator");
			
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(in.readLine());
			String[] line = in.readLine().split("[\\s]+");
			in.close();
			
			int[] seq = new int[n];
			out = new StringBuilder();
			for (int i = 0; i < seq.length; i++) {
				seq[i] = Integer.parseInt(line[i]);
				out.append(String.valueOf(seq[i])).append(i < n-1 ? " " : lb);
			}
			System.out.print(out.toString());
			
			
			for (int i = 1; i < seq.length; i++) {
				final int key = seq[i];
				int j = i-1;
				while (0 <= j && key < seq[j]) {
					seq[j+1] = seq[j];
					j--;
				}
				seq[j+1] = key;
				
				out = new StringBuilder();
				for (int k = 0; k < n; k++) {
					out.append(String.valueOf(seq[k])).append(k < n-1 ? " " : lb);
				}
				System.out.print(out.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}