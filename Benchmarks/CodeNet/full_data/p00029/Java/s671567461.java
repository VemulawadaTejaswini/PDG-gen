import java.util.Arrays;
import java.util.Scanner;


public class Main {

	static Scanner sc = new Scanner( System.in );
	
	public static void main(String[] args) {
		
		String str[] = sc.nextLine().split(" ");
		
		String word[] = new String[str.length];
		int word_count[] = new int[str.length];
		Arrays.fill(word_count, 0);
		
		for (int i=0; i < str.length; i++) {
			
			boolean flag = false;
			
			for( int j=0; j < word.length; j++ ) {
				if ( str[i].equals(word[j]) ) {
					word_count[j]++;
					flag = true;
				}
			}
			
			if ( !flag ) {
				word[i] = str[i];
				word_count[i]++;
			}
		}
		
		int most=0, longest=0;
		int max = Integer.MIN_VALUE;
		int word_length = Integer.MIN_VALUE;
		for ( int i=0; i < word_count.length; i++ ) {
			if ( max < word_count[i] ){
				max = word_count[i];
				most = i;
			}

			if ( word[i] != null ) {
				if ( word_length < word[i].length() ) {
					longest = i;
					word_length = word[i].length();
				}
			}
		}
		
		System.out.println( word[most] + " " + word[longest] );

	}
}