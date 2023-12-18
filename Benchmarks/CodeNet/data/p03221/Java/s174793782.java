import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        InputReader.OutputWriter out = new InputReader.OutputWriter(outputStream);

        int n = in.nextInt();
        int m = in.nextInt();
        HashMap<Integer,List<Integer>> list = new HashMap<>();
        LinkedList<City> q = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            int p = in.nextInt();
            int y = in.nextInt();
            q.addLast(new City(p,y));
            List<Integer> cities;
            if(list.containsKey(p)) {
                cities = list.get(p);
            }
            else {
                cities = new ArrayList<>();
            }
            cities.add(y);
            list.put(p,cities);
        }
        for (Map.Entry<Integer,List<Integer>> mp : list.entrySet()) {
            Collections.sort(mp.getValue());
        }

        while (!q.isEmpty()) {
            City current = q.pollFirst();
            int p = current.getP();
            int y = current.getY();
            List<Integer> l = list.get(p);
            int index = Collections.binarySearch(l,y);
            String id = constructId(p,index + 1);
            out.println(id);
        }

        out.flush();
    }
    static String constructId(int p,int index) {
        String ps = Integer.toString(p);
        String is = Integer.toString(index);
        int pl = ps.length();
        int il = is.length();
        if(pl < 6) {
            int diff = 6 - pl;
            StringBuilder sb = new StringBuilder();
            while (diff-->0) {
                sb.append("0");
            }
            sb.append(ps);
            ps = sb.toString();
        }
        if(il < 6) {
            int diff = 6 - il;
            StringBuilder sb = new StringBuilder();
            while (diff-->0) {
                sb.append("0");
            }
            sb.append(is);
            is = sb.toString();
        }
        return ps+is;
    }

    private static List<Integer> divisors(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i*i<=n; i++) {
            if(n%i==0) {
                list.add(i);
                if(n/i!=i) {
                    list.add(n/i);
                }
            }
        }
        return list;
    }

}
class City {
    int p;
    int y;
    public int getP() {
        return p;
    }
    public int getY() {
        return y;
    }
    public City(int p,int y) {
        this.p = p;
        this.y = y;
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