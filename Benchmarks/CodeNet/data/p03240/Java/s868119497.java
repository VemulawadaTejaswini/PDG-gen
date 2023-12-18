//package Atcoder;

import java.util.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer;


public class Main {
	
	static class IO 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public IO() 
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
	
	public static void main(String[] args) {
		IO fs = new IO();
		int n = fs.nextInt();
		int [] x = new int[n];
		int [] y = new int[n];
		int [] h = new int[n];
		for(int i = 0; i<n; i++) {
			x[i] = fs.nextInt();
			y[i] = fs.nextInt();
			h[i] = fs.nextInt();
		}
		int ansx,ansy;
		int resx = -1,resy = -1,resh = -1;
		Set<Integer> st = new HashSet<Integer>();
		for(ansx = 0; ansx<=100; ansx++) {
			for(ansy = 0; ansy<=100; ansy++) {
				st.clear();
				boolean canbe = true;
				int ph = 0;
				for(int i = 0; i<n; i++) {
					if(h[i]!=0) {
						ph = h[i] + Math.abs(ansx-x[i]) + Math.abs(ansy - y[i]);
						if(st.isEmpty()||st.contains(ph)) {
							st.add(ph);
							continue;
						}
						else {
							canbe = false;
							break;
						}
					}
				}
				if(canbe) {
					boolean stillpos = true;
					for(int i = 0; i<n; i++) {
						if(h[i] == 0) {
							if(ph> Math.abs(ansx-x[i])+Math.abs(ansy-y[i])) {
								stillpos = false;
								break;
							}
						}
					}
					if(stillpos) {
						resx = ansx;resy = ansy;resh = ph;
						break;
					}
				}
			}
			if(resx!=-1 || resy!=-1 || resh!=-1)break;
		}
		System.out.println(resx+" "+resy+" "+resh);
	}

}
