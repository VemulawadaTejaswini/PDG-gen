import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[]=new int[n];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            map.put(i+1,arr[i]);
        }
        int ans= 1;
        for (Map.Entry ii :  map.entrySet()){
          //  int key = (int) ii.getKey();
            //int val = (int) ii.getValue();
            if (k==0){
                System.out.println(ans);
                break;
            }
//            System.out.println(map
//            .get(ans));
            ans = map.get(ans);
            k--;
        }
        ans = map.get(ans);
        System.out.println(ans);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
