import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) {
		MyScanner sc=new MyScanner();
		PrintWriter pw=new PrintWriter(System.out);
		
		n=sc.nextInt();
		a=new int [n];
		boolean pos=false;
		boolean neg=false;
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			if(a[i]<0)
				neg=true;
			if(a[i]>0)
				pos=true;
		}
		if(!neg){
			pw.println(n-1);
			for(int i=1;i<n;i++)
				pw.println(i+" "+(i+1));
		}else
			if(!pos){
				pw.println(n-1);
				for(int i=n;i>1;i--)
					pw.println(i+" "+(i-1));
			}else{
				int idxmax=0;
				int max=0;
				for(int i=0;i<n;i++)
					if(Math.abs(a[i])>max){
						max=Math.abs(a[i]);
						idxmax=i;
					}
				ArrayList<Integer> x=new ArrayList<Integer>();
				ArrayList<Integer> y=new ArrayList<Integer>();
				for(int i=0;i<n;i++){
					if(a[idxmax]<0 && a[i]>0){
						x.add(idxmax+1);
						y.add(i+1);
					}
					if(a[idxmax]>0 && a[i]<0){
						x.add(idxmax+1);
						y.add(i+1);
					}
				}
				pw.println(n-1+x.size());
				for(int i=0;i<x.size();i++)
					pw.println(x.get(i)+" "+y.get(i));
				if(a[idxmax]<0){
					for(int i=n;i>1;i--)
						pw.println(i+" "+(i-1));
				}else{
					for(int i=1;i<n;i++)
						pw.println(i+" "+(i+1));
				}
			}
		
		pw.flush();
		pw.close();
	}
	static int n;
	static int [] a;
	
	static class MyScanner{
		BufferedReader br;
		StringTokenizer st;
		
		MyScanner(){
			br=new BufferedReader(new InputStreamReader(System.in));
		}
		String next(){
			while(st==null || !st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (Exception e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		int nextInt(){
			return Integer.parseInt(next());
		}
		long nextLong(){
			return Long.parseLong(next());
		}
	}
}
