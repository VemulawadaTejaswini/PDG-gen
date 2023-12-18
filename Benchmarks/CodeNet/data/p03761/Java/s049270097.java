import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] base = getCharCount(sc.next());
		for (int i = 1; i < n; i++) {
		    base = mearge(base, getCharCount(sc.next()));
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 26; i++) {
		    for (int j = 0; j < base[i]; j++) {
		        sb.append((char)(i + 'a'));
		    }
		}
		System.out.println(sb);
	}
	
	static int[] mearge(int[] arr1, int[] arr2) {
	    for (int i = 0; i < arr1.length; i++) {
	        arr1[i] = Math.min(arr1[i], arr2[i]);
	    }
	    return arr1;
	}
	
	static int[] getCharCount(String s) {
	    char[] arr = s.toCharArray();
	    int[] ans = new int[26];
	    for (char c : arr) {
	        ans[c - 'a']++;
	    }
	    return ans;
	}

}
