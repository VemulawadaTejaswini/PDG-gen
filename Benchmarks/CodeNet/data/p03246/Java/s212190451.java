//package may2020;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FastReader scn = new FastReader();
		OutputStream out = new BufferedOutputStream(System.out);
		
		int n =scn.nextInt();
		
//		int[] a = new int[n];
		HashMap<Integer, pair> map1 = new HashMap<>();
		HashMap<Integer, pair> map2 = new HashMap<>();
		
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				addMap(map1, scn.nextInt());
			}else {
				addMap(map2,scn.nextInt());
			}
		}
		
		pair[] arr1 = getArr(map1);
		pair[] arr2 = getArr(map2);
		if(arr1[0].v!=arr2[0].v) {
			int ans =n-arr1[0].f-arr2[0].f;
			out.write((ans+"\n").getBytes());
		}else {
			if(arr1.length==1) {
				if(arr2.length==1) {
					out.write((n/2+"\n").getBytes());
				}else {
					out.write((n-arr1[0].f-arr2[1].f+"\n").getBytes());
				}
			}else {
				if(arr2.length==1) {
					out.write((n-arr1[1].f-arr2[0].f+"\n").getBytes());
				}else {
					int m = Math.max(arr1[0].f+arr2[1].f, arr1[1].f+arr2[0].f);
					out.write((n-m+"\n").getBytes());
				}
			}
		}
		
		out.close();
	}
	static class pair{
		int v,f;
		public pair(int v,int f) {
			this.v = v;
			this.f = f;
		}
	}
	static pair[] getArr(HashMap<Integer, pair> map) {
		pair[] res = map.values().toArray(new pair[0]);
		Arrays.sort(res,(p1,p2)->p2.f-p1.f);
		return res;
	}
	static void addMap(HashMap<Integer, pair> map,int o) {
		if(!map.containsKey(o)) {
			map.put(o, new pair(o,1));
		}else {
			map.get(o).f++;
		}
	}
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }
}
