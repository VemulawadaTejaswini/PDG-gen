import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	public static void main(String sp[])throws IOException{
		Scanner sc = new Scanner(System.in);
		//FastReader sc = new FastReader();	
		ArrayList<String> al1 = new ArrayList<>();
		ArrayList<String> al2 = new ArrayList<>();
		
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int p = sc.nextInt();
		
		
		for(int i=0;i<n;i++){
			al1.add(""+i);
		}
		for(int j=0;j<m;j++){
			al2.add(""+j);
		}
		
		subs1(al1,0,"",n);
		subs2(al2,0,"",m);
		
		
		char arr[][] = new char[n][m];
		for(int i=0;i<n;i++){
			String st = sc.next();
			for(int j=0;j<m;j++){
				arr[i][j] = st.charAt(j);
			}
		}
		
		long count=0;
		int siz = pat1.size();
		int siz2 = pat2.size();
		for(int i=0;i<siz;i++){
			String s1 = pat1.get(i);
			for(int j=0;j<siz2;j++){
				String s2 = pat2.get(j);
				ArrayList<Integer> row = new ArrayList<>();
				ArrayList<Integer> col = new ArrayList<>();
				for(int k=0;k<s1.length();k++){
					row.add(s1.charAt(k)-'0');
				}
				for(int k=0;k<s2.length();k++){
					col.add(s2.charAt(k)-'0');
				}
				boolean d = send(n,m,p,arr,row,col);
				
				if(d==true)
					count++;
			}
		}
		System.out.println(count);

	}
	
	
	public static boolean send(int n, int m, int p,char arr1[][], ArrayList<Integer> row, 
	ArrayList<Integer> col){
		char arr[][] = new char [n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++)
				arr[i][j] = arr1[i][j];
		}
		
		for(int i=0;i<row.size();i++){
			int r = row.get(i);
			for(int j = 0;j<m;j++){
				arr[r][j]='.';
			}
		}
		for(int i=0;i<col.size();i++){
			int c = col.get(i);
			for(int j=0;j<n;j++){
				arr[j][c]='.';
			}
		}
		// for(int i=0;i<n;i++){
			// for(int j=0;j<m;j++)
				// System.out.print(arr[i][j]+" ");
			
			// System.out.println();
	//	}
		int count  = 0;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(arr[i][j]=='#')
					count++;
			}
		}
		
		
		if(count==p)
			return true;
		return false;
		
	}
	
	static ArrayList<String> pat1 = new ArrayList<>();
	static ArrayList<String> pat2 = new ArrayList<>();
	
	public static void subs1(ArrayList<String> al, int index, String ans, int n){
		
		if(index==n){
			pat1.add(ans);
			return;
		}
		
		subs1(al, index+1, ans,n);
		subs1(al, index+1, ans+""+al.get(index),n);
		
	}
	
	public static void subs2(ArrayList<String> al, int index, String ans, int m){
		
		if(index==m){
			pat2.add(ans);
			return;
		}
		
		subs2(al, index+1, ans,m);
		subs2(al, index+1, ans+""+al.get(index),m);
		
	}
	
	
	
	public static ArrayList<Integer> primefactor(int n){
		int sqrt = (int)Math.sqrt(n);
		ArrayList<Integer> al = new ArrayList<>();
		while(n%2==0){
			al.add(2);
			n/=2;
		}
		for(int i=3;i<=sqrt;i+=2){
			while(n%i==0){
				al.add(i);
				n/=i;
			}
		}
		if(n>2)
			al.add(n);
		return al;
	}
	
	public static long sum(long val){
		long fg =0 ;
		while(val!=0){
			fg+=val%10;
			val/=10;
		}
		return fg;
	}
	
	
	
	public static ArrayList<Integer> factor(int n){
		int sqrt = (int)Math.sqrt(n);
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=1;i<=sqrt;i++){
			if(n%i!=0)
				continue;
			int first = i;
			int second = n/i;
			al.add(i);
			if(first==second){
				continue;
			}
			al.add(n/i);
		}
		return al;
	}
	
	public static int power(int x, int y) 
	{ 
		int temp; 
		if( y == 0) 
			return 1; 
		temp = power(x, y/2); 
		if (y%2 == 0) 
			return temp*temp; 
		else
			return x*temp*temp; 
	} 
	
	public static ArrayList<Integer> comp(){
		ArrayList<Integer> al = new ArrayList<>();
			int n = (int)2e5;
			boolean arr[] = new boolean[n+1];
			int sqrt = (int)Math.sqrt(n);
			for(int i=2;i<=sqrt;i++){
				if(arr[i]==false){
					for(int j=i*i;j<=n;j+=i){
						arr[j]=true;
					}
				}
			}
			for(int i=2;i<=n;i++){
				if(arr[i]==false)
					al.add(i);
			}
			
		return al;
	}
	
	public static class pair{
		int x;
		int y;
		pair(int x, int y){
			this.x=x;
			this.y=y;
		}
	}
	
	public static class comp implements Comparator<pair>{
		public int compare(pair o1, pair o2){
			if(o1.y==o2.y){
				return o2.x-o1.x;
			}
			return o2.y-o1.y;
		}
	}
	
	
	
	
	static class Node{
		int node;
		int d;
		ArrayList<Integer> al = new ArrayList<>();	
	}
	

	static long gcd(long a, long b) 
    { 
      if (b == 0) 
        return a; 
      return gcd(b, a % b);  
    }
	
		
	static class FastReader 
	{ 
		final private int BUFFER_SIZE = 1 << 16; 
		private DataInputStream din; 
		private byte[] buffer; 
		private int bufferPointer, bytesRead; 
  
		public FastReader() 
		{ 
			din = new DataInputStream(System.in); 
			buffer = new byte[BUFFER_SIZE]; 
			bufferPointer = bytesRead = 0; 
		} 
  
		public FastReader(String file_name) throws IOException 
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
}