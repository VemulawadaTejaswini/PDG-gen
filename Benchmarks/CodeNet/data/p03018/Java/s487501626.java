import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		
		Reader.init(System.in);
		PrintWriter out=new PrintWriter(System.out);
		StringBuffer output=new StringBuffer("");
		char[] s=Reader.next().toCharArray();
		int n=s.length;
		int ans=0;
		int ch=0;
		for(int i=0;i<n-2;i++) {
			if(s[i]=='A' && s[i+1]=='B' && s[i+2]=='C') {
				ch++;
				s[i]='B';s[i+1]='C';s[i+2]='A'; ans+=ch;
				ch=0;
			}
			if(s[i]=='A')ch++;
			else ch=0;
		}
		
		
		out.println(ans);
		out.flush();
	}
}



class NoD{
	int a;int b, c;
	String s;

	NoD(int aa,int bb,int cc){
		a=aa;b=bb;c=cc;
		s=a+" "+b+" "+c;
		
	}
	
//	NoD(int aa,int bb,int cc){
//		a=aa;b=bb;c=cc;
//	}
//	NoD(long m,long l,long r,long t){
//		ms=m;ls=l;rs=r;ts=t;
//	}
	@Override
	public boolean equals(Object o) {
		if(o!=null && o.getClass()==getClass()) {
			NoD c= (NoD) o;
			return c.a==a && c.b==b;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return s.hashCode();
	}
}
class DisJoint {
	int[] arr;
	int[] parent;
	int[] rank;
	DisJoint(int n){
		arr=new int[n+1];
		parent=new int[n+1];
		rank=new int[n+1];
		for(int i=1;i<=n;i++) {
			arr[i]=i;
			parent[i]=i;
			rank[i]=0;
		}
	}

	int find(int value) {
		int par=parent[value];
		if(par==value)
			return par;
		parent[value]=find(par);
		return parent[value];
	}
	
	void union(int data1,int data2) {
		int parent1=find(data1);
		int parent2=find(data2);
		if(parent1!=parent2) {
			if(rank[parent1]>=rank[parent2]) {
				parent[parent2]=parent1;
				if(rank[parent1]==rank[parent2])
					rank[parent1]++;
			}
			else {
				parent[parent1]=parent2;
			}
		}
		
	}
	

}

class Seg{
	long[] st;
	long[] arr;
	long[] lazy;
	Seg(int n){
		st=new long[4*n];
		//lazy=new long[4*n];
		
	}
	void build(int index,int low,int high) {
		if(low==high) {
			st[index]=arr[low];
		}
		else {
			int middle=(low+high)/2;
			build(2*index+1,low,middle);
			build(2*index+2,middle+1,high);
			st[index]=Math.min(st[2*index+1], st[2*index+2]);
		}
	}
	
	long query(int index,int low,int high, int ql,int qh) {
//		if(lazy[index]!=0) {
//			st[index]+=lazy[index];
//			if(low<high) {
//				lazy[2*index+1]+=lazy[index];
//				lazy[2*index+2]+=lazy[index];
//				
//			}
//			lazy[index]=0;
//		}
		
		if(ql<=low && high<=qh) {
			return st[index];
		}
		else if(!(ql>high || qh<low)) {
			int middle=(low+high)/2;
			long left=query(2*index+1,low,middle,ql,qh);
			long right=query(2*index+2,middle+1,high,ql,qh);
			//st[index]=Math.max(st[2*index+1], st[2*index+2]);
			return Math.max(left,right);
			
		}
		return 0;
	}
	
	
	void u1(int index, int low,int high, int pos,long v) {
//		if(lazy[index]!=0) {
//			st[index]+=lazy[index];
//			if(low<high) {
//				lazy[2*index+1]+=lazy[index];
//				lazy[2*index+2]+=lazy[index];
//				
//			}
//			lazy[index]=0;
//		}
		if(low==high) {
			st[index]=v;
		}
		else {
			int middle=(low+high)/2;
			if(pos<=middle) u1(2*index+1,low,middle,pos,v);
			else u1(2*index+2,middle+1,high,pos,v);
			st[index]=Math.max(st[2*index+1],st[2*index+2]);
		}
	}
	
	
}
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
    static String nextLine() throws IOException{
    	return reader.readLine();
    }
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
    static long nextLong() throws IOException {
        return Long.parseLong( next() );
    }
    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
}