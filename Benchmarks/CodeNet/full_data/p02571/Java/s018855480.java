import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class ProbSubs {
     public static void main(String[] args) {
         FastScanner fs=new FastScanner();
         int T=1;
         int max = 0;
         int count = 0;
         for (int tt=0; tt<T; tt++) {
                    String s= fs.next();
                    String t = fs.next();
                    int k  =0;
                    int i = 0;
                    int j = 0;
                    while(i<s.length()){
                        while(j<t.length()){
                            if(s.charAt(i) == t.charAt(j)){
                                count++;
                                max = Math.max(count, max);
                            }
                            if(j == t.length()-1){
                                j = -1;
                                k+=1;
                                count = 0;
                                i = k-1;
                            }
                            i++;
                            j++;
                            if(i == s.length() || j == t.length()){
                                break;
                            }
                        }
                        
                    }
                    
                    System.out.println(t.length() - max);
                    // System.out.println(1);
                 }
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
