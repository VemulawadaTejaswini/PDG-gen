import java.util.*;
import java.util.Map.Entry;
import java.io.*;
public class Main{
	public static void main(String[] args) {
		MyScanner sc=new MyScanner();
		PrintWriter pw=new PrintWriter(System.out);
		
		int n=sc.nextInt();
		int k=sc.nextInt();
		TreeMap<Integer, Integer> map=new  TreeMap<Integer, Integer>();
		while(n-->0){
			int x=sc.nextInt();
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		ArrayList<Integer> c=new ArrayList<Integer>();
		for(Entry<Integer 	, Integer> e : map.entrySet()){
			c.add(e.getValue());
		}
		if(c.size()<=k)
			pw.println(0);
		else{
			Collections.sort(c);
			int ans=0;
			for(int i=0;i<c.size()-k;i++)
				ans+=c.get(i);
			pw.println(ans);
		}
		
		pw.flush();
		pw.close();
	}
	
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
