import java.util.*;
import java.io.*;
import java.math.*;
	        public class Main {
	        	static int check(String s, String t) {
	        		int count = 0;
	        		for(int i = 0;i<s.length();i++) {
	        			if(s.charAt(i) != t.charAt(i)) {
	        				count++;
	        			}
	        		}
	        		return count;
	        	}
	        public static void main(String args[]) throws IOException {
	        	FastReader sc = new FastReader();
	        	
	        	String s = sc.next();
	        	String t = sc.next();
	        	int n = s.length();
	        	int min = Integer.MAX_VALUE;
	        	int nt = t.length();
	        	for(int i = 0;i<=n-nt;i++) {
	        		String res = s.substring(i, i + nt);
	        		min = Math.min(min, check(res, t));
	        	}
	        	pn(min);
	       }
	       static void p(Object p){System.out.print(p);}
	       static void pn(){System.out.println();}
	       static void pn(Object o){System.out.println(o);}
	       
	       static class FastReader {
	       static BufferedReader br;
	       StringTokenizer st;
	       public FastReader() {
	       br = new BufferedReader(new InputStreamReader(System.in));
	       }
	            
	       String next(){
	       while (st == null || !st.hasMoreElements()) {
	            try{
	                st = new StringTokenizer(br.readLine());
	            }
	            catch (IOException  e) {
	                e.printStackTrace();
	            }}
	            return st.nextToken();
	            }
	            
	            int nextInt(){ 
	                return Integer.parseInt(next());
	            }
	            
	            long nextLong(){ 
	                return Long.parseLong(next());
	            }
	            
	            static int max(int[] a){
	            int max = Integer.MIN_VALUE;
	            for(int i : a) max = Math.max(max, i);
	            return max;
	            }
	            
	            public int[] readIntArray(int n) {
	            int[] arr = new int[n];
	            for(int i=0; i<n; ++i) arr[i]=nextInt();
	            return arr;
	            }
	            
	            public long[] readLongArray(int n){
	            long[] arr = new long[n];
	            for(int i=0; i<n; ++i) arr[i]=nextLong();
	            return arr;
	            }
	            
	            public int[][] readIntArray(int m, int n){
	            int[][] arr = new int[m][n];
	            for(int i = 0;i<m;i++) 
	            for(int j = 0;j<n;j++) arr[i][j] = nextInt();
	            return arr;
	            }
	            
	            public String[] readStringArray(int n) {
	            String[] arr = new String[n];
	            for(int i=0; i<n; ++i) arr[i]= nextLine();
	            return arr;
	            }
	            
	            double nextDouble() {return Double.parseDouble(next());}
	            
	            String nextLine() {
	            String str = "";
	            try{str = br.readLine();}
	            catch (IOException e) {e.printStackTrace();}
	            return str;}}
	        }