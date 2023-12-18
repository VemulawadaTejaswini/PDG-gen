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
import java.util.TreeMap;
import java.util.TreeSet;

 class q5 {
	

	 
	public static void main(String[] args) throws IOException {
		
		Reader.init(System.in);
		StringBuffer output=new StringBuffer("");
		PrintWriter out=new PrintWriter(System.out);
		int t=Reader.nextInt();
		for(int ii=0;ii<t;ii++) {
			int n=Reader.nextInt();
			long k=Reader.nextLong();
			int[] arr=new int[n+1];
			for(int i=1;i<=n;i++) arr[i]=Reader.nextInt();
			int[] considered=new int[n+1];
			int ans=n+1;
			long totalsum=0;
			for(int i=1;i<=n;i++) {
				if(totalsum-considered[i-1]<=k) {
					long parsum=totalsum-considered[i-1];
					totalsum=0;
					int todivide=1;
					for(int j=i;j<=n;j++) {
						parsum-=considered[j];
						considered[j]=arr[j]/todivide;
						todivide++;
						totalsum+=considered[j];
						if(totalsum+parsum>k)break;
					}
					totalsum=totalsum+parsum;
					if(totalsum<=k) {
						ans=i;break;
					}
					
				}
				else {
					totalsum-=considered[i-1];
				}
			}
			output.append(ans);
			output.append("\n");
		}
		out.write(output.toString());
		out.flush();
		
	}
}

class ode{
	int a;
	int pos;
	int length;
	int index;
	ode(int aa,int p,int i){
		a=aa;pos=p;index=i;
		length=pos-a+1;
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







 
 

 