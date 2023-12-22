import java.util.Arrays;
import java.util.Scanner;

public class Main {
	String[] word;
	int[] rank;

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String letter = scan.nextLine();
			word = letter.split(" ");
			//System.out.println(Arrays.toString(word));
			
			rank = new int[word.length];
			Arrays.fill(rank, 0);
			
			for (int i = 0; i < word.length; i++) {
				for (int j = 0; j < word.length; j++) {
					if (word[i].equals(word[j])) rank[i]++;
				}
			}
			
			int max = 0, mindex = -1;
			int lng = 0, lindex = -1;
			for (int i = 0; i < word.length; i++) {
				if (max < rank[i]) {
					max = rank[i];
					mindex = i;
				}
				if (lng < word[i].length()) {
					lng = word[i].length();
					lindex = i;
				}
			}
			
			System.out.println(word[mindex] + " " + word[lindex]);
		}
		
		
	}
	
	private void debug() {
		System.out.println();
	}

}