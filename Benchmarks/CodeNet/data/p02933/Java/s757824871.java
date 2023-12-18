import java.util.*;
import java.io.*;
public class Main{
	static int mod = (int)1e9+7;
	public static void main(String sp[])throws IOException{
		//Reader sc = new Reader();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String st = sc.next();
		if(a>=3200)
			System.out.println(st);
		else System.out.println("red");
		

	}
	
	public static void sudoko(int arr[][], int n, int row, int col){
		
		
		for(int i=row;i<=9;i++){
			for(int j=col;j<=9;j++){
				if(arr[i][j]==0){
					for(int k=1;k<=9;k++){
						if(check1(arr, i, j, n, k)==true && check2(arr, i, j, n, k)==true){
							arr[i][j]=k;
							sudoko(arr, n, i, j);
							arr[i][j]=0;
						}
					}					
				}
			}
		}
		
	}
	
	//checkig the 3*3 pair
	public static boolean check1(int arr[][], int i, int j, int n, int k){
		HashMap<Integer,Integer> hm = new HashMap<>();
		int y=i;
		int z=j;
		
		if(i>=1 && i<=3)
			i=1;
		if(i>=4 && i<=6)
			i=4;
		if(i>=7 && i<=9)
			i=7;
		
		if(j>=1 && j<=3)
			j=1;
		if(j>=4 && j<=6)
			j=4;
		if(j>=7 && j<=9)
			j=7;
		for(int l=i;l<=i+2;l++){
			for(int r=j;r<=j+2;r++){
				hm.put(arr[l][r],0);
			}
		}
		if(hm.containsKey(k)){
			return false;
		}
		return true;
	}
	
	//checking diagonal both, row and col
	public static boolean check2(int arr[][], int i, int j, int n, int k){
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int l=1;l<=9;l++){
			hm.put(arr[i][l],0);
		}
		
		for(int l=1;l<=9;l++){
			hm.put(arr[l][j],0);
		}
		
		if(hm.containsKey(k))
			return false;
		
		return true;
	}
	
	
	
	public static int[] quick(int[] arr, int s, int e){
		
		if(s>=e)
			return arr;
		
		int y = partition(arr, s, e);
		int[] l = quick(arr, s, y-1);
		int[] r = quick(arr, y+1, e);
		
		return arr;
		
	}
	
	public static int partition(int [] arr, int s, int e){
		
		int index=s;
		int pivot = arr[e];
		for(int i=s;i<=e-1;i++){
			if(arr[i]<=pivot){
				arr = swap(arr, index, i);
				index++;
			}
		}
		swap(arr,index,e);
		print(arr);
		return index;
	}
	
	public static int[] swap(int[] arr, int low, int high){
		int temp = arr[low];
		arr[low]=arr[high];
		arr[high]=temp;
		return arr;
	}
	
	
	public static long gcd(long a, long b){
		if(a==0)
			return b;
		
		return gcd(b%a,a);
	}
	
	public static void print(int[] arr){
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	
	public static class pair{
		int ai;
		int bi;
	}
	
	public static class comp implements Comparator<pair>{
		public int compare(pair o1, pair o2){
			return o1.bi-o2.bi;
		}
	}

	static class Reader
		{
			final private int BUFFER_SIZE = 1 << 16;
			private DataInputStream din;
			private byte[] buffer;
			private int bufferPointer, bytesRead;
			BufferedReader br;
			public Reader()
			{
				din = new DataInputStream(System.in);
				buffer = new byte[BUFFER_SIZE];
				bufferPointer = bytesRead = 0;
				br = new BufferedReader(new InputStreamReader(System.in));
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
				} while ((c = read()) >= '0' && c <= '9');
	 
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
				do
				{
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
	 
				do
				{
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
			StringTokenizer st;
			String next() {
				while (st == null || !st.hasMoreTokens()) {
					try {
						st = new StringTokenizer(br.readLine());
					} catch (Exception r) {
						r.printStackTrace();
					}
				}
				return st.nextToken();
			}
	 
	 
			public void close() throws IOException
			{
				if (din == null)
					return;
				din.close();
			}
		}
}