import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;


/** Class for buffered reading int and double values */
class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    /** call this method to initialize reader for InputStream */
    static void init(InputStream input) {
        reader = new BufferedReader(
                     new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }

    /** get next word */
    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            //TODO add check for eof if necessary
            tokenizer = new StringTokenizer(
                   reader.readLine() );
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }
	
    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
} 
public class third {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Reader.init(System.in);
		int n = Reader.nextInt();
		int m = Reader.nextInt();
		PriorityQueue<Long> pq = new PriorityQueue<Long>();
		// long arr[] = new int[n];
		long b[] = new long[m];
		long c[] = new long[m];
		long val = 0;
		long sum = 0;
		for(int i=0;i<n;i++)
		{
			val = Reader.nextInt();
			sum+=val;
			pq.add(val);
		}
		for(int i=0;i<m;i++)
		{
			b[i] = Reader.nextInt();
			c[i] = Reader.nextInt();
		}
		// Arrays.s/ort(arr);
		for(int i=0;i<m;i++)
		{
			while(b[i]>0)
			{
				if(pq.peek()<c[i])
				{
					val = pq.poll();
					pq.add(c[i]);
					sum+=(c[i]-val);
					b[i]--;
					continue;
				}
				break;
			}
		}

		System.out.println(sum);
	}

}