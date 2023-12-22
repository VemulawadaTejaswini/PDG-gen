import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Reader sc = new Reader();
        PrintWriter pw = new PrintWriter(System.out);
        
        try {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0 ; i<n ; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);

            int count = 0;
            for(int i=0 ; i<n ; i++) {
                for(int j=i+1 ; j<n ; j++) {
                    for(int k=j+1 ; k<n ; k++) {
                        if(a[i] != a[j] && a[i] != a[k] && a[j] != a[k]) {
                            if(a[i] + a[j] > a[k]) {
                                count++;
                            }
                        }
                    }
                }
            }

            pw.println(count);
        }
        finally {
            pw.flush();
            pw.close();
        }
    }
    
    static class Reader {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while(!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch(IOException io) {
                    io.printStackTrace();
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
    }
}
