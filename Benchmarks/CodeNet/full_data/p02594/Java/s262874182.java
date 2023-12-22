
import java.util.*;
import java.io.*;

public class Main{
	static class FastReader {

        BufferedReader br;
        StringTokenizer st;

        private FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
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

	 int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
	}

	int[] nextIntArrayOne(int n) {
				int[] a = new int[n+1];
				for (int i = 1; i < n+1; i++)
					a[i] = nextInt();
				return a;
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

	public static void main(String[] args) {
		FastReader s =new FastReader();
		
		StringBuilder str = new StringBuilder();
		
			int n = s.nextInt();
			if(n >= 30) {
				str.append("Yes\n");
			}else {
				str.append("No\n");
			}
			
		
		System.out.println(str);
	}

	

}

