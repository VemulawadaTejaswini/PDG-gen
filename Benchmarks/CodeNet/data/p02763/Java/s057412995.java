import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

import java.util.*;

class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        int N = in.nextInt();
        String S = in.next();
        char[] cc = S.toCharArray();
        int Q = in.nextInt();
        ArrayList<TreeSet<Integer>> list = new ArrayList<TreeSet<Integer>>();
        for (int i=0;i<26;i++) {
            TreeSet<Integer> add = new TreeSet<Integer>();
            list.add(add);
        }
        for (int i=0;i<N;i++) {
            list.get((int)cc[i]-97).add(i);
        }
        // System.out.println(list);
        for (int q=0;q<Q;q++) {
            int num = in.nextInt();
            if (num==1) {
                int i = in.nextInt()-1;
                char c = in.next().charAt(0);
                list.get((int)cc[i]-97).remove(i);
                list.get((int)c-97).add(i);
                cc[i] = c;
            } else { // num==2
                int l = in.nextInt()-1;
                int r = in.nextInt()-1;
                int ans = 0;
                for (int i=0;i<26;i++) {
                    if (list.get(i).higher(l-1)!=null && list.get(i).lower(r+1)!=null) {
                        int low = list.get(i).higher(l-1);
                        int high = list.get(i).lower(r+1);
                        // out.println("char, low, high: "+(char)(i+97)+" "+low+" "+high);
                        // if (low==high) ans++;
                        if (l<=low && l<=high && low<=r && high<=r) ans++;
                    }
                }
                out.println(ans);
            }
        }
        // out.println(list);

        out.close();
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}
