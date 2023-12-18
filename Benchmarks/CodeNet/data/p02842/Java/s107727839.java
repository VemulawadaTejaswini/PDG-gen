import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {

    private static List<List<Integer>> subsets;


    private static final double LOAD_FACTOR = 0.75;
    private  int num;
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        InputReader.OutputWriter out = new InputReader.OutputWriter(outputStream);
        Scanner scanner = new Scanner(System.in);

        int n = in.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if((int)(i*1.08) == n) {
                found = true;
                out.println(i);
                break;
            }
        }
        if(!found) {
            out.println(":(");
        }
        out.flush();
    }



    private static int solve(int a, int b) {
        int diff = Math.abs(a - b);
        int count = 0;
        int temp = diff;
        diff%=5;
        count+=temp/5;
        temp = diff;
        diff%=2;
        count+=temp/2;
        count+=diff;
        return count;
    }
    public int numDecodings(String s) {
        num = 0;
        dfs(s,0);
        return num;
    }
    private void dfs(String s, int index) {
        if(index == s.length()) {
            num++;
            return;
        }
        int n = s.charAt(index) - '0';
        if(check(n)) {
            dfs(s,index + 1);
        }
        if(index + 1 < s.length()) {
            int nn = Integer.parseInt(s.substring(index,index + 2));
            if(check(nn) && s.charAt(index)!='0') {
                dfs(s,index + 2);
            }
        }
    }
    private boolean check(int n) {
        return n>=1 && n<=26;
    }
    private static void generateStars(String current, int star, int shouldBe, int n) {
        if(current.length() ==  n) {
            if(star == shouldBe) {
                System.out.println(current);
            }
            return;
        }
        if(star < shouldBe) {
            if(!current.endsWith("*")) {
                generateStars(current + "*", star + 1, shouldBe, n);
            }
        }
        generateStars(current + ".", star, shouldBe, n);
    }
    private static void generateBrackets(String current, int open, int close, int n) {
        if(current.length() == 2*n) {
            System.out.println(current);
            return;
        }
        if(open < n) {
            generateBrackets(current + "(", open + 1, close,n);
        }
        if(close < open) {
            generateBrackets(current + ")", open, close + 1,n);
        }
    }
    private static boolean isPrime(long n) {
        if(n < 2) return false;
        for (long i = 2; i*i <= n;i++) {
            if(n%i==0) return false;
        }
        return true;
    }
    private static Set<Integer> allSubsetSum(int [] a) {
        int n = a.length;
        int total = 1 << n;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < total; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if((i&(1<<j)) == 0) {
                    sum+=a[j];
                }
            }
            set.add(sum);
        }
        return set;
    }
    private static long sum (int k, long s, long m) {
        return s - (k - 1) * m;
    }


    public static String candyCrush(String s) {
        int n = s.length();
        Deque<Letter> stack = new ArrayDeque<>(n);
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            int count = 1;
            for (; i + 1 < n && s.charAt(i + 1) == c; i++) {
                count++;
            }

            if (!stack.isEmpty() && stack.peek().getLetter() == c) {
                count += stack.pop().getCount();
            }

            if (count < 3) {
                stack.push(new Letter(c, count));
            }

        }

        StringBuilder sb = new StringBuilder(n);
        while (!stack.isEmpty()) {
            Letter letter = stack.pollLast();
            for (int count = letter.getCount(); count > 0; count--) {
                sb.append(letter.getLetter());
            }
        }
        return sb.toString();
    }

    private static int ceil(int [] a, int start, int end, int key) {
        while (end-start>1) {
            int mid = start+(end-start)/2;
            if(a[mid]>=key) {
                end = mid;
            }
            else {
                start = mid;
            }
        }
        return end;
    }
    static boolean getBit(int n, int i) {
        System.out.println((n & (1 << i)));
        return ((n & (1 << i))!=0);
    }
    private static void moveZeroes(int [] a) {
        int index = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] != 0) {
                int temp = a[i];
                a[index++] = a[i];
                a[i] = temp;
                count++;
            }
        }
        for (int i = index; i < a.length; i++) {
            a[i] = 0;
        }
    }

    private static int EulerFunction(int n) {
        Map<Integer,Integer> factors = factors(n);
        int num = 0;
        for(Map.Entry<Integer,Integer> m : factors.entrySet()) {
            int key = m.getKey();
            int value = m.getValue();
            num+=(key - 1)*binPow(key,value - 1);
        }
        return num;
    }
    private static boolean [] sieveOfEratosthenes(int n) {
        boolean [] primes = new boolean[n+1];
        for (int i = 0; i < n; i++) {
            primes[i] = true;
        }
        for (int i = 2; i*i <=n; i++) {
            if(primes[i]) {
                for (int j = i*i; j <=n; j+=i) {
                    primes[j] = false;
                }
            }
        }
        return primes;
    }
    private static Map<Integer,Integer> factors(int n) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=2;i*i<=n;i++) {
            while (n%i==0) {
                map.put(i,map.getOrDefault(i,0) + 1);
                n/=i;
            }
        }
        if(n > 1) map.put(n,map.getOrDefault(n,0) + 1);
        return map;
    }
    private static int binPow(int a,int b) {
        if(b == 0) return 1;
        if(b%2!=0) {
            return a*binPow(a,b-1);
        }
        else {
            int res = binPow(a,b/2);
            return res*res;
        }
    }
    private void lis() {
           /*int [] a = {2,3,4,1,1,3,4,6,8,9,4,1};
        int n = a.length;
        int length = 0;
        List<Integer> list = new ArrayList<>();
        List<Integer> longest = new ArrayList<>();
        int maxLength = 1;
        for (int i = 0; i < a.length; i++) {
            int current = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++) {
                if(a[j] > current) {
                    list.add(a[j]);
                    current = a[j];
                }
            }
            if(list.size() > length) {
                length = list.size();
                longest = new ArrayList<>(list);
            }
            list.clear();
        }

        out.println(longest.size());
        out.println(longest);*/

    }
    private static int check(int [] count, int k) {
        for (int i = 0; i < count.length; i++) {
            if(count[i] == k) return i;
        }
        return -1;
    }
    private static void reserve(long [] a, int i, int j) {
        while (i<=j) {
            long temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
    private static String compressTheString(String s) {
        char [] c =  s.toCharArray();
        int count = 1;
        char current = c[0];
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < c.length; i++) {
            if(c[i] == current) {
                count++;
            }
            else {
                sb.append(current);
                sb.append(count);
                count = 1;
                current = c[i];
            }
        }
        sb.append(current);
        sb.append(count);
        if(sb.length() >= c.length) {
            return s;
        }
        else {
            return sb.toString();
        }
    }

}

class Letter {
    private char letter;
    private int  count;

    public int getCount() {
        return count;
    }

    public char getLetter() {
        return letter;
    }

    public Letter (char letter, int count) {
        this.letter = letter;
        this.count = count;
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
    public Integer nextInt() {return Integer.valueOf(next());}
    public Long nextLong() {return  Long.valueOf(next());}
    public Double nextDouble() {return Double.valueOf(next());}

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