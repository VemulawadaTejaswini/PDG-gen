import java.util.*;

public class Main {
    public static void main (String [] args) {
	String str = new Scanner(System.in).nextLine();
	int [] count = new int [26];

	for (int i = 0 ; i < str.length() ; i++) {
	    char c = str.charAt(i);

	    if ('A' <= c && c < 'Z') {
		count[c-'A']++;
	    } else if('a' <= c && c <= 'z') {
		count[c-'a']++;
	    }
	}

	for (int i = 0 ; i < 26 ; i++) {
	    System.out.println((char)('a' + i) + " : " + count[i]);
	}
    }
}