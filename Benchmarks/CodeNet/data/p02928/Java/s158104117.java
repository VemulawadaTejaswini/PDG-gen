import java.io.*;
import java.util.*;

public class Main {
    private static final int MAX = Integer.MAX_VALUE;
    private static final int MIN = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        InputReader.OutputWriter out = new InputReader.OutputWriter(outputStream);
        Scanner scanner = new Scanner(System.in);

        int n = in.nextInt();
        long k = in.nextLong();
        int [] a = new int[n];
        long mod = (long) (1e9) + 7;
        long res = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(a[i] > a[j]) {
                    res+=k*(k-1)/2;
                    if(i < j) res+=k;
                    res%=mod;
                }
            }
        }
        out.println(res);
        out.flush();
    }
    static long pow(long a, long b, int mod) {
        return (a*b)%mod;
    }

    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<order.length();i++) {
            map.put(order.charAt(i),i);
        }
        String [] reserve = words.clone();
        Arrays.sort(words, (o1, o2) -> {
            int min = Math.min(o1.length(),o2.length());
            for (int i = 0; i < min; i++) {
                int v1 = map.get(o1.charAt(i));
                int v2 = map.get(o2.charAt(i));
                if(v1 != v2) {
                    return Integer.compare(v1,v2);
                }
            }
            return Integer.compare(o1.length(),o2.length());
        });

        return Arrays.equals(reserve,words);
    }
    private static int binarySearch(List<Integer> list, int val) {
        int lo = 0;
        int hi = list.size() - 1;
        while (lo<=hi) {
            int med = lo+(hi-lo)/2;
            if(list.get(med) > val) {
                hi = med - 1;
            }
            else {
                lo = med + 1;
            }
        }
        return hi;
    }
    private static void revere(char [] c) {
        int i = 0;
        int j = c.length - 1;
        while (i<=j) {
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;
        }
    }
    public Integer[] relativeSortArray(Integer[] arr1, int[] arr2) {
        Map<Integer,Integer> indexMap = new HashMap<>();
        for(int i=0;i<arr2.length;i++){
            indexMap.put(arr2[i],i);
        }
        Arrays.sort(arr1,(Integer i1,Integer i2)-> indexMap.get(i2) - indexMap.get(i1));
        return arr1;
    }
    static boolean check(char[][] c, int i, int j) {
        return i>=0 && j>=0 && i<c.length && j<c[0].length;
    }
    static int [] freq (String s) {
        int [] f = new int[128];
        for(char c : s.toCharArray()) {
            f[c]++;
        }
        return f;
    }




    static int numberOfSubsequences(String a, String b) {
        int [] dp = new int[b.length()+1];
        dp[0] = 1;
        for (int i = 0; i < a.length(); i++) {
            for (int j = b.length() - 1; j >=0;j--) {
                if(a.charAt(i) == b.charAt(j)) {
                    dp[j+1]+=dp[j];
                }
            }
        }
        return dp[dp.length - 1];
    }
    static long count(String a, String b)
    {
        int m = a.length();
        int n = b.length();

        // Create a table to store
        // results of sub-problems
        long lookup[][] = new long[m + 1][n + 1];

        // If first string is empty
        for (int i = 0; i <= n; ++i)
            lookup[0][i] = 0;

        // If second string is empty
        for (int i = 0; i <= m; ++i)
            lookup[i][0] = 1;

        // Fill lookup[][] in
        // bottom up manner
        for (int i = 1; i <= m; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                // If last characters are
                // same, we have two options -
                // 1. consider last characters
                //    of both strings in solution
                // 2. ignore last character
                //    of first string
                if (a.charAt(i - 1) == b.charAt(j - 1))
                    lookup[i][j] = lookup[i - 1][j - 1] +
                            lookup[i - 1][j];

                else
                    // If last character are
                    // different, ignore last
                    // character of first string
                    lookup[i][j] = lookup[i - 1][j];
            }
        }

        return lookup[m][n];
    }
}
class Point {
    private int x;
    private int y;
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public Point(int x,int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
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