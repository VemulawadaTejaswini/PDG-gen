package contest;
import java.util.*;
import java.io.*;
public class A {
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
         byte[] buf = new byte[64]; // line length 
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
	private static final int mod =(int)1e9+7;
	public static void main(String[] args) throws Exception  {
Reader sc=new Reader();
PrintWriter out=new PrintWriter(System.out);
int  n=sc.nextInt();
int a=sc.nextInt();
int  b=sc.nextInt ();
long arr[]=new long[n];
for(int i=0;i<n;i++) {
	arr[i]=sc.nextLong();
}
Arrays.sort(arr);
long ans=0;
for(int i=n-1;i>n-a-1;i--) {
	ans+=arr[i];
}
double mean=(double)ans/a;

out.format("%.6f",mean);
out.println();


int p=0;
int q=0;
for(int i=0; i<n;i++) {
	if(arr[i]==arr[n-a]) {
		p++;
		if(i>=n-a)q++;
	}
}
long ans1=0;
if(arr[0]==arr[n-1]) {
	for(int i=q;i<=Math.min(b,p);i++) {
		ans1+=combi(p,i);
	}
	out.println(ans1);
}else {
ans1+=combi(p,q);
	out.println(ans1);
}


	





out.flush();

	}
	static int cntd(long n) {
							int ans=0;
							while(n!=0) {
						ans++;
						n/=10;
							}
							return ans;
	}
	public static long combi(int n, int m) {
	int ind=51;
		long[][] C=new long[51][51];
		for(int i=0; i<ind;i++) {
			C[i][0]=1;
		}

		for (int i=2; i<=n+m;i++) {
			for (int j=1; j<i;j++) {
				if(j<ind && i-j<ind) {
			        C[j][i-j]=C[j-1][i-j-1]+C[j-1][i-j];
				}
			}
		}
		return C[n][m];
	}
	}