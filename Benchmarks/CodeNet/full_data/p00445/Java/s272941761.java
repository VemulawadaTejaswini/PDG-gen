import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;

class Main{
	int count(String s,String pat){
		int res=0;
		for(int i=-1;;){
			i=s.indexOf(pat,i+1);
			if(i==-1)
				break;
			res++;
		}
		return res;
	}
	void run()throws IOException{
		while(hasNext()){
			String s=next();
			int joi=count(s,"JOI");
			int ioi=count(s,"IOI");
			writer.println(joi);
			writer.println(ioi);
		}
	}
	
	// ---------- begin template ----------
	BufferedReader reader;
	StringTokenizer tokenizer;
	PrintWriter writer;
	
	boolean hasNext()throws IOException{
		while(tokenizer==null || !tokenizer.hasMoreTokens()){
			String s=reader.readLine();
			if(s==null)
				return false;
			tokenizer=new StringTokenizer(s);
		}
		return true;
	}
	String next()throws IOException{
		while(tokenizer==null || !tokenizer.hasMoreTokens())
			tokenizer=new StringTokenizer(reader.readLine());
		return tokenizer.nextToken();
	}
	int nextInt()throws IOException{
		return Integer.parseInt(next());
	}
	long nextLong()throws IOException{
		return Long.parseLong(next());
	}
	double nextDouble()throws IOException{
		return Double.parseDouble(next());
	}
	BigInteger nextBigInteger()throws IOException{
		return new BigInteger(next());
	}
	void main(){
		try{
			reader=new BufferedReader(new InputStreamReader(System.in));
			tokenizer=null;
			writer=new PrintWriter(System.out);
			run();
			reader.close();
			writer.close();
		}
		catch(Exception e){
			e.printStackTrace();
			System.exit(1);
		}
	}
	public static void main(String[] args){
		new Main().main();
	}
	// ---------- end template ----------
}