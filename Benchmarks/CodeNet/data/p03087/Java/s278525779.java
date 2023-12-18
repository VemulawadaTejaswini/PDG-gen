
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        String S = br.readLine();
        int[] arr = new int[N];
        for (int i=0; i<N-1; i++) {
            if (S.charAt(i)=='A' && S.charAt(i+1)=='C') {
                arr[i+1]++;
            }
        }
        int[] psa = new int[N];
        fillPrefixSum(arr,N,psa);
        for (int i=0; i<N; i++) {
            //System.out.println(psa[i]);
        }
        for (int i=0; i<Q; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(psa[b-1]-psa[a-1]);
        }
    }
    static void fillPrefixSum(int array[], int n, int prefixSum[])
    {
        prefixSum[0] = array[0];
        for( int i = 1; i < n; ++i )
            prefixSum[i] = prefixSum[i-1] + array[i];
    }
}
