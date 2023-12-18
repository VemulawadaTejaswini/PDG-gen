 
import java.io.*;
import java.util.*; 
import javafx.util.Pair; 

public class balance_topcoder 
{ 

/*
 *   ********   *******    ******** 	
 *   *          *    *           *
 *   *          *   *           * 
 *   *          * *            *
 *   *          *   *         *
 *   ********   *    *       *
 */
	static	Reader in=new Reader();
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws IOException 
	{ 
		int n=in.integer();
		int arr[]=new int[n];
		rep(arr);
		int l[]=new int[n];
		int r[]=new  int[n];
		for(int i=0;i<n;i++) {
			if(i==0) {
				l[0]=arr[0];
				r[n-1]=arr[n-1];
			}
			else {
				l[i]=l[i-1]+arr[i];
				r[n-i-1]=r[n-i]+arr[n-i-1];
			}
		}
		//display(l);
		//display(r);
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n-1;i++) {
			min=Math.min(min,Math.abs(l[i]-r[i+1]));
		}
			System.out.println(min);
		
		
		
		
	}

 static int partition(Pair<Integer,Integer> arr[], int low, int high) 
    { 
        int pivot = arr[high].getKey();  
        int i = (low-1);
        for (int j=low; j<high; j++) 
        {  
            if (arr[j].getKey() <= pivot) 
            { 
                i++;
                Pair<Integer,Integer> temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        }
        Pair<Integer,Integer> temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
   static void sort(Pair<Integer,Integer> arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            int pi = partition(arr, low, high); 
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    }
	/*
	 * seach algorithm
	 */
	static int return_greater_index(int arr[],int start,int end,int x)
	{
		int ans=-1;
		int mid;
		while(start<=end) {
			 mid=(start+end)/2;
			if(arr[mid]<=x)
				start=mid+1;
			else 
				{
				ans=mid;
				end=mid-1;
				}
		}
		return ans;
	}
public static int lowerBound(int[] a, int v)
	{
		int low = -1, high = a.length;
		while(high-low > 1){
			int h = high+low>>>1;
			if(a[h] >= v){
				high = h;
			}else{
				low = h;
			}
		}
		return high;
	}
static int return_lower_index(int arr[],int start,int end,int x)
	{
		int ans=-1;
		int mid;
		while(start<=end) {
			 mid=(start+end)/2;
			if(arr[mid]<=x) {
				ans=mid;
				start=mid+1;
			}
			else 
				{
				end=mid-1;
				}
		}
		return ans;
	}
	/*
	 * pairs of <int,int> <double,double>
	 */
	static Pair<Integer,Integer> pair(int x,int y){
		Pair<Integer,Integer> p=new Pair<Integer, Integer>(x,y);
		return p;
	}
	static Pair<Double,Double> pair(double x,double y){
		Pair<Double,Double> p=new Pair<Double,Double>(x,y);
		return p;
	}
	/*
	 * for loop
	 */
static void rep(int arr[]) throws IOException {
	int n=arr.length;
	for(int i=0;i<n;i++)
		arr[i]=in.integer();
}
	/*display 
	 array
	 */
	static void display(Integer arr[][],int x,int y) {
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	static void display(int[] l) {
		int x=l.length;
			for(int j=0;j<x;j++)
			{
				System.out.print(l[j]+" ");
			}
			System.out.println();
	}
	
	/*
	 * input 
	 */
	
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

		public String string() throws IOException 
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

		public int integer() throws IOException 
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

		public long _long() throws IOException 
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

		public double _double() throws IOException 
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
