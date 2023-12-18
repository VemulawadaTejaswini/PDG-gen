import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Rot.init(System.in);
		int N=Rot.nextInt();
		int M=Rot.nextInt();
				
		disj d=new disj(N);
		
		for(int x=0;x<M;x++) {
			int X=Rot.nextInt();
			int Y=Rot.nextInt();
			int Z=Rot.nextInt();
			
			d.union(X-1, Y-1);
		}
		
		int[] ans=new int[N];
		
		for(int g=0;g<N;g++) {
			ans[d.find(g)]=1;
		}
		
		int count=0;
		for(int h=0;h<N;h++) {
			count+=ans[h];
		}
		System.out.println(count);

	}

}

class elem{
	int data;
	int rank;
}

class disj{
	elem[] arr;
	
	disj(int n){
		arr=new elem[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=new elem();
			arr[i].data=i;
			arr[i].rank=1;
		}
	}
	
	int find(int x) {
		if(arr[x].data==x) {
			return x;
		}
		else {
			return arr[x].data=find(arr[x].data);
		}
	}
	
	void union(int a,int b){
		unify(find(a),find(b));
	}
	
	void unify(int a,int b){
		if(arr[a].rank>arr[b].rank) {
			arr[b].data=a;
		}
		else {
			arr[a].data=b;
			
			if(arr[a].rank==arr[b].rank) {
				arr[b].rank+=1;
			}
		}
	}
}


/** Class for buffered reading int and double values */
class Rot {
	static BufferedReader reader;
	static StringTokenizer tokenizer;

	/** call this method to initialize reader for InputStream */
	static void init(InputStream input) {
		reader = new BufferedReader(new InputStreamReader(input));
		tokenizer = new StringTokenizer("");
	}

	/** get next word */
	static String next() throws IOException {
		while (!tokenizer.hasMoreTokens()) {
			// TODO add check for eof if necessary
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}

	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	static double nextDouble() throws IOException {
		return Double.parseDouble(next());
	}
	
	static long nextLong() throws IOException {
		return Long.parseLong(next());
	}
}


