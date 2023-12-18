import java.util.*;
import java.io.*;
class Main {
    static long ans=0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] ar = new int[2*N];
        for(int i=0; i<2*N; i++)
            ar[i]=Integer.parseInt(st.nextToken());

        Arrays.sort(ar);
        int ans=0;
        for(int i=0; i<2*N; i+=2){
            ans+=ar[i];
        }
        System.out.println(ans);
    }
}
