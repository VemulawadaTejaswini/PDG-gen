import java.io.*;
import java.util.Arrays;

public class Main {

    class Card implements Comparable<Card> {
        public final String suit;
        public final int number;
        public final int id;

        public Card(String suit, int number, int id) {
            this.suit = suit;
            this.number = number;
            this.id = id;
        }

        @Override
        public int compareTo(Card card) {
            if (this.number < card.number) return -1;
            if (this.number > card.number) return 1;
            return 0;
        }

        @Override
        public String toString() {
            return this.suit + " " + String.valueOf(this.number);
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) return true;
            if (!(obj instanceof Card)) return false;
            Card c = (Card) obj;
            return this.suit.equals(c.suit) && this.number == c.number;
        }
    }

    void solve() {
        int n = io.nextInt();
        Card[] A = new Card[n];
        for (int i = 0; i < n; i++) {
            String suit = io.next();
            int number = io.nextInt();
            A[i] = new Card(suit, number, i);
        }

        Card[] B = A.clone();
        quickSort(A, 0, A.length - 1);
        boolean isStable = true;
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i - 1].number == A[i].number && A[i - 1].id > A[i].id) {
                isStable = false;
                break;
            }
        }
        System.out.println(isStable ? "Stable" : "Not stable");
        for (Card a : A) {
            System.out.println(a.toString());
        }
    }

    int partition(Card[] A, int p, int r) {
        Card x = A[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (x.compareTo(A[j]) >= 0) {
                i += 1;
                swap(A, i, j);
            }
        }
        swap(A, i + 1, r);
        return i + 1;
    }

    void quickSort(Card[] A, int p, int r) {
        if (p < r) {
            int q = partition(A, p, r);
            quickSort(A, p, q - 1);
            quickSort(A, q + 1, r);
        }
    }

    void bubbleSort(Card[] c) {
        int n = c.length;
        for (int i = 0; i < n; i++)
            for (int j = n - 1; j > i; j--) {
                if (c[j - 1].compareTo(c[j]) > 0) {
                    Card tmp = c[j - 1];
                    c[j - 1] = c[j];
                    c[j] = tmp;
                }
            }
    }

    void swap(Card[] A, int idx1, int idx2) {
        Card tmp = A[idx1];
        A[idx1] = A[idx2];
        A[idx2] = tmp;
    }

    public static void main(final String[] args) {
        new Main().solve();
    }

    IO io = new IO();

    class IO {
        private final int SIZE = 1 << 12;
        private final InputStream stream = System.in;
        private final byte[] buffer = new byte[SIZE];
        private int ptr = 0, buffLen = 0;

        private boolean hasNextByte() {
            if (ptr < buffLen) return true;
            ptr = 0;
            try {
                buffLen = stream.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return buffLen > 0;
        }

        private byte readByte() {
            if (hasNextByte()) return buffer[ptr++];
            return -1;
        }

        private boolean isAscii(byte i) {
            return '!' <= i && i <= '~';
        }

        public char nextChar() {
            byte b = readByte();
            while (!isAscii(b)) b = readByte();
            return (char) b;
        }

        public String next() {
            StringBuilder sb = new StringBuilder();
            byte b = readByte();
            while (isAscii(b)) {
                sb.append((char) b);
                b = readByte();
            }
            return sb.toString();
        }

        public int nextInt() {
            return Integer.valueOf(next());
        }

        public long nextLong() {
            return Long.valueOf(next());
        }

        public double nextDouble() {
            return Double.valueOf(next());
        }
    }
}

