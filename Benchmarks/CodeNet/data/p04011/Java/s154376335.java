import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int Y = Integer.parseInt(st.nextToken());

        int ans = 0;
        ans+=Math.min(N,K)*X;
        ans+=Math.max(0,N-K)*Y;

        System.out.println(ans);

    }
}