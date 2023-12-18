import java.util.*;
import java.io.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws Exception {
        FastScanner scanner = new FastScanner();
        int n, m;
        int[] tmp = scanner.nextIntArray();
        n = tmp[0];
        m = tmp[1];

        ArrayList<Job> j = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            tmp = scanner.nextIntArray();
            int a = tmp[0];
            int b = tmp[1];
            if (a > m)
                continue;
            j.add(new Job(a, b));
        }

        if (j.size() == 0) {
            System.out.println(0);
            System.exit(0);
        }

        Collections.sort(j, Collections.reverseOrder());

        ArrayList<Job> j2 = new ArrayList<>();
        for (int i = 0; i < min(m, n); i++)
            j2.add(j.get(i));

        Collections.sort(j2, new Comparator<Job>() {
            @Override
            public int compare(Job o1, Job o2) {
                if (o1.delay < o2.delay)
                    return 1;
                else if (o1.delay > o2.delay)
                    return -1;
                else {
                    if (o1.reward < o2.reward)
                        return 1;
                    if (o1.reward > o2.reward)
                        return -1;
                    return 0;
                }
            }
        });


        long tot = 0;
        int c = 0;

        for (int i = 0; i < j2.size(); i++) {
            while (i < j2.size() && j2.get(i).delay + i > m)
                i++;
            if (i >= j2.size())
                break;
            tot += j2.get(i).reward;
            c += 1;
            if (c == m + 1)
                break;
        }

        if (c <= m) {
            ArrayList<Job> j3 = new ArrayList<>();
            for (int i = m; i < m - c + 1; i++) {
                j3.add(j.get(i));
            }

            Collections.sort(j3, new Comparator<Job>() {
                @Override
                public int compare(Job o1, Job o2) {
                    if (o1.delay < o2.delay)
                        return 1;
                    else if (o1.delay > o2.delay)
                        return -1;
                    else {
                        if (o1.reward < o2.reward)
                            return 1;
                        if (o1.reward > o2.reward)
                            return -1;
                        return 0;
                    }
                }
            });
            for (int i = 0; i < j3.size(); i++) {
                while (i < j3.size() && j3.get(i).delay + i > m)
                    i++;
                if (i >= j3.size())
                    break;
                tot += j3.get(i).reward;
                c += 1;
                if (c == m + 1)
                    break;
            }
        }

        System.out.println(tot);
    }

    public static class Job implements Comparable<Job> {
        int delay, reward;
        public Job(int delay, int reward) {
            this.delay = delay;
            this.reward = reward;
        }
        @Override
        public int compareTo(Job other) {
            if (this.reward < other.reward)
                return -1;
            if (this.reward > other.reward)
                return 1;
            else {
                if (this.delay < other.delay)
                    return -1;
                else if (this.delay > other.delay)
                    return 1;
                else return 0;
            }
        }
        @Override
        public String toString() {
            return this.delay + " " + this.reward;
        }
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