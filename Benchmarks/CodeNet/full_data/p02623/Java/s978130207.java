import java.util.*;
import java.io.*;
public class Main{
	
	//make it false if Multiple test case is not in the question
	static boolean multipleTC = false;
	
	//for pre processing if needed
	void pre() throws Exception
	{}
		public static void main(String[] args) throws Exception{
			
		new Main().run();
	  }
	  



	// input output handled here
	private String in_out(int tc) throws Exception{
		  //take input here
		  int n=ni();
		  int m=ni();
		  int k=ni();
		  int[] arr=new int[n];
		  int[] arr2=new int[m];
		  for(int i=0;i<n;i++){
			arr[i]=ni();
		  }
		  for(int i=0;i<m;i++){
		  arr2[i]=ni();
		  }
		  int count=0;
		  int i=0;
		  for(;i<Math.min(n,m) && k>0;i++){
			if(k<=0)
			break;
			  if(arr[i]<=k){
			  k-=arr[i];
			count++;}
			  if(arr2[i]<=k){
			  k-=arr2[i];
			count++;
			}
		  }
		  int[] rest;
		if(n>m)  
		  rest=arr;
		  else
		  rest=arr2;

		  for(;i<Math.max(n,m);i++){
			  if(k<=0)
			  break;
			if(rest[i]<=k){
				k-=rest[i];
			  count++;
			}
		  }

		return ""+count;

	}
	

	

	
	
	void run() throws Exception{
	//	long start_time=System.nanoTime();

	//	in = new FastReader("input.txt");  out = new PrintWriter("output.txt");
		in = new FastReader(); out = new PrintWriter(System.out);
		


		StringBuilder print=new StringBuilder("");
		pre();
		int T = (multipleTC)?ni():1;
		for(int t = 1; t<= T; t++){
		print.append(in_out(t)).append("\n");
		}

		p(print);
		//long end_time=System.nanoTime();
		//System.out.println("Running Time in nano sec : "+(end_time-start_time));
		
		out.flush();
		out.close();
	}
	
	PrintWriter out;
		FastReader in;
		
			void p(Object o)
				{out.print(o);}
			void pln(Object o)
				{out.println(o);}
			void pnf(Object o)
				{out.println(o);
				out.flush();}
		
			String n()throws Exception
				{return in.next();}
		
			String nln()throws Exception
				{return in.nextLine();}
		
			int ni()throws Exception
				{return Integer.parseInt(in.next());}
		
			long nl()throws Exception
				{return Long.parseLong(in.next());}
		
			double nd()throws Exception
				{return Double.parseDouble(in.next());}
	
		class FastReader{
			BufferedReader br;
			StringTokenizer st;
			
			public FastReader(){
				br = new BufferedReader(new InputStreamReader(System.in));
			}
	
			public FastReader(String s) throws Exception{
				br = new BufferedReader(new FileReader(s));
			}
	
			String next() throws Exception{
				while (st == null || !st.hasMoreElements()){
					try{
						st = new StringTokenizer(br.readLine());
					}catch (IOException  e){
						throw new Exception(e.toString());
					}
				}
				return st.nextToken();
			}
	
			String nextLine() throws Exception{
				String str = "";
				try{   
					str = br.readLine();
				}catch (IOException e){
					throw new Exception(e.toString());
				}  
				return str;
			}
		}
}