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
        List<Long> divisors = new ArrayList<>();
        for (long i = 1; i*i<= gcd ; i++) {
            if(gcd%i==0) {
                divisors.add(i);
                if(i*i!=gcd) {
                    divisors.add(gcd/i);
                }
            }
        }

        long [] d = new long[divisors.size()];
        int index = 0;
        for (long i : divisors) {
            d[index++] = i;
        }
        dfs(d,0,new ArrayList<>());
        out.println(max);
        out.flush();
    }
    private static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b,a%b);
    }
    private static void dfs(long [] a, int index, List<Long> list) {
        long g = 0;
        boolean found = false;
        for (int i = 0; i < list.size(); i++) {
            long n = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                long m = list.get(j);
                if(gcd(n,m) != 1)  {
                    found = true;
                    break;
                }
            }
            if(found) break;
        }
        if(!found) {
            max = Math.max(max,list.size());
        }

        for (int i = index; i < a.length; i++) {
            list.add(a[i]);
            dfs(a,i+1,list);
            list.remove(list.size() - 1);
        }
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