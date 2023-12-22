import java.util.*;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
    	int i, j;
    	int count[] = new int[26];
    	String moji = sc.nextLine();
    	moji = moji.toLowerCase();
    	for(i = 0; i < moji.length(); i++) {
    		char c = moji.charAt(i);
    		if('a' <= c && 'z' >= c) {
    			count[c - 'a']++;
    		}
    	}
    	for(i = 0; i < 26; i++) {
    		System.out.println((char)(i + 'a') + " : " + count[i]);
    	}
    }
}
