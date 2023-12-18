import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws Exception{ new Main(new Reader()); }
	public Main(Reader rr) throws IOException{
		int a=rr.ni()*100, b=rr.ni()*100, c=rr.ni(), d=rr.ni(), e=rr.ni(), f=rr.ni(), sugar=0, water=a;
		int[] waters1=new int[1+(f/a)];
		int[] waters2=new int[1+(f/b)];
		int[] waters=new int[(1+(f/a))*(1+(f/b))-1];
		ArrayList<Integer> vals=new ArrayList<Integer>();
		ArrayList<Integer> vals2=new ArrayList<Integer>();
		for(int i=0; i<waters1.length; i++) waters1[i]=i*a;
		for(int i=0; i<waters2.length; i++) waters2[i]=i*b;
		int index=0;
		for(int i=0; i<waters1.length; i++){
			for(int j=0; j<waters2.length; j++){
				if(i==0&&j==0) continue;
				waters[index]=waters1[i]+waters2[j];
				if(waters[index]*e/100<=f){
					vals.add(waters[index]*e/100);
					vals2.add(waters[index]);
				}
				index++;
			}
		}
		double best=0;
		int bestSugar=0;
		int bestWater=0;
		int[] ways1=new int[1+(e/c)];
		int[] ways2=new int[1+(e/d)];
		for(int i=0; i<ways1.length; i++) ways1[i]=i*c;
		for(int i=0; i<ways2.length; i++) ways2[i]=i*d;
		for(int i=0; i<ways1.length; i++){
			for(int j=0; j<ways2.length; j++){
				if(i==0&&j==0) continue;
				int check=ways1[i]+ways2[j];
				for(int k=0; k<vals.size(); k++){
					int modifier=vals.get(k)/check;
					if(modifier==0) continue;
					double check2=(modifier*check)/((double)vals2.get(k)+(modifier*check));
					if(vals2.get(k)+modifier*check<=f&&check2>best){
						best=check2;
						bestWater=vals2.get(k);
						bestSugar=modifier*check;
					}
				}
			}
		}
		System.out.println((bestWater+bestSugar)+" "+bestSugar);
	}
	static class Reader{
		private DataInputStream din;
		private byte[] buffer=new byte[1024];
		private int bufP, bytR;
		public Reader() throws IOException{
			din=new DataInputStream(System.in);
			bufP=bytR=0;
		}
		public Reader(String file) throws IOException{
			din=new DataInputStream(new FileInputStream(file));
			bufP=bytR=0;
		}
		private String rl() throws IOException{
			byte[] buf=new byte[1024];
			int cnt=0, c;
			while((c=read())!=-1){
				if(c=='\n') break;
				buf[cnt++]=(byte)c;
			}
			return new String(buf, 0, cnt);
		}
		private int ni() throws IOException{
			int num=0;
			byte c=read();
			while(c<=' ') c=read();
			boolean neg=(c=='-');
			if(neg) c=read();
			do{
				num=num*10+c-'0';
			} while((c=read())>='0'&&c<='9');
			if(neg) return -num;
			return num;
		}
		private long nl() throws IOException{
			long num=0;
			byte c=read();
			while(c<=' ') c=read();
			boolean neg=(c=='-');
			if(neg) c=read();
			do{
				num=num*10+c-'0';
			} while((c=read())>='0'&&c<='9');
			if(neg) return -num;
			return num;
		}
		private double nd() throws IOException{ return Double.parseDouble(ns()); }
		private char nc() throws IOException{ return (char)next(); }
		private String ns() throws IOException{
			int c=next();
			StringBuilder sb=new StringBuilder();
			while(!(isChar(c))){
				sb.appendCodePoint(c);
				c=read();
			}
			return sb.toString();
		}
		private char[] ns(int n) throws IOException{
			char[] buf=new char[n];
			int c=next(), r=0;
			while(r<n&&!(isChar(c))){
				buf[r++]=(char)c;
				c=next();
			}
			return n==r?buf:Arrays.copyOf(buf, r);
		}
		private char[][] nm(int n, int m) throws IOException{
			char[][] map=new char[n][];
			for(int i=0; i<n; i++) map[i]=ns(m);
			return map;
		}
		private int[] na(int n) throws IOException{
			int[] a=new int[n];
			for(int i=0; i<n; i++) a[i]=ni();
			return a;
		}
		private boolean isChar(int c) throws IOException{ return !(c>=33&&c<=126); }
		private int next() throws IOException{ int c; while((c=read())!=-1&&isChar(c)); return c; }
		private byte read() throws IOException{
			if(bufP==bytR){
				bytR=din.read(buffer, bufP=0, 1024);
				if(bytR==-1) buffer[0]=-1;
			}
			return buffer[bufP++];
		}
		public void close() throws IOException{
			if(din==null) return;
			din.close();
		}
	}
}
