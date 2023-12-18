
import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader in;

    public static void solve() throws IOException {
        Integer[] ab = nextArray(2);
        int a= ab[0];
        int b = ab[1];

        StringBuilder res = new StringBuilder();
        if(a < b){
            while(b-->0){
                res.append(a);
            }
        }
        else{
            while (a-->0)
                res.append(b);
        }

        System.out.println(res.toString());

    }

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        solve();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(in.readLine().trim());
    }

    static long nextLong() throws IOException {
        return Long.parseLong(in.readLine().trim());
    }

    static Integer[] nextArray(int n) throws IOException {
        StringTokenizer st = new StringTokenizer(in.readLine());
        Integer[] tmp = new Integer[n];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = Integer.parseInt(st.nextToken());
        }

        return tmp;
    }

}

