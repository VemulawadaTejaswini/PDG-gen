import java.util.*;
import java.io.*;
public class Main{
	static final int MOD=998244353;
	public static void main(String[] args) throws IOException{
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		StringTokenizer st=new StringTokenizer(in.readLine());
		int k=Integer.parseInt(st.nextToken());
		int n=Integer.parseInt(st.nextToken());
		int[] vec=new int[n];
		st=new StringTokenizer(in.readLine());
		int i;
		int suma=0;
		for(i=0;i<n;i++) {
			vec[i]=Integer.parseInt(st.nextToken());
			if(i!=0&&i!=n-1) {
				suma+=Math.abs(vec[i]-vec[i-1]);
			}
		}
		suma+=Math.min(Math.abs(vec[n-1]-vec[n-2]),Math.abs(vec[n-1]-k));
		out.append(suma+"\n");
		
		out.flush();
		in.close();
		out.close();
	}
}     
