import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main{

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        if(n >= 400 && n < 600) System.out.println(8);
        if(n >= 600 && n < 800) System.out.println(7);
        if(n >= 800 && n < 1000) System.out.println(6);
        if(n >= 1000 && n < 1200) System.out.println(5);
        if(n >= 1200 && n < 1400) System.out.println(4);
        if(n >= 1400 && n < 1600) System.out.println(3);
        if(n >= 1600 && n < 1800) System.out.println(2);
        if(n >= 1800 && n < 2000) System.out.println(1);
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