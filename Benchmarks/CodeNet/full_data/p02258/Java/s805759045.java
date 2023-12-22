import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args){
	
	int N;
	//数の上限
	InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
	InputReader input = new InputReader(inputStream);
	N = input.nextInt();
	int[] num = new int[N];
	for(int i = 0;i < N;i++){
	    num[i] = input.nextInt();
	}
	int minv = num[0];
	int maxv = num[1] - num[0];
	for(int j = 1;j < N;j++){
	    maxv = maxv > (num[j] - minv)?maxv:num[j] - minv;
	    minv = minv < num[j]?minv:num[j];
	}
	System.out.printf("%d\n",maxv);
    }
}
class InputReader {
    public BufferedReader reader;
    public StringTokenizer tokenizer;
    
    public InputReader(InputStream stream) {
	reader = new BufferedReader(new InputStreamReader(stream), 32768);
	tokenizer = null;
    }
    
    public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
    }
    
    public int nextInt() {
	return Integer.parseInt(next());
    }
}
