import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

class Main{
    public static void main(String[] args){
	int count = 0;
	int N;
	InputStream inputStream = System.in;
	InputReader input = new InputReader(inputStream);
	N = input.nextInt();
	int[] num = new int[N];
	for(int i = 0;i < N;i++){
	    num[i] = input.nextInt();
	}
	for (int i = 0; i < N - 1; i++) {
	    for(int j = N-1;j > i;j--){
		if(num[j - 1] > num[j]){
		    int temp = num[j - 1];
		    num[j - 1] = num[j];
		    num[j] = temp;
		    count++;
		}
	    }
	}
	
	print(num);
	System.out.println(count);
    }
    static void print(int[] num){
	        for (int i = 0; i < num.length; i++) {
            if (i != 0) {
                System.out.print(" ");
            }
            System.out.print(num[i]);
        }
        System.out.println();
    }
}


class InputReader{
    public BufferedReader reader;
    public StringTokenizer tokenizer;
    //InputReaderクラスのコンストラクタ
    public InputReader(InputStream stream){
	reader = new BufferedReader(new InputStreamReader(stream),32768);
	tokenizer = null;	
    }
    public String next(){
	while (tokenizer == null || !tokenizer.hasMoreTokens()){
	    try{
		tokenizer = new StringTokenizer(reader.readLine());	    
	    }catch(IOException e){
		throw new RuntimeException(e);
	    }
	}
	return tokenizer.nextToken();
    }
    public int nextInt(){
	return Integer.parseInt(next());
    }
    
}

