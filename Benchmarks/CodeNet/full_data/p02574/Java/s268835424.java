import java.io.*;
import java.math.*;
import java.util.*;
import java.lang.*;

// import java.text.DecimalFormat; 
// import java.text.DecimalFormatSymbols; 
/*
caba
abc
  
 */

public class Main {	
	
	static int ma = 1000001;
	static int[] lp;
    
	public static void main(String args[] ) throws Exception {
        PrintWriter pw=new PrintWriter(System.out);
        Reader sc = new Reader();
        
        int n = sc.nextInt();
        lp = new int[ma];
        
        factor();
        
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        	a[i] = sc.nextInt();
        
        int res =  pairgcd(a,n);
        if(res==1)
        	pw.print("pairwise coprime");
        else {
        	res = setgcd(a,n);
        	if(res==1) {
        		pw.print("setwise coprime");
        	} else {
        		pw.print("not coprime");
        	}
        }
        
        pw.close();
    }
	
	static void factor() {
		int[] pr = new int[ma];
		int s = 0;
		for (int i=2; i<ma; ++i) {
		    if (lp[i] == 0) {
		        lp[i] = i;
		        pr[s++]=i;
		    }
		    for (int j=0; j<s&& pr[j]<=lp[i] && i*pr[j]<ma; ++j)
		        lp[i * pr[j]] = pr[j];
		}
	}
    
    
    
    
    
   
    static int pairgcd(int[] a,int n) {
	   
		int hi = 0;
		for(int i=0;i<n;i++)
			hi = Math.max(hi, a[i]);
		
		int[] div = new int[hi+1];
		
		for(int i=0;i<n;i++) {
			boolean[] vis = new boolean[ma];
			int t = a[i];
			if(a[i]==1) {
				div[1]++;
				continue;
			}
			while(t>1) {
				if(!vis[lp[t]]) {
					div[lp[t]]++;
					vis[lp[t]]=true;
				}
				t = t/lp[t];
			}
			
		}
		for(int i=hi;i>1;i--) {
			if(div[i]>1)
				return i;
		}
	   
		return 1;
	}
    static int gcd(int a,int b) {
    	if(a==0)
    		 return b;
    	return gcd(b%a,a);
    }
   
    static int setgcd(int[] a,int n) {
	   int res=a[0];
	   for(int i=1;i<n;i++) {
		   res = gcd(res,a[i]);
		   if(res==1)
			   return 1;
	   }
	   return res;
    }






static <T> void deb(T x){
       System.out.println(x);
   }
   
   
static class Reader 
{ 
    final private int BUFFER_SIZE = 1 << 16; 
    private DataInputStream din; 
    private byte[] buffer; 
    private int bufferPointer, bytesRead; 

    public Reader() 
    { 
        din = new DataInputStream(System.in); 
        buffer = new byte[BUFFER_SIZE]; 
        bufferPointer = bytesRead = 0; 
    } 

    public Reader(String file_name) throws IOException 
    { 
        din = new DataInputStream(new FileInputStream(file_name)); 
        buffer = new byte[BUFFER_SIZE]; 
        bufferPointer = bytesRead = 0; 
    } 

    public String readLine() throws IOException 
    { 
        byte[] buf = new byte[1000001]; // line length 
        int cnt = 0, c; 
        while ((c = read()) != -1) 
        { 
            if (c == '\n') 
                break; 
            buf[cnt++] = (byte) c; 
        } 
        return new String(buf, 0, cnt); 
    } 

    public int nextInt() throws IOException 
    { 
        int ret = 0; 
        byte c = read(); 
        while (c <= ' ') 
            c = read(); 
        boolean neg = (c == '-'); 
        if (neg) 
            c = read(); 
        do
        { 
            ret = ret * 10 + c - '0'; 
        }  while ((c = read()) >= '0' && c <= '9'); 

        if (neg) 
            return -ret; 
        return ret; 
    } 

    public long nextLong() throws IOException 
    { 
        long ret = 0; 
        byte c = read(); 
        while (c <= ' ') 
            c = read(); 
        boolean neg = (c == '-'); 
        if (neg) 
            c = read(); 
        do { 
            ret = ret * 10 + c - '0'; 
        } 
        while ((c = read()) >= '0' && c <= '9'); 
        if (neg) 
            return -ret; 
        return ret; 
    } 

    public double nextDouble() throws IOException 
    { 
        double ret = 0, div = 1; 
        byte c = read(); 
        while (c <= ' ') 
            c = read(); 
        boolean neg = (c == '-'); 
        if (neg) 
            c = read(); 

        do { 
            ret = ret * 10 + c - '0'; 
        } 
        while ((c = read()) >= '0' && c <= '9'); 

        if (c == '.') 
        { 
            while ((c = read()) >= '0' && c <= '9') 
            { 
                ret += (c - '0') / (div *= 10); 
            } 
        } 

        if (neg) 
            return -ret; 
        return ret; 
    } 

    private void fillBuffer() throws IOException 
    { 
        bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
        if (bytesRead == -1) 
            buffer[0] = -1; 
    } 

    private byte read() throws IOException 
    { 
        if (bufferPointer == bytesRead) 
            fillBuffer(); 
        return buffer[bufferPointer++]; 
    } 

    public void close() throws IOException 
    { 
        if (din == null) 
            return; 
        din.close(); 
    } 
}
   
}