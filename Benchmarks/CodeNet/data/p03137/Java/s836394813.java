
import java.io.*;
import java.util.*;

public class Main{

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner();
		PrintWriter out=new PrintWriter(System.out);
		int n=sc.nextInt(),m=sc.nextInt();
		Integer[]a=new Integer[m];
		for(int i=0;i<m;i++)
			a[i]=sc.nextInt();
		Arrays.sort(a);
		if(n>=m)
			out.println(0);
		else if(n==1) {
			
			out.println(a[m-1]-a[0]);
		}
		else if(n%2==0){
			int max=0;
			int left=n/2-1,right=m-n/2;
			int sum=0;
			for(int i=left;i+1<=right;i++) {
				sum+=a[i+1]-a[i];
				max=Math.max(max, a[i+1]-a[i]);
			}
			out.println(sum-max);
		}
		else if(n!=1){
			int left=n/2-1,right=m-n/2;
			if(left>=0 && a[left+1]-a[left]>a[right]-a[right-1]) {
				left++;
			}
			else
				right--;
			if(left<0)
				left++;
			int max=0;
			int sum=0;
			for(int i=left;i+1<=right;i++) {
				sum+=a[i+1]-a[i];
				max=Math.max(max, a[i+1]-a[i]);
			}
			out.println(sum-max);
			
		}
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
