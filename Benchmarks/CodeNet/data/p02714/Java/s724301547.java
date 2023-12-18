import  java.io.*;
import  java.math.*;
import  java.util.*;


public class Main {
    public static void main(String[] args) {
    	FastReader cin = new FastReader();
        int n = cin.nextInt();
        char s[] = cin.next().toCharArray();
        int a[] = new int[4010];
        int b[] = new int[4010];
        int c[] = new int[4010];
        
        if(s[0] == 'R') a[0] = 1;
        if(s[0] == 'G') b[0] = 1;
        if(s[0] == 'B') c[0] = 1;
        
        for(int i = 1; i < n; i++){
            if(s[i] == 'R'){
                a[i] = a[i-1]+1;
                b[i] = b[i-1];
                c[i] = c[i-1];
            }
            else if(s[i] == 'G'){
                b[i] = b[i-1]+1;
                a[i] = a[i-1];
                c[i] = c[i-1];
            }
            else if(s[i] == 'B'){
                c[i] = c[i-1]+1;
                a[i] = a[i-1];
                b[i] = b[i-1];
            }
        }
        long ans = 0;
        for(int i = 0; i < n; i++){
            int x = i;
            for(int j = i+1; j < n; j++){
                if(s[j] != s[i]){
                    x = j;
                    if(x == i|| x > n) continue;
                    
                    if((s[i]=='G'&&s[j]=='R')||(s[j]=='G'&&s[i]=='R')) ans += c[n-1]-c[x-1];
                    else if((s[i]=='B'&&s[j]=='R')||(s[j]=='B'&&s[i]=='R')) ans += b[n-1]-b[x-1];
                    else if((s[i]=='G'&&s[j]=='B')||(s[j]=='G'&&s[i]=='B')) ans+=a[n-1]-a[x-1];
                    
                    if((2*x-i)<n&&(s[2*j-i]!=s[j]&&s[2*j-i]!=s[i])) ans--;
                }
            }
        }
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