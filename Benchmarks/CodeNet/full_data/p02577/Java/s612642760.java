//Coded By Visnunathan

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;

class codeforces {
    // public static void main(String[] args) {
    //     FastScanner sc=new FastScanner();
    //     char[] arr = sc.next().toCharArray();
    //     int sum = 0;
    //     for(char c:arr) {
    //         sum += (c-'0');
    //     }
    //     System.out.println(sum%9==0 ? "YES":"NO");
    // }
    public static void main(String[] args) {
        FastScanner fs=new FastScanner();
        char[] line=fs.next().toCharArray();
        int sum=0;
        for (char c:line) sum+=c-'0';
        System.out.println(sum%9==0?"Yes":"No");
    }

    static final Random random=new Random();
    
    static void ruffleSort(int[] a) {
        int n=a.length;//shuffle, then sort 
        for (int i=0; i<n; i++) {
            int oi=random.nextInt(n), temp=a[oi];
            a[oi]=a[i]; a[i]=temp;
        }
        Arrays.sort(a);
    }
    
    static class FastScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }
        
        int nextInt() {
            return Integer.parseInt(next());
        }
        int[] readArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }
        long nextLong() {
            return Long.parseLong(next());
        }
    }

    
}
