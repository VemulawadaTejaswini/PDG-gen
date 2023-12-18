import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int length = arr.length;
		StringBuilder sb = new StringBuilder();
		int total = 0;
		for (int i = 0; i < length; i++) {
		    if (arr[i] == 'A') {
		        sb.append("a");
		    } else if (arr[i] == 'B' && i < length - 1 && arr[i + 1] == 'C') {
		        sb.append("b");
		        i++;
		    } else {
		        total += getCount(sb);
		        sb.setLength(0);
		    }
		}
		total += getCount(sb);
		System.out.println(total);
	}
	
	static int getCount(StringBuilder sb) {
	    boolean exist = false;
	    int idx = 0;
	    int count = 0;
	    for (int i = 0; i < sb.length(); i++) {
	        if (sb.charAt(i) == 'a') {
	            exist = true;
	        } else if (sb.charAt(i) == 'b') {
	            if (exist) {
	                count += i - idx;
	            }
	            idx++;
	        }
	    }
	    return count;
	}
}
