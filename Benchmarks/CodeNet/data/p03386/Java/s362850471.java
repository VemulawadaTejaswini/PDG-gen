
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String str = br.readLine().trim();
        StringTokenizer stk = new StringTokenizer(str);
        int A = Integer.parseInt(stk.nextToken());
        int B = Integer.parseInt(stk.nextToken());
        int K = Integer.parseInt(stk.nextToken());int count=0;
        if(K>Math.max(A, B)) {
        	for(int i=A;i<=B;i++) 
            	System.out.println(i);
        }
        else {
        	int x = B-A+1;
        	if(x/2>K) {
        		for(int i=0;i<K;i++) {
        			System.out.println(A+i);
        		}
        		int y = K;
        		for(int i=0;i<y;i++) {
        			System.out.println(B-(K--)+1);
        		}
        	}
        	else {
        		for(int i=0;i<2*K;i++) {
        			System.out.println(A++);
        		}
        	}
        }
        

	}

}
