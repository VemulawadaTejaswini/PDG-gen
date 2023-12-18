import java.util.*;
import java.io.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class D {

    public static void main(String[] args) throws Exception {
        FastScanner scanner = new FastScanner();
        long n = scanner.nextLong();
        System.out.println(n * (n + 1) / 2 - n);
    }

    private static class FastScanner {
        private BufferedReader br;

        public FastScanner() { br = new BufferedReader(new InputStreamReader(System.in)); }
        public FastScanner(String input) throws Exception { br = new BufferedReader(new FileReader(input)); }
        public int[] nextIntArray() throws IOException {
            String line = br.readLine();
            String[] strings = line.trim().split("\\s+");
            int[] array = new int[strings.length];
            for (int i = 0; i < array.length; i++)
                array[i] = Integer.parseInt(strings[i]);
            return array;
        }
        public int nextInt() throws IOException { return Integer.parseInt(br.readLine()); }
        public long[] nextLongArray() throws IOException {
            String line = br.readLine();
            String[] strings = line.trim().split("\\s+");
            long[] array = new long[strings.length];
            for (int i = 0; i < array.length; i++)
                array[i] = Long.parseLong(strings[i]);
            return array;
        }
        public ArrayList<Integer> nextIntegerArrayList() throws IOException {
            String line = br.readLine();
            String[] strings = line.trim().split("\\s+");
            ArrayList<Integer> array = new ArrayList<Integer>();
            for (int i = 0; i < strings.length; i++)
                array.add(Integer.parseInt(strings[i]));
            return array;
        }
        public ArrayList<Long> nextLongArrayList() throws IOException {
            String line = br.readLine();
            String[] strings = line.trim().split("\\s+");
            ArrayList<Long> array = new ArrayList<Long>();
            for (int i = 0; i < strings.length; i++)
                array.add(Long.parseLong(strings[i]));
            return array;
        }
        public long nextLong() throws IOException { return Long.parseLong(br.readLine()); }
        public double nextDouble() throws IOException { return Double.parseDouble(br.readLine()); }
        public String nextLine() throws IOException { return br.readLine(); }


        public ArrayList<BigInteger> nextBigIntegers() throws IOException {
            String line = br.readLine();
            String[] strings = line.trim().split("\\s+");
            ArrayList<BigInteger> array = new ArrayList<BigInteger>();
            for (int i = 0; i < strings.length; i++)
                array.add(BigInteger.valueOf(Long.valueOf(strings[i])));
            return array;
        }
    }
}
