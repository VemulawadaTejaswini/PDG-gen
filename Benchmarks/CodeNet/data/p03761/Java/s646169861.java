
import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Main {
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
		Scanner  sc=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
	for(int i=0;i<51;i++) {
		for(int j=0;j<51;j++) {
			dp[i][j]=0;
		}
	}
	int n=sc.nextInt();
	char a[]=sc.next().toCharArray(),b[]=sc.next().toCharArray(),c[]=sc.next().toCharArray();
		int min=Math.min(a.length, b.length);
		int wanted=Math.min(min,c.length);
		Arrays.parallelSort(a);
		Arrays.parallelSort(b);
		Arrays.parallelSort(c);
	
		boolean flag=false;
		boolean flag1=false;
		if(wanted==a.length) {
			if(lcs(a,b)==false) {
				flag=true;
			}
			if(lcs(a,c)==false) {
				flag1=true;
			}
			
			if(flag1==true||flag==true) {
				System.out.println();
}else {
	int i=a.length;
	int j=b.length;
	LinkedList<Character> aa=new LinkedList<>();
	while(i>0&&j>0){
		if(a[i-1]==b[j-1]) {
		aa.addFirst(a[i-1]);
		i--;
		j--;
		}else {
			if(dp[i][j-1]>dp[i-1][j])
			j--;
		else {
			i--;
		}
	}
	}
	for(char k:aa) {
		System.out.print(k);
	}
	
	System.out.println();
}
		}else if(wanted==b.length) {
			if(lcs(b,a)==false) {
				flag=true;
			}
			if(lcs(b,c)==false) {
				flag1=true;
			}
			if(flag1==true||flag==true) {
				System.out.println();
}else {
	for(int i=0;i<b.length;i++) {
		System.out.print(b[i]);
	}
	System.out.println();
}
		}else {
			if(lcs(c,a)==false) {
				flag=true;
			}
			if(lcs(c,b)==false) {
				flag1=true;
			}
			if(flag1==true||flag==true) {
				System.out.println();
}else {
	for(int i=0;i<c.length;i++) {
		System.out.print(c[i]);
	}
	System.out.println();
}
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
	static int dp[][]=new int[51][51];
	static boolean lcs(char a[],char b[]) {
		
		for(int i=0;i<=50;i++) {
			dp[i][0]=0;
		}
		for(int i=0;i<=50;i++) {
			dp[0][i]=0;
		}
		for(int i=1;i<=a.length;i++) {
			for(int j=1;j<=b.length;j++) {
				if(a[i-1]==b[j-1]) {
					dp[i][j]=1+dp[i-1][j-1];
				}else {
					dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
				}
			}
		}
		return dp[a.length][b.length]!=0;
	}
	}