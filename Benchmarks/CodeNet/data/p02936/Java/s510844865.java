import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {

    private static List<List<Integer>> subsets;
    private static int count = 0;
    private static BigInteger thirteen = new BigInteger("13");
    private static BigInteger five = new BigInteger("5");
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        InputReader.OutputWriter out = new InputReader.OutputWriter(outputStream);

        int n = in.nextInt();
        int m = in.nextInt();
        n--;
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        HashMap<Integer,Integer> values = new HashMap<>();
        for (int i = 1; i <=n+1; i++) {
            values.put(i,0);
        }
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            List<Integer> list;
            if(map.containsKey(a)) {
                list = map.get(a);
            }
            else {
                list = new ArrayList<>();
            }
            list.add(b);
            map.put(a,list);
        }
        for (int i = 0; i < m; i++) {
            int v = in.nextInt();
            int x = in.nextInt();
            dfs(map,values,v,x,new HashSet<>());
        }
        for (int i = 1; i <=n+1; i++) {
            out.print(values.get(i) + " ");
        }
        out.flush();
    }
    private static void dfs(HashMap<Integer,List<Integer>> map, HashMap<Integer,Integer> values, int x, int v,HashSet<Integer> set) {
        if(!set.contains(x)) {
            values.put(x, values.getOrDefault(x, 0) + v);
            set.add(x);
        }
        if(!map.containsKey(x)) {
            return;
        }
        List<Integer> list = map.get(x);
        for (int i = 0; i < list.size(); i++) {
            int key = list.get(i);
            if(!set.contains(key)) {
                values.put(key,values.get(key) +  v);
                set.add(key);
            }
        }
        for (int i = 0; i < list.size();i++) {
            int key = list.get(i);
            dfs(map,values,key,v,set);
        }
    }

    static double gcd(double a,double b) {
        return b == 0 ? a : gcd(b,a%b);
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