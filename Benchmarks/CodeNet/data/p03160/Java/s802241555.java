import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeSet;

class q5 {

	static ArrayList<Integer>[] graph;
	static int[] visited;
	static long[] sums;
	static long[] val;
	static boolean possible=true;
	 public static int gcd(int a,int b) {
		 if(b==0) return a;
		 else return gcd(b,a%b);
	 }
	 
	 // Credits to GFG
	 static public void dfs(int start, long sum) {
		 visited[start]=1;
		 if(sums[start]==-1) {
			 long min=Long.MAX_VALUE;
			 for(int i:graph[start]) {
				 min=Math.min(min, sums[i]);
			 }
			 if(min!=Long.MAX_VALUE && min>=sum) {
				 val[start]+=min-sum;
			 }
			 else if(min==Long.MAX_VALUE){
				 
			 }
			 else {
				 possible=false;return;
			 }
			 for(int i:graph[start]) dfs(i,min);
		 }
		 else {
			 if(sums[start]-sum<0) {
				 possible=false;
			 }
			 else {
				 val[start]=sums[start]-sum;
				 for(int i:graph[start]) {
					 dfs(i,sums[start]);
				 }
			 }
			 
		 }
		 
	 }
	 
	 
	  
	  
	
	
	 
	
	 
	 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Editorial implementation for practice
		Reader.init(System.in);
		StringBuffer output=new StringBuffer("");
		PrintWriter out=new PrintWriter(System.out);
		int n=Reader.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=Reader.nextInt();
		int[] cost=new int[n];
		if(n>1) {
			cost[1]=Math.abs(arr[1]-arr[0]);
			for(int i=2;i<n;i++) {
				cost[i]=Math.min(Math.abs(arr[i]-arr[i-1])+cost[i-1], Math.abs(arr[i]-arr[i-2])+cost[i-2]);
			}
		}
		
		output.append(cost[n-1]);
		out.write(output.toString());
		out.flush();
	}
}

 
class Node2{
		int val, index;
	Node2(int v,int i){
		val=v;;
		index=i;
	}
	
}

class Heap{
	int[] mylist;
	int[] mymap;
	int[] vtxmymap;
	int size;
	long[] update;
	long updatevalue;
	int[] removed;
	Heap(int[] graph){
		int l=graph.length;
		updatevalue=0;
		removed=new int[l];
		update=new long[l];
		size=l-1;
		mylist=new int[l];
		mymap=new int[l];
		vtxmymap=new int[l];
		for(int i=size;i>0;i--) {
			if(i>size/2) {
				mylist[i]=graph[i];
				mymap[i]=i;
				vtxmymap[i]=i;
			}
			else {
				mylist[i]=graph[i];
				mymap[i]=i;
				vtxmymap[i]=i;
				boolean end=false;
				int parent=i;
				while(!end) {
					int leftchild=2*parent;
					int rightchild=2*parent+1;
					if(leftchild>size) {
						end=true;
					}
					else if(rightchild>size) {
						if(mylist[leftchild]<mylist[parent]) {
							int parentNode=vtxmymap[parent];
							int childNode=vtxmymap[leftchild];
							int parentDeg=mylist[parent];
							int childDeg=mylist[leftchild];
							mylist[parent]=childDeg;
							mylist[leftchild]=parentDeg;
							mymap[parentNode]=leftchild;
							mymap[childNode]=parent;
							vtxmymap[parent]=childNode;
							vtxmymap[leftchild]=parentNode;
							parent=leftchild;
						}
						else end=true;
					}
					else {
						if(mylist[leftchild]<=mylist[rightchild]) {
							if(mylist[leftchild]<mylist[parent]) {
								int parentNode=vtxmymap[parent];
								int childNode=vtxmymap[leftchild];
								int parentDeg=mylist[parent];
								int childDeg=mylist[leftchild];
								mylist[parent]=childDeg;
								mylist[leftchild]=parentDeg;
								mymap[parentNode]=leftchild;
								mymap[childNode]=parent;
								vtxmymap[parent]=childNode;
								vtxmymap[leftchild]=parentNode;
								parent=leftchild;
							}
							else end=true;
						}
						else {
							if(mylist[rightchild]<mylist[parent]) {
								int parentNode=vtxmymap[parent];
								int childNode=vtxmymap[rightchild];
								int parentDeg=mylist[parent];
								int childDeg=mylist[rightchild];
								mylist[parent]=childDeg;
								mylist[rightchild]=parentDeg;
								mymap[parentNode]=rightchild;
								mymap[childNode]=parent;
								vtxmymap[parent]=childNode;
								vtxmymap[rightchild]=parentNode;
								parent=rightchild;
							}
							else end=true;
						}
					}
				}
			}
		}
	}
	
