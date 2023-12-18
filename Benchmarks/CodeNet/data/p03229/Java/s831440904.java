import java.util.*;
import java.io.*;
 
public class Main {
    static char[] alps = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        long[] li = sc.nextLongArray(n);
        Arrays.sort(li);
        Deque<Long> q = new ArrayDeque<Long>();
        q.add(li[0]);
        int left = 1;
        int right = n-1;
        int j = 0;
        while(right - left >= 0){
            if(j % 2 == 0){
                q.addFirst(li[right]);
                right--;
                if(right < left){
                    break;
                }else{
                    q.addLast(li[right]);
                    right--;
                }
            }else{
                q.addFirst(li[left]);
                left++;
                if(right < left){
                    break;
                }else{
                    q.addLast(li[left]);
                    left++;
                }
            }
            j++;
        }
        long ans = 0;
        long prev = q.poll();
        while(q.size() > 0){
            long next = q.poll();
            ans += Math.abs(next-prev);
            prev = next;
        }
        System.out.println(ans);
    }
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;
    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken("\n");
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public double nextDouble() {
         return Double.parseDouble(next());
    }

    public int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    } 
}
