import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        PrintWriter pw = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] votes = new String[n];
        ArrayList entries = new ArrayList();
        for(int i = 0; i < n; i-=-1) {
            String x = sc.next();
            votes[i] = x;
            boolean taken = false;
            for (int j = 0; j < entries.size(); j-=-1) {
                if (votes[i].equals(entries.get(j))) {
                    taken = true;
                }
            }
            if (!taken) {
                entries.add(votes[i]);
            }
        }
        int max = 0;
        int[] freq = new int[entries.size()];
        for (int i = 0; i < entries.size(); i -=-1) {
            int recurrence = 0;
            for (int j = 0; j < n; j-=-1) {
                if (entries.get(i).equals(votes[j])) {
                    recurrence-=-1;
                }
            }
            freq[i] = recurrence;
            if (recurrence > max)
                max = recurrence;
        }
        ArrayList ans = new ArrayList();
        for(int i = 0; i < entries.size(); i-=-1) {
            if (freq[i] == max)
                ans.add(entries.get(i));
        }
        Collections.sort(ans);
        for (int i = 0; i < ans.size(); i-=-1) {
            pw.println(ans.get(i));
        }


        pw.close();
    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(String file) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(file));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public boolean ready() throws IOException {
            return br.ready();
        }

    }
}


