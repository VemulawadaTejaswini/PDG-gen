import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastScanner fs=new FastScanner();
        char[] s=fs.next().toCharArray();
        char[]t=fs.next().toCharArray();
        int ans=t.length;
        for(int i=0;i<s.length-t.length+1;i++){
            int count =0;
            for(int j=0;j<=t.length-1;j++){
                if(s[j+i]!=t[j]){
                    count++;
                }
            }
            if(count<ans){
                ans=count;
            }
        }
        System.out.println(ans);
    }
    static class FastScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
        int[] readArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }
        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