	void update(int child) {
		if(update[child]==updatevalue) return;
		boolean end=false;
		while(!end) {
			update[child]=updatevalue;
			int parent=child/2;
			if(parent<1) end=true;
			else {
				if(mylist[parent]>mylist[child]) {
					int parentNode=vtxmymap[parent];
					int childNode=vtxmymap[child];
					int parentDeg=mylist[parent];
					int childDeg=mylist[child];
					mylist[parent]=childDeg;
					mylist[child]=parentDeg;
					mymap[parentNode]=child;
					mymap[childNode]=parent;
					vtxmymap[parent]=childNode;
					vtxmymap[child]=parentNode;
					parent=child;
				}
				else end=true;
			}
		}
	}
	
	int peek() {
		return mylist[1];
	}
	
	int pop() {
		int toreturn=mylist[1];
		removed[vtxmymap[1]]=1;
		mylist[1]=mylist[size];
		int changedNode=vtxmymap[size];
		vtxmymap[1]=changedNode;
		mymap[changedNode]=1;
		boolean end=false;
		size--;
		if(size==0) end=true;
		int parent=1;
		while(!end) {
			int leftchild=2*parent;
			int rightchild=2*parent+1;
			if(leftchild>size) {
				end=true;
			}
			else if(rightchild>size) {
				if(mylist[leftchild]<mylist[parent]) {
					int parentNode=vtxmymap[parent];
					int childNode=vtxmymap[leftchild];
					int parentDeg=mylist[parent];
					int childDeg=mylist[leftchild];
					mylist[parent]=childDeg;
					mylist[leftchild]=parentDeg;
					mymap[parentNode]=leftchild;
					mymap[childNode]=parent;
					vtxmymap[parent]=childNode;
					vtxmymap[leftchild]=parentNode;
					parent=leftchild;
				}
				else end=true;
			}
			else {
				if(mylist[leftchild]<=mylist[rightchild]) {
					if(mylist[leftchild]<mylist[parent]) {
						int parentNode=vtxmymap[parent];
						int childNode=vtxmymap[leftchild];
						int parentDeg=mylist[parent];
						int childDeg=mylist[leftchild];
						mylist[parent]=childDeg;
						mylist[leftchild]=parentDeg;
						mymap[parentNode]=leftchild;
						mymap[childNode]=parent;
						vtxmymap[parent]=childNode;
						vtxmymap[leftchild]=parentNode;
						parent=leftchild;
					}
					else end=true;
				}
				else {
					if(mylist[rightchild]<mylist[parent]) {
						int parentNode=vtxmymap[parent];
						int childNode=vtxmymap[rightchild];
						int parentDeg=mylist[parent];
						int childDeg=mylist[rightchild];
						mylist[parent]=childDeg;
						mylist[rightchild]=parentDeg;
						mymap[parentNode]=rightchild;
						mymap[childNode]=parent;
						vtxmymap[parent]=childNode;
						vtxmymap[rightchild]=parentNode;
						parent=rightchild;
					}
					else end=true;
				}
			}
		}
		
		
		return toreturn;
	}
	
}


 
 class DisJoint {
		int[] parent;
		int[] rank;
		int[] size;
		DisJoint(int n){
			
			parent=new int[n+1];
			rank=new int[n+1];
			for(int i=0;i<=n;i++) {
				parent[i]=i;
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

