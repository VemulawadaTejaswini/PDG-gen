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

    private static class Node {
        char ch;
        Node[] children = new Node[27];
        Set<Integer> strings = new HashSet<>();
        int size = 0;

        public Node(char ch) {
            this.ch = ch;
        }

        @Override
        public String toString() {
            return String.valueOf(ch);
        }
    }


    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        int n = in.nextInt();
//        int[][][] lessThan = new int[n][27][27];
        String[] allStrings = new String[n];

        Node root = new Node((char) 0);

        for (int i = 0; i < n; i++) {
            String s = in.nextString() + (char) ('a' - 1);
            allStrings[i] = s;
            Node node = root;
            for (int j = 0; j < s.length(); j++) {
                int c = getCharIndex(s.charAt(j));
                if (node.children[c] == null) {
                    node.children[c] = new Node(s.charAt(j));
                }
                node = node.children[c];
                node.size++;
            }
            node.strings.add(i);
        }

//        fill(lessThan, root, allStrings, new ArrayList<>(), 0);

        int q = in.nextInt();
        for (int ii = 0; ii < q; ii++) {
            int k = in.nextInt();
            String order = (char) ('a' - 1) + in.nextWord();
            int[] charOrder = new int[27];
            for (int i = 0; i < order.length(); i++) {
                charOrder[getCharIndex(order.charAt(i))] = i;
            }

            int less = getLess(root, allStrings, 0, k - 1, charOrder);
            out.println(less + 1);
        }

        out.close();
    }

    private static int getLess(Node node, String[] allStrings, int i, int sNum, int[] charOrder) {
        int result = 0;
        if (node.strings.contains(sNum)) {
            return result;
        }

        int ch1 = getCharIndex(allStrings[sNum].charAt(i));
        for (int ch2 = 0; ch2 < 27; ch2++) {
            if (node.children[ch2] == null || ch1 == ch2) {
                continue;
            }
            if (charOrder[ch2] < charOrder[getCharIndex(allStrings[sNum].charAt(i))]) {
                result += node.children[ch2].size;
            }
        }
        result += getLess(node.children[ch1], allStrings, i + 1, sNum, charOrder);
        return result;
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
