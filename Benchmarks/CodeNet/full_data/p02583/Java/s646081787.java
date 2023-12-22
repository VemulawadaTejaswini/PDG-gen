import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
 
/*
    Author: Koushik Sahu
    Created: 02 September 2020 Wed 20:50:02
*/

public class Main {

    static FastScanner fs=new FastScanner();

    static int n, l[];

    public static void main(String[] args){
        n = fs.nextInt();
        l = new int[n];
        for(int i=0; i<n; i++) l[i] = fs.nextInt();
        int ans = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if(isTriangle(i, j, k)){
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }

    static boolean isTriangle(int a, int b, int c){
        if(l[a]!=l[b] && l[b]!=l[c] && l[c]!=l[a] && l[a]+l[b]>l[c] && l[b]+l[c]>l[a] && l[c]+l[a]>l[b]) return true;
        return false;
    }
        
    static class FastScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
                            
        public String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        public String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
                                        
        public int nextInt() {
            return Integer.parseInt(next());
        }
                                                
        public int[] readArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }
                                                        
        public long nextLong() {
            return Long.parseLong(next());
        }
                                                                
        public long[] readLongArray(int n) {
            long[] a=new long[n];
            for (int i=0; i<n; i++) a[i]=nextLong();
            return a;
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
     
}