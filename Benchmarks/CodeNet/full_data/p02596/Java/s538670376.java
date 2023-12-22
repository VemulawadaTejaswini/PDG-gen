import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
public class Main {
    static FastScanner sc = new FastScanner();
    public void solve1(int testNumber, Scanner in, PrintWriter out) {
        int K = Integer.parseInt(in.next());
        int x = 7 % K;
        int i = 1;
        Set<Integer> s = new HashSet<>();
        while (!s.contains(x)) {
            if (x == 0) {
                out.println(i);
                return;
            } else {
                s.add(x);
                x = (x * 10 + 7) % K;
                ++i;
            }
        }
        out.println(-1);
    }
    static void solve(int k){
        int x=7%k;
        int i=1;
        Set<Integer> s= new HashSet<>();
        while (!s.contains(x)){
            if (x==0){
                System.out.println(i);
                return;
            }
            else{
                s.add(x);
                x=(x*10+7)%k;
                i++;
            }
        }
        System.out.println("-1");
    }

    public static void main(String[] args) {
        int t=sc.nextInt();
        solve(t);


    }

        static void sortint(int[] a) {
        ArrayList<Integer> l=new ArrayList<>();
        for (int i:a) l.add(i);
        Collections.sort(l);
        for (int i=0; i<a.length; i++) a[i]=l.get(i);
    }
    static void sort(long[] a) {
        ArrayList<Integer> l = new ArrayList<>();
        for (long i : a) l.add((int) i);
        Collections.sort(l);
        for (int i = 0; i < a.length; i++) a[i] = l.get(i);
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}



