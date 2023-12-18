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
        Job [] jobs = new Job[n];
        for (int i = 0; i < n; i++) {
            jobs[i] = new Job(in.nextInt(),in.nextInt());
        }

        Arrays.sort(jobs,(x,y)->y.getReward() - x.getReward() == 0 ? y.getDay() - x.getDay() : y.getReward() - x.getReward());
        long total = 0;
        int currentDay = 0;
        for (int i = 0; i < jobs.length; i++) {
            int day = jobs[i].getDay();
            int reward = jobs[i].getReward();
            if(currentDay+day<=m) {
                total+=reward;
                currentDay++;
            }
        }
        out.println(total);
        out.flush();
    }

}
class Job {
    private int reward;
    private int day;

    public int getDay() {
        return day;
    }

    public int getReward() {
        return reward;
    }
    
    public Job(int day, int reward) {
        this.reward = reward;
        this.day = day;
    }

    @Override
    public String toString() {
        return day + " " + reward;
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