import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;

public class Main {
	
	public static void main (String [] args) throws Exception {
	    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
	    PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	    
	    int N = Integer.parseInt(f.readLine());
	    
	    StringTokenizer st = new StringTokenizer(f.readLine());
	    int[] storage = new int[N];
	    int sum = 0;
	    for(int i = 0; i < N; i++) {
	    	int x = Integer.parseInt(st.nextToken())*2;
	    	if(i % 2 == 0) {
	    		sum += x;
	    	} else {
	    		sum -= x;
	    	}
	    	storage[i] = x;
	    }
	    //System.out.println(Arrays.toString(storage));
	    
	    int[] answers = new int[N];
	    answers[0] = sum / 2;
	    for(int i = 1; i < N; i++) {
	    	answers[i] = (storage[i-1] - answers[i-1]);
	    }
	    
	    System.out.print(answers[0]);
	    for(int i = 1; i < answers.length; i++) {
	    	System.out.print(" " + answers[i]);
	    }
	    System.out.println();
	    
	    
	    out.close();
	    f.close();
	}
	
}