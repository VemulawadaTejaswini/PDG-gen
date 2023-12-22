
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
 
public class Main {
     
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
     
    private void solv() {
        Scanner input = new Scanner(System.in);
         
        int n = input.nextInt();
        int[] S = new int[n];
        for (int i = 0; i < n; i++) {
        	S[i] = input.nextInt();
        }
        int partition = 0;
        for (int i = 0; i < S.length; i++) {
			if (S[i] <= S[S.length - 1]) {
				int temp = S[i];
				S[i] = S[partition];
				if (S[i] == S[S.length - 1]) {
					S[partition]  = (-1)*temp;	
				}else{
					S[partition]  = temp;
				}
				
				partition++;
			}
		}
        print(S);
    }
  
    private void print(Object[] xs) {
        StringBuilder sb = new StringBuilder();
        for (Object x : xs) sb.append(x.toString()).append(' ');
        System.out.println(sb.toString().trim());
    }
     
    private void print(int[] xs) {
        StringBuilder sb = new StringBuilder();
        for (int x : xs) {
        	if (x < 0) {
        		sb.append("[" + (-1)*x + "]").append(' ');
			}else{
				sb.append(x).append(' ');	
			}
        	
        }
        System.out.println(sb.toString().trim());
    }
     
    private static class Scanner {
        BufferedReader r;
        StreamTokenizer st;
         
        public Scanner(InputStream in) {
            r = new BufferedReader(new InputStreamReader(in));
            st = new StreamTokenizer(r);
        }
         
        public String next() {
            nextToken();
            return st.sval;
        }
         
        public Integer nextInt() {
            nextToken();
            return (int)st.nval;
        }
         
        private int nextToken() {
            int token = st.TT_EOF;
            try {
                token = st.nextToken();
            } catch (IOException e) {
            }
            return token;
        }
    }
}