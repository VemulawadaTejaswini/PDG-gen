import java.io.*;
import java.util.*;
public class Main {
	
	static class Word implements Comparable<Word> {
		String word;
		int length;
		
		public Word(String w, int l) {
			word = w;
			length = l;
		}
		
		public int compareTo(Word w) {
			for (int i=0; i<length; i++) {
				if (word.charAt(i) == w.word.charAt(i))
					continue;
				return word.charAt(i) > w.word.charAt(i) ? 1 : -1;
			}
			return 0;
		}
	}
	
	public static void main(String[] args) {
		InputReader in = new InputReader();
		int n = in.nextInt();
		int l = in.nextInt();
		
		Word[] words = new Word[n];
		for (int i=0; i<n; i++)
			words[i] = new Word(in.next(), l);
		
		Arrays.sort(words);
		
		StringBuffer sb = new StringBuffer();
		for (Word w: words)
			sb.append(w.word);
		System.out.println(sb);
	}
	
	static class InputReader {
		public BufferedReader br;
		public StringTokenizer st;
		
		public InputReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = null;
		}
		
		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return st.nextToken();
		}
		
		public int nextInt() {
			return Integer.parseInt(next());
		}
	}
}
