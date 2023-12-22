import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while (true) {
		    String s = sc.next();
		    if (s.equals("#")) {
		        break;
		    }
		    String[] arr = s.split("/");
		    int h = arr.length;
		    int w = getSize(arr[0]);
		    boolean[][] field = new boolean[h][];
		    for (int i = 0; i < h; i++) {
		        field[i] = getArray(arr[i], w);
		    }
		    field[sc.nextInt() - 1][sc.nextInt() - 1] = false;
		    field[sc.nextInt() - 1][sc.nextInt() - 1] = true;
		    for (int i = 0; i < h; i++) {
		        if (i > 0) {
		            sb.append("/");
		        }
		        sb.append(getString(field[i]));
		    }
		    sb.append("\n");
		}
		System.out.print(sb);
	}
	
	static String getString(boolean[] arr) {
	    StringBuilder sb = new StringBuilder();
	    int count = 0;
	    for (boolean b : arr) {
	        if (b) {
	            if (count > 0) {
	                sb.append(count);
	                count = 0;
	            }
	            sb.append("b");
	        } else {
	            count++;
	        }
	    }
	    if (count > 0) {
	        sb.append(count);
	    }
	    return sb.toString();
	}
	
	static int getSize(String s) {
	    int ans = 0;
	    for (char c : s.toCharArray()) {
	        if (c == 'b') {
	            ans++;
	        } else {
	            ans += c - '0';
	        }
	    }
	    return ans;
	}
	
	static boolean[] getArray(String s, int length) {
	    boolean[] ans = new boolean[length];
	    int idx = 0;
	    for (char c : s.toCharArray()) {
	        if (c == 'b') {
	            ans[idx] = true;
	            idx++;
	        } else {
	            idx += c - '0';
	        }
	    }
	    return ans;
	}
}

