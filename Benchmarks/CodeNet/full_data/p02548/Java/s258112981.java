import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        //finne antall ulike to tall som sammen kan ganges å bli lavere enn n
        int lowestCube = (int) Math.sqrt(n);
        int c = 0;
        var doubles = new ArrayList<Integer>();
        for (int i = 1; i<=n; i++) {
            for (int q = 1; q<=n; q++) {
                if (i==q) {
                    continue;
                }
                if (i*q<n) {
                    c++;
                } else {
                    break;
                }

            }
        }
        if (lowestCube*lowestCube == n) {
            System.out.println(c+lowestCube-1);
        } else {
            System.out.println(c+lowestCube);
        }

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

