import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        InputReader.OutputWriter out = new InputReader.OutputWriter(outputStream);

        long n = in.nextLong();
        long max =  (n*(n-1))/2;

        out.println(max);
        out.flush();
    }

    private static Set<Integer> del(int n) {
        Set<Integer> set = new HashSet<>();
        for (int i = 2; i * i <= n; i++) {
            if(n%i==0) {
                set.add(i);
                if(i*i!=n) {
                    set.add(n/i);
                }
            }
        }
        return set;
    }
    private static void randomlyFillAnArray(int [] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*Integer.MAX_VALUE);
        }
    }


    private static void permutationOfNumbers(int n, int m, int [] a, int index) {
        if(index == n) {
            System.out.println(Arrays.toString(a));
            return;
        }
        for (int i = 1; i <=m; i++) {
            a[index] = i;
            permutationOfNumbers(n,m,a,index + 1);
        }
    }

    private static void permutationOfLetters( char m, int index, char[] a) {
        if(index == a.length) {
            System.out.println(Arrays.toString(a));
            return;
        }
        for (char c = 'a'; c <=m; c++) {
            a[index] = c;
            permutationOfLetters(m,index + 1, a);
        }
    }

    private static void permutations(int n, int index, int [] a, boolean [] used) {
        if(index == n) {
            System.out.println(Arrays.toString(a));
            return;
        }
        for (int i = 1; i <=n; i++) {
            if(used[i]) continue;
            a[index] = i;
            used[i] = true;
            permutations(n,index + 1,a,used);
            used[i] = false;
        }
    }

    private static boolean correct(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '(' || c == '[') {
                stack.push(c);
            }
            else {
                if(stack.isEmpty()) return false;
                char peek = stack.peek();
                if(peek == '(' && c == ']') return false;
                if(peek == '[' && c == ')') return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
    private static void divideNumber(int sum, int last, int n, List<Integer> current) {
        if(sum > n) {
            return;
        }
        if(sum == n) {
            System.out.println(current);
            return;
        }
        for (int i = last; i <= n - sum ; i++) {
            current.add(i);
            divideNumber( sum + i, i,n,current);
            current.remove(current.size() - 1);
        }
    }
    private static void fishki(String s, int n, int m) {
        if(s.length() == n) {
            if(m == 0) {
                System.out.println(s);
            }
            return;
        }

        fishki(s + "*", n, m - 1);
        fishki(s + ".", n, m);
    }
    private static boolean check(String s) {
        for (int i = 0; i < s.length(); i++) {
            if(i > 0 && s.charAt(i) == '*' && s.charAt(i-1) == '*') return false;
        }
        return true;
    }
    private static boolean [] erath() {
        boolean[] isPrime = new boolean[200_000 + 1];
        Arrays.fill(isPrime,true);
        isPrime[0] = false;
        isPrime[1] = false;
        int n = isPrime.length - 1;
        for (int i = 2; i*i<=n; i++) {
            if(isPrime[i]) {
                for (int j = i*i; j <=n; j+=i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }



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
}

class Point {
    
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
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