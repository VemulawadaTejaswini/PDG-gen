import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] base = new int[26];
		char[] org = "AIDUNYAN".toCharArray();
		for (char c : org) {
		    base[c - 'A']++;
		}
		char[] next = "AIZUNYAN".toCharArray();
		char[] arr = sc.next().toCharArray();
		int length = arr.length;
		int left = 0;
		int right = -1;
		int[] count = new int[26];
		while (right < length) {
		    while (right < length && right - left < org.length - 1) {
		        right++;
		        if (right < length) {
		            count[arr[right] - 'A']++;
		        }
		    }
		    if (right >= length) {
		        break;
		    }
	        if (equals(count, base)) {
	            for (int i = left; i <= right; i++) {
	                arr[i] = next[i - left];
	            }
	            left = right + 1;
	            Arrays.fill(count, 0);
	        } else {
	            count[arr[left] - 'A']--;
	            left++;
	        }
		}
	    System.out.println(arr);
	}
	
	static boolean equals(int[] arr, int[] another) {
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] != another[i]) {
	            return false;
	        }
	    }
	    return true;
	}
}

