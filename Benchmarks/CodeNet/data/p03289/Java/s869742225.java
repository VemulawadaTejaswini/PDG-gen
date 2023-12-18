import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
    	FastScanner sc = new FastScanner(System.in);
    	String str = sc.nextToken();
    	char[] s = str.toCharArray();
    	boolean flag = true, existC = false;
    	if(s.length < 4 || s.length > 10 || s[0] != 'A')
    		flag = false;
    	for(int i = 1; i < s.length && flag; ++i) {
    		if(s[i] <= 'z' && s[i] >= 'a')
    			continue;
    		else if(s[i] == 'C') {
    			if(!existC && i > 1 && i < s.length-1)
    				existC = true;
    			else
    				flag = false;
    		} else {
				flag = false;
			}
    	}
    	if(flag && existC)
    		System.out.println("AC");
    	else
    		System.out.println("WA");
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