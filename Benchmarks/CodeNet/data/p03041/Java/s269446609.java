import java.util.Scanner;

public class Main {
	String [] words = new String[100];
	private Scanner kb;
	public void process() {
		kb = new Scanner(System.in);
		int N = kb.nextInt();
		int K = kb.nextInt();
		String S = kb.next();
		
		for(int i=0; i<N; i++) {
			words[i] = S.substring(i,i+1);
		}
		words[K-1] = words[K-1].toLowerCase();
		for(int i=0; i<N; i++) {
			System.out.print(words[i]);
		}
	}

	public static void main(String [] args) {
		Main app = new Main();
		app.process();
	}
}
