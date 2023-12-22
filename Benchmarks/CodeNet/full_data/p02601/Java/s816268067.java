import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main{

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int A = fs.nextInt();
        int B = fs.nextInt();
        int C = fs.nextInt();
        int K = fs.nextInt();
        int cnt = 0;
        while(A >= B){
            cnt++;
            B = B*2;
        }
        while(B >= C){
            cnt++;
            C = C*2;
        }
        if(cnt <= K) System.out.println("Yes");
        else  System.out.println("No");
    }

    static void sort(int[] a){
        ArrayList<Integer>l = new ArrayList<>();
        for(int i: a)
            l.add(i);
        Collections.sort(l);
        for(int i = 0; i < a.length; i++)
            a[i] = l.get(i);
    }

    static class FastScanner{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        String next(){
            while(!st.hasMoreTokens())
                try{
                    st = new StringTokenizer(br.readLine());
                } catch(IOException e){
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt(){
            return Integer.parseInt(next());
        }
        int[] readArray(int n){
            int[] a = new int[n];
            for(int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }
        long nextLong(){
            return Long.parseLong(next());
        }
    }
}