import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

import java.util.*;

public class Main {
    static int[] flag;
public static ArrayList<Integer> erathosthenes(int x) {
    int[] nums = new int[x];
    flag = new int[x];
    for (int i=2;i<x;i++) {
        nums[i]=i;
    }
    for (int i=2;i<Math.sqrt(x);i++) {
        if (flag[i]==1) {
            continue;
        }
        for (int j=2;j*i<x;j++) {
            flag[j*i]=1;
        }
    }
    ArrayList<Integer> ans = new ArrayList<Integer>();
    for (int i=2;i<x;i++) {
        if (flag[i]==0) {
            ans.add(nums[i]);
        }
    }
    return ans;
}
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        int[] isPrime = new int[100000+1];
        isPrime[1] = 1;
        for (Integer i : erathosthenes(100000)) {
            isPrime[i]=1;
        }
        int[] ruiseki = new int[100000+1];
        for (int i=2;i<100000;i+=2) {
            ruiseki[i+1] = ruiseki[i-1];
            if (isPrime[i+1]==1 && isPrime[(i+2)/2]==1) {
                ruiseki[i+1]++;
            }
        }
        int Q = in.nextInt();
        for (int i=0;i<Q;i++) {
            int l = in.nextInt();
            if (l==1) {
                l=2;
            }
            int r = in.nextInt();
            out.println(ruiseki[r]-ruiseki[l-2]);
        }

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
