import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class Main {

	public static void main(String[] args) {
		 FastScanner scanner =new FastScanner();
		 PrintWriter out=new PrintWriter(System.out);
		 int n=scanner.nextInt();
		char c[] = scanner.next().toCharArray();
		 int numr=0,numw=0;
		 ArrayList<Integer> aList=new ArrayList<>();
		 for(int i=0;i<n;i++) {
			 if(c[i]=='R') {
				 numr++;
				 aList.add(i);
			 }
			 else {
				 numw++;
			 }
		 }
		 //System.out.println(aList);
		 //System.out.println();
		 int res=Math.min(numr,	 numw);
		 int count=0;
		 for(int i=0;i<aList.size();i++) {
			 if(aList.get(i)>numr-1) break;
			 else count++;
		 }
		 res=Math.min(res, aList.size()-count);
		System.out.println(res);
	
		    	
		    }
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
}

		    
		}