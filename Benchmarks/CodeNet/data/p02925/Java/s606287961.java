import java.util.*;
import java.io.*;

class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    static void init() {
        reader = new BufferedReader(new InputStreamReader(System.in) );
        tokenizer = new StringTokenizer("");
    }

    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            tokenizer = new StringTokenizer(reader.readLine() );
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }
	
    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }

    static long nextLong() throws IOException {
        return Long.parseLong( next() );
    }

    public String nextLine() throws IOException {
        return reader.readLine();
    }
    
}

public class Main {

	public static void main(String[] args) throws IOException{
		Reader.init();
		int N=Reader.nextInt();
		@SuppressWarnings("unchecked")
		LinkedList<Integer> order[]=new LinkedList[N];
		for(int i=0;i<N;i++) {
			order[i]=new LinkedList<>();
			for(int j=0;j<N-1;j++) {
				order[i].add(Reader.nextInt());
			}
		}
		
		int day=0;
		int match=0;
		while(true) {
			int flag=0;
			boolean visited[]=new boolean[N];
			for(int i=0;i<N;i++) {
				if(visited[i]==false) {
					int A=i;
					if(order[A].size()==0) {
						continue;
					}
					HashSet<Integer> set=new HashSet<Integer>();
					while(visited[A]==false) {
						visited[A]=true;
						//A=B;
						set.add(A);
						A=order[A].get(0)-1;
					}
					if(!set.contains(A)) {
						continue;
					}
					if(A!=order[order[A].get(0)-1].get(0)-1) {
						flag=-1;
						break;
					}
					//System.out.println("On Day "+day+":");
					//System.out.println("Match Between : "+A+" : "+(order[A].get(0)-1));
			
					//Match between A and B
					int B=order[A].remove(0);
					order[B-1].remove(0);
					match++;
					flag=1;
				}
			}
			
			if(flag==-1) {
				break;
			}
			else if(flag==0){
				//System.out.println("Matches : "+match);
				break;
			}
			
			day++;
		}
		
		int Match=N*(N-1)/2;
		if(match==Match){
			System.out.println(day);
		}
		else {
			System.out.println(-1);
		}
		
	}

}
