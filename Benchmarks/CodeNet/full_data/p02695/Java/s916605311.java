import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CManyRequirements solver = new CManyRequirements();
        solver.solve(1, in, out);
        out.close();
    }

    static class CManyRequirements {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int q = in.nextInt();
            ArrayList<int[]> list = new ArrayList<>();
            for (int i = 0; i < q; i++) {
                int[] array = new int[4];
                array[0] = in.nextInt();
                array[1] = in.nextInt();
                array[2] = in.nextInt();
                array[3] = in.nextInt();
                list.add(array);
            }


            int maxTotal = 0;
            int[] array2 = new int[n];
            for (int i = 1; i <= m; i++) {
                array2[0] = i;
                for (int j = i; j <= m; j++) {
                    array2[1] = j;
                    if (n > 2) {
                        for (int k = j; k <= m; k++) {
                            array2[2] = k;
                            if (n > 3) {
                                for (int l = k; l <= m; l++) {
                                    array2[3] = l;
                                    if (n > 4) {
                                        for (int o = l; o <= m; o++) {
                                            array2[4] = o;
                                            if (n > 5) {
                                                for (int p = o; p <= m; p++) {
                                                    array2[5] = p;
                                                    if (n > 6) {
                                                        for (int r = p; r <= m; r++) {
                                                            array2[6] = r;
                                                            if (n > 7) {
                                                                for (int s = r; s <= m; s++) {
                                                                    array2[7] = s;
                                                                    if (n > 8) {
                                                                        for (int t = s; t <= m; t++) {
                                                                            array2[8] = t;
                                                                            if (n > 9) {
                                                                                for (int u = t; u <= m; u++) {
                                                                                    array2[9] = u;
                                                                                    int total = getTotal(list, array2);
                                                                                    if (total > maxTotal)
                                                                                        maxTotal = total;
                                                                                }
                                                                            } else {
                                                                                int total = getTotal(list, array2);
                                                                                if (total > maxTotal) maxTotal = total;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        int total = getTotal(list, array2);
                                                                        if (total > maxTotal) maxTotal = total;
                                                                    }

                                                                }
                                                            } else {
                                                                int total = getTotal(list, array2);
                                                                if (total > maxTotal) maxTotal = total;
                                                            }


                                                        }
                                                    } else {
                                                        int total = getTotal(list, array2);
                                                        if (total > maxTotal) maxTotal = total;
                                                    }

                                                }
                                            } else {
                                                int total = getTotal(list, array2);
                                                if (total > maxTotal) maxTotal = total;
                                            }

                                        }
                                    } else {
                                        int total = getTotal(list, array2);
                                        if (total > maxTotal) maxTotal = total;
                                    }

                                }
                            } else {
                                int total = getTotal(list, array2);
                                if (total > maxTotal) maxTotal = total;
                            }

                        }
                    } else {
                        int total = getTotal(list, array2);
                        if (total > maxTotal) maxTotal = total;
                    }

                }
            }
            out.println(maxTotal);
        }

        int getTotal(ArrayList<int[]> list, int[] array2) {
            int total = 0;
            for (int[] array : list) {
                if (array2[array[1] - 1] - array2[array[0] - 1] == array[2]) {
                    total += array[3];
                }
            }
            return total;
        }

    }

    static class Scanner {
        private final InputStream in;
        private final byte[] buffer;
        private int ptr;
        private int buflen;

        public Scanner(InputStream in) {
            this.in = in;
            this.buffer = new byte[1024];
            this.ptr = 0;
            this.buflen = 0;
        }

        private boolean hasNextByte() {
            if (ptr < buflen) return true;
            else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) return false;
            }
            return true;
        }

        private byte readByte() {
            if (hasNextByte()) return buffer[ptr++];
            return -1;
        }

        private boolean isPrintableChar(byte c) {
            return '!' <= c && c <= '~';
        }

        private void skipUnprintable() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
                ptr++;
            }
        }

        public boolean hasNext() {
            skipUnprintable();
            return hasNextByte();
        }

        public int nextInt() {
            if (!hasNext()) throw new NoSuchElementException();
            int n = 0;
            boolean minus = false;
            byte b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) throw new NumberFormatException();
            while (true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }

    }
}

