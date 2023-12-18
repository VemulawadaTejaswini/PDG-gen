import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
    	FastScanner sc = new FastScanner(System.in);
    	int N = sc.nextInt();
    	int K = sc.nextInt();
    	int[] nums = new int[N];
    	for(int i = 0; i < N; ++i) {
    		nums[i] = sc.nextInt();
    	}
    	Arrays.sort(nums);
    	int left = 0, right = K - 1, min = Integer.MAX_VALUE;
    	while(right < N) {
    		min = Math.min(min, Math.abs(nums[right]) + nums[right] - nums[left]);
    		min = Math.min(min, Math.abs(nums[left]) + nums[right] - nums[left]);
    		left++;
    		right++;
    	}
    	System.out.println(min);
    }
}

class FastScanner {
    BufferedReader br;
    StringTokenizer st;
    boolean hasNext;

    public FastScanner(InputStream is) {
        br = new BufferedReader(new InputStreamReader(is));
        hasNext = true;
    }

    public String nextToken() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                hasNext = false;
                return "##";
            }
        }
        return st.nextToken();
    }

    String next = null;
    public boolean hasNext(){
        next = nextToken();
        return hasNext;
    }

    public int nextInt() {
        if (next == null){
            hasNext();
        }
        String more = next;
        next = null;
        return Integer.parseInt(more);
    }

    public long nextLong() {
        if (next == null){
            hasNext();
        }
        String more = next;
        next = null;
        return Long.parseLong(more);
    }

    public double nextDouble() {
        if (next == null){
            hasNext();
        }
        String more = next;
        next = null;
        return Double.parseDouble(more);
    }

    public String nextString(){
        if (next == null){
            hasNext();
        }
        String more = next;
        next = null;
        return more;
    }

    public char nextChar(){
        if (next == null){
            hasNext();
        }
        String more = next;
        next = null;
        return more.charAt(0);
    }
}