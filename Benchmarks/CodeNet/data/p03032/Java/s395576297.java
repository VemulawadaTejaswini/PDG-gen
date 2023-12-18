import java.util.*;
import java.io.*;
import java.lang.Math;
/**
 *
 * @author billy
 */


public class Buffer_Reader {


    
    
    static class Pair implements Comparable<Pair>{
        int x;
        int y;
        Pair (int x0, int y0){
            x=x0;
            y=y0;
        }
        public int compareTo(Pair e){//if ur using long, u have to manual if else if compare
            return y - e.y;
        }
    }
    static class Triple implements Comparable<Triple>{
        int x;
        int y;
        int z;
        Triple (int x0, int y0, int z0){
            x=x0;
            y=y0;
            z = z0;
        }
        public int compareTo(Triple e){//if ur using long, u have to manual if else if compare
            return y - e.y;
        }
    }
    
        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        
        int n = readInt();
        int k = readInt();
        
        int[] arr = new int[n+1];
        int[] psa = new int[n+1];
        int [] ssa = new int[n+2];
        for(int i =1; i<=n; i++){
            arr[i] = readInt();
            psa[i] = psa[i-1] + arr[i];
        }
        ssa[n] = arr[n];
        for(int i= n-1; i>=1; i--){
            ssa[i] = ssa[i+1] +arr[i];
        }
        int ans = 0;
        int r = Math.min(n,k);
        
        for(int i =0; i<=r; i++){
            for(int j =0; j<=r; j++){
                if(i+j<=r){
                    int A = psa[i];
                    int B = ssa[n-j+1];
                    int tmp = A+B;
                    ArrayList<Integer> neg = new ArrayList();
                    for(int h =1; h<=i; h++){
                        if(arr[h]<0){
                            neg.add(arr[h]);
                        }
                    }
                    for(int h = n; h>=n-j+1; h--){
                        if(arr[h]<0){
                            neg.add(arr[h]);
                        }
                    }
                    Collections.sort(neg);
                    for(int h =0; h< Math.min(neg.size(), k-i-j); h++){
                        tmp-=neg.get(h);
                    }
                    
                    ans = Math.max(ans,tmp);
                }
            }
        }
        System.out.println(ans);
        
    }
    
    
    
    
    static String read () throws IOException {
        while (st == null || !st.hasMoreTokens())
           st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    //© Maillew DMOJ
    static long readLong () throws IOException {
        return Long.parseLong(read());
    }
    static int readInt () throws IOException {
        return Integer.parseInt(read());
    }
    static double readDouble () throws IOException {
        return Double.parseDouble(read());
    }
    static char readChar () throws IOException {
        return read().charAt(0);
    }
    static String readLine () throws IOException {
        return br.readLine().trim();
    }
    /*
     Integer overflow, array bounds?
     Special cases (n=1? n=0?)

     Did you read the bounds?
     Did you make typos?
     Are array sizes proper (scaled by proper constant, for example 2* for segment 
     tree)
     DS reset properly between test cases?
     Floating points errors?
     Do smth instead of nothing and stay organized
     Write stuff down
  */
    
    
    
    
}
