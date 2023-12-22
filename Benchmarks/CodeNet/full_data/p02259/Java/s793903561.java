import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		int[] seq = null;
		
		try {
			seq = getSequence();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		seq = bubbleSort(seq);
	}
	
	public static int[] bubbleSort(int[] seq) {
		int count = 0;
		for (int i = 0; i < seq.length; i++) {
			final int check = count;
			int key = seq[0];
			for (int j = 1; j < seq.length-i; j++) {
				if (key <= seq[j]) {
					key = seq[j];
				} else {
					seq[j-1] = seq[j];
					seq[j] = key;
					count++;
				}
			}
			
			if (check == count) break;
		}
		
		printArray(seq);
		System.out.println(count);
		return seq;
	}
	
	public static void printArray(int[] seq) {
		StringBuilder p = new StringBuilder();
		String lb = System.getProperty("line.separator");
		
		for (int i = 0; i < seq.length; i++) {
			p.append(seq[i]).append(i < seq.length-1 ? " " : lb);
		}
		System.out.print(p);
	}
	
	public static int[] getSequence() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		final int n = Integer.parseInt(reader.readLine());
		final String[] line = reader.readLine().split(" ");
		reader.close();
		
		final int[] seq = new int[n];
		for (int i = 0; i < seq.length; i++) {
			seq[i] = Integer.parseInt(line[i]);
		}
		
		return seq;
	}
}