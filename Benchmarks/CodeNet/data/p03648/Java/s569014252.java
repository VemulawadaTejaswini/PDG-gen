
import java.io.*;
import java.util.*;


public class Main{

	
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner();
		PrintWriter out=new PrintWriter(System.out);
		long k=sc.nextLong();
		
			int []a;
			int n;
			if(k==0) {
				a=new int [2];
				n=2;
			}
			else if(k<50){
				n=50;
				a=new  int [n];
				int maxSum=(int) (n*(k+1)-1);
				a[n-1]=maxSum;
			}
			else {
				n=50;
				a=new int [n];
				
				for(int i=0;i<n;i++)
					a[i]=(int) Math.max(0, 2*n-k);
				
				
			}
			
		out.println(n);
		for(int x:a)
			out.println(x);
		out.close();

	}
	static class Scanner
	{
		BufferedReader br;
		StringTokenizer st;
		Scanner(){
			br=new BufferedReader(new InputStreamReader(System.in));
		}
		Scanner(String fileName) throws FileNotFoundException{
			br=new BufferedReader(new FileReader(fileName));
		}
		String next() throws IOException {
			while(st==null || !st.hasMoreTokens())
				st=new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		String nextLine() throws IOException {
			return br.readLine();
		}
		int nextInt() throws IOException{
			return Integer.parseInt(next());
		}
		long nextLong()  throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}
		double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}
	}
}
