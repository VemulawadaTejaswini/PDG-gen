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
        Map<Character, Node> children = new HashMap<>();
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
                if (!node.children.containsKey(s.charAt(j))) {
                    node.children.put(s.charAt(j), new Node(s.charAt(j)));
                }
                node = node.children.get(s.charAt(j));
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

            int less = getLess(root, allStrings, new ArrayList<>(), 0, k-1, charOrder);
            out.println(less + 1);
        }

        out.close();
    }

    private static int getLess(Node node, String[] allStrings, List<int[]> letterSize, int i, int sNum, int[] charOrder) {
        int result = 0;
        if (node.strings.contains(sNum)) {
            for (int j = 0; j < letterSize.size(); j++) {
                int[] sizeToAdd = letterSize.get(j);
                for (int k = 0; k < sizeToAdd.length; k++) {
                    if (sizeToAdd[k] != 0) {
                        int ch2 = getCharIndex(allStrings[sNum].charAt(j));
                        if (charOrder[k] < charOrder[ch2]) {
                            result += sizeToAdd[k];
                        }
                    }
                }
            }
            return result;
        }

        char ch1 = allStrings[sNum].charAt(i);
        letterSize.add(new int[27]);
        for (Character ch2 : node.children.keySet()) {
            if (ch1 == ch2) {
                continue;
            }
            int charIndex = getCharIndex(ch2);
            letterSize.get(letterSize.size() - 1)[charIndex] += node.children.get(ch2).size;
        }
        return getLess(node.children.get(ch1), allStrings, letterSize, i + 1, sNum, charOrder);
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
