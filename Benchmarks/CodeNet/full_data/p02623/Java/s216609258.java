import java.util.*;
import java.io.*;

public class Main {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int stack1 = nextInt();
        int stack2 = nextInt();
        int totalTime = nextInt();
        long psa1 [] = new long [stack1+1];
        long psa2 [] = new long [stack2+1];
        for (int x=1; x<=stack1; x++) {
            psa1[x] = psa1[x-1] + nextInt();
        }
        for (int x=1; x<=stack2; x++) {
            psa2[x] = psa2[x-1] + nextInt();
        }
        int stack1Pointer = 1;
        int stack2Pointer = stack2;
        while (stack1Pointer<=stack1 && stack2Pointer>0) {
            long stack2PSA = psa2[stack2] - psa2[stack2Pointer-1];
            if (psa1[stack1Pointer]+stack2PSA<=totalTime) {
                stack1Pointer++;
            }
            else {
                stack2Pointer--;
            }
        }
        System.out.println(stack1Pointer+stack2Pointer-1);
    }
    
    public static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
    public static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
}


