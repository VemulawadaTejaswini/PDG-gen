import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    WordGraph root = new WordGraph();
		
		try {
			int lim = Integer.parseInt(in.readLine());
			
			for (int i = 0; i < lim; i++) {
				String[] param = in.readLine().split(" ");
				
				if (param[0].equals("insert")) {
					root.add(param[1]);
				} else {
					if (root.search(param[1]) == true) System.out.println("yes");
					else System.out.println("no");
				}
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class WordGraph {
	private static final int A = 0;
	private static final int T = 1;
	private static final int C = 2;
	private static final int G = 3;
	
	private boolean set;
	private WordGraph[] wg = null;
	
	public WordGraph() {
		set = false;
		wg = new WordGraph[4];
	}
	
	public void add(String param) {
		if (param.length() == 0) set = true;
		char c = param.charAt(0);
		
		switch (c) {
		case 'A':
			if (wg[A] == null) wg[A] = new WordGraph();
			wg[A].add(param.substring(1));
			break;
		case 'T':
			if (wg[T] == null) wg[T] = new WordGraph();
			wg[T].add(param.substring(1));
			break;
		case 'C':
			if (wg[C] == null) wg[C] = new WordGraph();
			wg[C].add(param.substring(1));
			break;
		case 'G':
			if (wg[G] == null) wg[G] = new WordGraph();
			wg[G].add(param.substring(1));
			break;
		}
	}
	
	public boolean search(String param) {
		if (param.length() == 0) return set;
		char c = param.charAt(0);
		
		switch (c) {
		case 'A':
			if (wg[A] == null) return false;
			return wg[A].search(param.substring(1));
		case 'T':
			if (wg[T] == null)  return false;
			return wg[T].search(param.substring(1));
		case 'C':
			if (wg[C] == null)  return false;
			return wg[C].search(param.substring(1));
		case 'G':
			if (wg[G] == null)  return false;
			return wg[G].search(param.substring(1));
		}
		
		return false;
	}
}