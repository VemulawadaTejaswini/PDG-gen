import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static int[] next(int[] prev) {
		int[] curr = new int[prev.length];
		for(int i = 0; i < prev.length; i++) {
			int x = prev[i];
			int l = Math.max(0, i - x), r = Math.min(prev.length - 1, i + x);
			curr[l]++;
			if(r + 1 < prev.length) {
				curr[r + 1]--;
			}
		}
		for(int i = 1; i < curr.length; i++) {
			curr[i] += curr[i - 1];
		}
		return curr;
	}
	
    public static void main(String[] args) throws IOException {
    	Scanner s = new Scanner(System.in);
    	int n = s.nextInt(), k = s.nextInt();
    	int[] arr = new int[n];
    	boolean nonZero = false;
    	for(int i = 0; i < n; i++) {
    		arr[i] = s.nextInt();
    		if(arr[i] != 0) {
    			nonZero = true;
    		}
    	}
    	if(!nonZero) {
    		arr = new int[n];
    	}
    	while(k-->0 && nonZero) {
    		arr = next(arr);
//    		StringBuffer strbf = new StringBuffer();
//        	for(int i = 0; i < n; i++) {
//        		strbf.append(arr[i] + " ");
//        	}
//        	System.out.println(strbf.toString());
    	}
    	StringBuffer strbf = new StringBuffer();
    	for(int i = 0; i < n; i++) {
    		strbf.append(arr[i] + " ");
    	}
    	System.out.println(strbf.toString());
    }
}
