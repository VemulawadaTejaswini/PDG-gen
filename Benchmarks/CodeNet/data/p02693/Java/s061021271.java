	import java.io.DataInputStream;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.math.BigInteger;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.HashMap;
	import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;
	import java.util.stream.Collectors;
	public class Main {
		static void merge(int arr[], int l, int m, int r) 
	    { 
	        int n1 = m - l + 1; 
	        int n2 = r - m; 
	
	        int L[] = new int [n1]; 
	        int R[] = new int [n2]; 
	        for (int i=0; i<n1; ++i) 
	            L[i] = arr[l + i]; 
	        for (int j=0; j<n2; ++j) 
	            R[j] = arr[m + 1+ j]; 
	        int i = 0, j = 0; 
	        int k = l; 
	        while (i < n1 && j < n2) 
	        { 
	            if (L[i] <= R[j]) 
	            { 
	                arr[k] = L[i]; 
	                i++; 
	            } 
	            else
	            { 
	                arr[k] = R[j]; 
	                j++; 
	            } 
	            k++; 
	        } 
	        while (i < n1) 
	        { 
	            arr[k] = L[i]; 
	            i++; 
	            k++; 
	        } 
	        while (j < n2) 
	        { 
	            arr[k] = R[j]; 
	            j++; 
	            k++; 
	        } 
	    } 
	    static void sort(int arr[], int l, int r) 
	    { 
	        if (l < r) 
	        { 
	            int m = (l+r)/2; 
	            sort(arr, l, m); 
	            sort(arr , m+1, r); 
	            merge(arr, l, m, r); 
	        } 
	    }
	    public static void main(String[] args) throws IOException {
	    	try {
	    		StringBuilder sb = new StringBuilder();
	    		BufferInput in = new BufferInput();
	    		int k = in.nextInt();
	    		int a = in.nextInt();
	    		int b = in.nextInt();
	    		int f =0;
	    		for(int i=a;i<=b;i++) {
	    			if(i%k==0) {
	    				f=1;
	    				break;
	    			}
	    		}
	    		if(f==1) {
	    			System.out.println("OK");
	    		}
	    		else {
	    			System.out.println("NG");
	    		}
	    		
	    	}catch(Exception e) {}
	    }
	    static int binarySearch(ArrayList<Integer> arr, int target) {
	        int start = 0, end = arr.size()- 1;  
	    
	        int ans = -1;  
	        while (start <= end) {  
	            int mid = start + (end-start) / 2;   
	            if (arr.get(mid)<= target) {  
	                start = mid + 1;  
	            }   
	            else {  
	                ans = mid;  
	                end = mid - 1;  
	            }  
	        }  
	        return ans;  
	    }  
	static class BufferInput {
			
			final private int BUFFER_SIZE = 1 << 16;
			
			private DataInputStream din;
			
			private byte[] buffer;
			
			private int bufferPointer, bytesRead;
			
			public BufferInput() {
				din = new DataInputStream(System.in);
				buffer = new byte[BUFFER_SIZE];
				bufferPointer = bytesRead = 0;
			}
	
			public BufferInput(String file_name) throws IOException {
				din = new DataInputStream(new FileInputStream(file_name));
				buffer = new byte[BUFFER_SIZE];
				bufferPointer = bytesRead = 0;
			}
	
			public String readLine() throws IOException {
				byte[] buf = new byte[64];
				int cnt = 0, c;
				while ((c = read()) != -1) {
					if (c == '\n')
						break;
					buf[cnt++] = (byte) c;
				}
				return new String(buf, 0, cnt);
			}
			
			public String nextString() throws IOException{
				
				byte c = read();
				while(Character.isWhitespace(c)){
					c = read();
				}
				
				StringBuilder builder = new StringBuilder();
				builder.append((char)c);
				c = read();
				while(!Character.isWhitespace(c)){
					builder.append((char)c);
					c = read();
				}
				
				return builder.toString();
			}
			
			public int nextInt() throws IOException {
				int ret = 0;
				byte c = read();
				while (c <= ' ')
					c = read();
				boolean neg = (c == '-');
				if (neg)
					c = read();
				do {
					ret = ret * 10 + c - '0';
				} while ((c = read()) >= '0' && c <= '9');
	
				if (neg)
					return -ret;
				return ret;
			}
			
			public int[] nextIntArray(int n) throws IOException {
				int arr[] = new int[n];
				for(int i = 0; i < n; i++){
					arr[i] = nextInt();
				}
				return arr;
			}
			public long nextLong() throws IOException {
				long ret = 0;
				byte c = read();
				while (c <= ' ')
					c = read();
				boolean neg = (c == '-');
				if (neg)
					c = read();
				do {
					ret = ret * 10 + c - '0';
				} while ((c = read()) >= '0' && c <= '9');
				if (neg)
					return -ret;
				return ret;
			}
			
			public long[] nextLongArray(int n) throws IOException {
				long arr[] = new long[n];
				for(int i = 0; i < n; i++){
					arr[i] = nextLong();
				}
				return arr;
			}
			
			public char nextChar() throws IOException{
				byte c = read();
				while(Character.isWhitespace(c)){
					c = read();
				}
				return (char) c;	
			}
			public double nextDouble() throws IOException {
				double ret = 0, div = 1;
				byte c = read();
				while (c <= ' ')
					c = read();
				boolean neg = (c == '-');
				if (neg)
					c = read();
	
				do {
					ret = ret * 10 + c - '0';
				} while ((c = read()) >= '0' && c <= '9');
	
				if (c == '.') {
					while ((c = read()) >= '0' && c <= '9') {
						ret += (c - '0') / (div *= 10);
					}
				}
	
				if (neg)
					return -ret;
				return ret;
			}
			public double[] nextDoubleArray(int n) throws IOException {
				double arr[] = new double[n];
				for(int i = 0; i < n; i++){
					arr[i] = nextDouble();
				}
				return arr;
			}
			private void fillBuffer() throws IOException {
				bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
				if (bytesRead == -1)
					buffer[0] = -1;
			}
			private byte read() throws IOException {
				if (bufferPointer == bytesRead)
					fillBuffer();
				return buffer[bufferPointer++];
			}
	
			public void close() throws IOException {
				if (din == null)
					return;
				din.close();
			}
		}
	}
