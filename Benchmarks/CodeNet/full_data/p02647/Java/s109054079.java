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
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	String[] input = reader.readLine().split(" ");
    	int n = Integer.parseInt(input[0]), k = Integer.parseInt(input[1]);
    	int[] arr = new int[n];
    	input = reader.readLine().split(" ");
    	for(int i = 0; i < n; i++) {
    		arr[i] = Integer.parseInt(input[i]);
    	}
    	while(k-->0) {
    		arr = next(arr);
    		if(arr[0] == n) {
    			break;
    		}
    	}
    	StringBuffer strbf = new StringBuffer();
    	for(int i = 0; i < n; i++) {
    		strbf.append(arr[i] + " ");
    	}
//    	System.out.println(k);
    	System.out.println(strbf.toString());
    }
}
