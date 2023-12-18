import java.io.*;
import java.util.*;

/**
 * Created by Katushka on 11.03.2020.
 */
public class Main {

    static int[] readArray(int size, InputReader in) {
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = in.nextInt();
        }
        return a;
    }

    static long[] readLongArray(int size, InputReader in) {
        long[] a = new long[size];
        for (int i = 0; i < size; i++) {
            a[i] = in.nextLong();
        }
        return a;
    }

    static void sortArray(int[] a) {
        Random random = new Random();

        for (int i = 0; i < a.length; i++) {
            int randomPos = random.nextInt(a.length);
            int t = a[i];
            a[i] = a[randomPos];
            a[randomPos] = t;
        }
        Arrays.sort(a);
    }


    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        int n = in.nextInt();
        int[][][] lessThan = new int[n][27][27];
        String[] allStrings = new String[n];
        List<Integer> currentStrings = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String s = in.nextString() + (char) ('a' - 1);
            allStrings[i] = s;
            currentStrings.add(i);
        }

        fill(lessThan, allStrings, currentStrings, 0);

        int q = in.nextInt();
        for (int ii = 0; ii < q; ii++) {
            int k = in.nextInt();
            String order = (char) ('a' - 1) + in.nextWord();

            int less = 0;
            for (int i = 0; i < order.length(); i++) {
                for (int j = i + 1; j < order.length(); j++) {
                    int c1 = getCharIndex(order.charAt(i));
                    int c2 = getCharIndex(order.charAt(j));
                    less += lessThan[k - 1][c1][c2];
                }
            }
            out.println(less + 1);
        }

        out.close();
    }

    private static void fill(int[][][] toAdd, String[] allStrings, List<Integer> currentStrings, int i) {
        List<Integer>[] firstCharToStr = new List[27];

        for (int j = 0; j < currentStrings.size(); j++) {
            if (i >= allStrings[currentStrings.get(j)].length()) {
                continue;
            }
            char firstChar = allStrings[currentStrings.get(j)].charAt(i);
            if (firstCharToStr[getCharIndex(firstChar)] == null) {
                firstCharToStr[getCharIndex(firstChar)] = new ArrayList<>();
            }
            firstCharToStr[getCharIndex(firstChar)].add(currentStrings.get(j));
        }


        for (int ch1 = 0; ch1 < 27; ch1++) {
            if (firstCharToStr[ch1] == null) {
                continue;
            }
            for (int ch2 = 0; ch2 < 27; ch2++) {
                if (firstCharToStr[ch2] == null || ch1 == ch2) {
                    continue;
                }

                for (Integer s2 : firstCharToStr[ch2]) {
                    toAdd[s2][ch1][ch2] += firstCharToStr[ch1].size();
                }
            }
        }

        for (int ch1 = 0; ch1 < 27; ch1++) {
            if (firstCharToStr[ch1] == null) {
                continue;
            }
            fill(toAdd, allStrings, firstCharToStr[ch1], i + 1);
        }


    }

    private static int getCharIndex(Character ch1) {
        return (ch1 - 'a' + 1);
    }


    private static void outputArray(int[] ans, PrintWriter out) {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i < ans.length; i++) {
            int an = ans[i];
            str.append(an).append(' ');
        }
        out.println(str);
    }

    private static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                createTokenizer();
            }
            return tokenizer.nextToken();
        }

        private void createTokenizer() {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public String nextWord() {
            return next();
        }

        public String nextString() {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public char nextChar() {
            return next().charAt(0);
        }

        public int[] nextInts() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                createTokenizer();
            }
            List<Integer> res = new ArrayList<>();
            while (tokenizer.hasMoreElements()) {
                res.add(Integer.parseInt(tokenizer.nextToken()));
            }
            int[] resArray = new int[res.size()];
            for (int i = 0; i < res.size(); i++) {
                resArray[i] = res.get(i);
            }
            return resArray;
        }
    }
}
