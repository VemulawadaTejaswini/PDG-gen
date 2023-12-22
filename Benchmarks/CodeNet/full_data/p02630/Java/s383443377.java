import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        long curSum = 0L;
        int[] fullArray = new int[100001];
        for (int i = 0; i < n; i++){
            int a = sc.nextInt();
            curSum += a;
            fullArray[a]++;
        }
        int q = sc.nextInt();
        int ci, bi;
        for (int i = 0; i < q; i++){
            ci = sc.nextInt();
            bi = sc.nextInt();
            curSum += (bi-ci)*fullArray[ci];
            fullArray[bi] += fullArray[ci];
            fullArray[ci] = 0;
            System.out.println(curSum);
        }
    }
}
class FastReader{ 
    BufferedReader br; 
    StringTokenizer st; 
    public FastReader() { 
        br = new BufferedReader(new InputStreamReader(System.in)); 
    } 
    String next(){ 
        while (st == null || !st.hasMoreElements()) { 
            try{ 
                st = new StringTokenizer(br.readLine()); 
            }catch (IOException  e){ 
                e.printStackTrace(); 
            } 
        } 
        return st.nextToken(); 
    } 
    int nextInt(){ 
        return Integer.parseInt(next()); 
    } 
    long nextLong(){ 
        return Long.parseLong(next()); 
    } 
    double nextDouble(){ 
      return Double.parseDouble(next()); 
    } 
    String nextLine(){ 
        String str = ""; 
        try{ 
            str = br.readLine(); 
        } 
        catch (IOException e){ 
            e.printStackTrace(); 
        } 
        return str; 
    } 
}
