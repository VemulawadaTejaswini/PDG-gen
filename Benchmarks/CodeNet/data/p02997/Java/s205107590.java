import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.Map.Entry;


public class  Main{
    public static void main(String[] args) throws Exception{
    	MScanner sc = new MScanner(System.in);
        //MScanner sc = new MScanner("reduce.in");
        PrintWriter pw=new PrintWriter(System.out);
        //int n=sc.nextInt();
        //Integer[]in=new Integer[n];for(int i=0;i<n;i++)in[i]=sc.nextInt();
        int n=sc.nextInt();
        int k=sc.nextInt();
        if(n==2) {
        	if(k==0) {
        		pw.println(1);
        		pw.println(1+" "+2);
        	}
        	else {
        		pw.println(-1);
        	}
        	pw.flush();return;
        }
        if(k==0) {
        	pw.println(-1);
        	pw.flush();return;
        }
        StringBuilder ans=new StringBuilder();int m=0;
        int rem=k;int prev=1;n--;
        if(n-rem>1) {
        	pw.println(-1);pw.flush();return;
        }
        while(n<rem) {
        	int req=rem-n;
        	int wanted=-1;
        	for(int i=req-1;i>=2;i--) {
        		if(prev==1) {
	        		if(((i-1)*i)/2<=req) {
	        			wanted=i;
	        		}
        		}
        		else {
        			if(i+((i-1)*i)/2<=req) {
	        			wanted=i;
	        		}
        		}
        	}
        	if(wanted==-1) {
        		break;
        	}
        	if(prev==1) {
        		rem-=wanted*(wanted-1)/2;
        	}
        	else {
        		rem-=wanted+wanted*(wanted-1)/2;
        	}
        	n-=wanted;
        	int x=prev+1;
        	for(int i=0;i<wanted;i++) {
        		ans.append(x+" "+prev+'\n');m++;
        		x++;
        	}
        	prev=x-1;
        }
        if(n==rem) {
        	for(int i=0;i<n;i++) {
        		ans.append(prev+" "+(prev+1)+'\n');m++;
        		prev++;
        	}
        	pw.println(m);
        	pw.println(ans);
        }
        else {
        	if(prev==1 && n-rem==1) {
        		for(int i=0;i<n;i++) {
        			ans.append(prev+" "+(prev+1)+'\n');m++;
            		prev++;
        		}
        		pw.println(m);
        		pw.println(ans);
        	}
        	else
        		pw.println(-1);
        }
        pw.flush();
    }
    static class pair implements Comparable<pair>{
    	int t;int d;
    	pair(int x,int y){
    		t=x;d=y;
    	}
    	@Override
    	public int compareTo(pair o) {
    		if(d!=o.d) {
    			return d-o.d;
    		}
    		return t-o.t;
    	}
    	 
    	public boolean equals(pair o) {
    		if(this.compareTo(o)==0)return true;
    		return false;
    	}
    	public String toString() {
    		return "("+t+" "+d+")";
    	}
    }
    static StringBuilder tosb(int[]in) {
    	StringBuilder s=new StringBuilder();
    	for(int i=0;i<in.length;i++) {
    		s.append(in[i]+" ");
    	}
    	return s;
    }
    static StringBuilder tosb(long[]in) {
    	StringBuilder s=new StringBuilder();
    	for(int i=0;i<in.length;i++) {
    		s.append(in[i]+" ");
    	}
    	return s;
    }
    
    static class MScanner {
		StringTokenizer st;
		BufferedReader br;
 
		public MScanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}
 
		public MScanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}
 
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
 
		public String nextLine() throws IOException {
			return br.readLine();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
 
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
 
		public char nextChar() throws IOException {
			return next().charAt(0);
		}
 
		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public boolean ready() throws IOException {
			return br.ready();
		}
 
		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}