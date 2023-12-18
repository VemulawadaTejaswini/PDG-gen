import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int len = s.length();
		int[] ary = new int[26];
		for( int i = 0; i < len; i++ ) {
			ary[s.charAt(i)-'a']++;
		}
		int max = 0;
		for( int i = 0; i < 26; i++ ) {
			max = Math.max(ary[i], max);
		}
		System.out.println(Arrays.toString(ary));
		if( max == 1 ) System.out.println("-1 -1");
		else {
			int ind = 0; // index of the letter
			for( int i = 0; i < 26; i++ ) {
				if( ary[i] == max ) {
					ind = i;
					break;
				}
			}
			char targetChar = (char) (ind+'a');
			int start = -1;
			int length = 0;
			int maxCharCt = 0;
			String ans = "-1 -1";
			for( int i = 0; i < len; i++ ) {
				if( s.charAt(i) == targetChar && start == -1 ) {
					start = i;
					maxCharCt++;
					length++;
				} else if( start != -1 ){
					if(s.charAt(i) == targetChar) {
						maxCharCt++;
					}
					length++;
				}
				
				if( length >= 2 && maxCharCt >= Math.floor(length/2) ) {
					if( length == 2 && maxCharCt == 2 ) {
						ans = (start+1) + " " + (start+length); break;
					} else if( length > 2 && maxCharCt >= Math.floor(length/2) ) {
						ans = (start+1) + " " + (start+length); break;
					}
				}
			}
			System.out.println(ans);
		}
	}
}