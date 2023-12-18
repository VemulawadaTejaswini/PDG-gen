
import java.io.*;
import java.util.*;

public class Main {
    static int N = (int)1e9 + 7;
    static BufferedReader in;

    public static void solve() throws IOException {
        int n = nextInt();
        long[] arr = nextLongArray(n);

        long hcm = arr[0];
        for(int i = 1;i<n;i++){
//            System.out.println(hcm);
            hcm = lcm(hcm,arr[i]);
        }
//        System.out.println(hcm);

        long sum = 0;
        for(long num : arr){
            sum += (hcm/num);
            sum%=N;
        }

        System.out.println(sum);



    }

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        solve();
    }
    static long lcm(long a, long b){
        long res = (a*b);
        res/=gcd(a,b);
        return res;
    }
    //a > b
    static long gcd(long a,long b){
        if(b == 0)return a;
        return gcd(b,a%b);
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
    static long[] nextLongArray(int n) throws IOException {
        StringTokenizer st = new StringTokenizer(in.readLine());
        long[] tmp = new long[n];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = Long.parseLong(st.nextToken());
        }

        return tmp;
    }

}

