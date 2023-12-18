import java.io.*;
import java.util.*;



public class Main {

    private static int[][] st;
    private static int [] logs;
    private static Set<List<Integer>> permutations;
    private static int index = 0;
    private static int max = 0;
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        InputReader.OutputWriter out = new InputReader.OutputWriter(outputStream);
        Scanner scanner = new Scanner(System.in);

        long a = in.nextLong();
        long b = in.nextLong();
        long gcd = gcd(a,b);
        int size = factorization(gcd);
        out.println(size + 1);




        out.flush();
    }
    //12 18 ->18 12 - > 12 6
    public static long gcd(long a, long b) {
       while (b > 0) {
           long temp = a;
           a = b;
           b = temp%b;
       }
       return a;
    }

    private static int factorization(long n) {
        Set<Long> set = new HashSet<>();
        for(long i = 2; i * i <=n; i++) {
            while (n % i == 0) {
                set.add(i);
                n /= i;
            }
        }
        if(n > 1) set.add(n);
        return set.size();
    }
    static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i<=j) {
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    private static void permute(int [] a, int l, int r) {
        if(l == r) {
            List<Integer> list = new ArrayList<>();
            for(int i : a) list.add(i);
            permutations.add(list);
        }
        else {
            for (int i = l; i <=r; i++) {
                swap(a,l,i);
                permute(a,l+1,r);
                swap(a,l,i);
            }
        }
    }
    private static void swap(int [] a, int l, int r) {
        int temp = a[l];
        a[l] = a[r];
        a[r] = temp;
    }

}

class InputReader extends BufferedReader {
    StringTokenizer tokenizer;

    public InputReader(InputStream inputStream) {
        super(new InputStreamReader(inputStream), 32768);
    }

    public InputReader(String filename) {
        super(new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream(filename)));
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(readLine());
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }
        return tokenizer.nextToken();
    }

    public Integer nextInt(){
        return Integer.valueOf(next());
    }
    public Long nextLong() {
        return  Long.valueOf(next());
    }
    public Double nextDouble() {
        return Double.valueOf(next());
    }
    static class OutputWriter extends PrintWriter {
        public OutputWriter(OutputStream outputStream) {
            super(outputStream);
        }

        public OutputWriter(Writer writer) {
            super(writer);
        }

        public OutputWriter(String filename) throws FileNotFoundException {
            super(filename);
        }

        public void close() {
            super.close();
        }
    }
}