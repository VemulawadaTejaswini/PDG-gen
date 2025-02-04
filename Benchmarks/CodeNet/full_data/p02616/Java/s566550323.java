
import java.util.*;
import java.io.*;
import java.math.*;

class Main {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        Reader s = new Reader();
        int n = s.i() , k = s.i();
        long [] arr = s.arrLong(n);
        ArrayList<Long> pos = new ArrayList<>();
        ArrayList<Long> neg = new ArrayList<>();
        for (int i=0;i<n;i++) {
            if (arr[i] > 0) pos.add(arr[i]);
            else neg.add(arr[i]);
        }
        long mod = (long)1e9+7;
        Collections.sort(pos);
        Collections.sort(neg);
        if (pos.size() == 0) {
            long ans = 1;
            if ((k&1) == 0) {
                for (int i=0;i<k;i++) ans = (ans*(neg.get(i)+mod))%mod;
            } else {
                for (int i=0;i<k;i++) ans = (ans*(neg.get(neg.size()-1-i)+mod))%mod;
            }
            while (ans < 0) {
                ans += mod;
            }
            ans = ans%mod;
            out.println(ans);
            out.flush();
            return;
        }
        if (neg.size() == 0) {
            long ans = 1;
            for (int i=0;i<k;i++) ans = (ans*pos.get(pos.size()-1-i))%mod;
            while (ans < 0) {
                ans += mod;
            }
            ans = ans%mod;
            out.println(ans);
            out.flush();
            return;
        }
        int i = pos.size()-1;
        long ans = 1;
        int j = 0;
        while (k>0) {
            if (i < 0) {
                if (j == neg.size()) {
                    ans = 0;
                    break;
                } else {
                    ans = (ans*(neg.get(j)+mod))%mod;
                    j++;
                    k--;
                }
            } else if (j == neg.size()) {
                ans = (ans*pos.get(i))%mod;
                i--;
                k--;
            } else {
                if (k == 1) {
                    ans = (ans*pos.get(i))%mod;
                    i--;
                    k--;
                } else {
                    if (j == neg.size()-1) {
                        ans = (ans*pos.get(i))%mod;
                        i--;
                        k--;
                    } else if (i == 0) {
                        if (pos.get(i) >= neg.get(j)*neg.get(j+1)) {
                            ans = (ans*pos.get(i))%mod;
                            i--;
                            k--;
                        } else {
                            ans = (ans*(neg.get(j)*neg.get(j+1))%mod)%mod;
                            j += 2;
                            k -= 2;
                        }
                    } else {
                        if (pos.get(i)*pos.get(i-1) >= neg.get(j)*neg.get(j+1)) {
                            ans = (ans*pos.get(i))%mod;
                            i--;
                            k--;
                        } else {
                            ans = (ans*(neg.get(j)*neg.get(j+1))%mod)%mod;
                            j += 2;
                            k -= 2;
                        }
                    }
                }
            }
        }
        while (ans < 0) {
            ans += mod;
        }
        ans = ans%mod;
        out.println(ans);
        out.flush();
    }

    private static int power(int a, int n) {
        int result = 1;
        while (n > 0) {
            if (n % 2 == 0) {
                a = (a * a);
                n /= 2;
            } else {
                result = (result * a);
                n--;
            }
        }
        return result;
    }

    private static int power(int a, int n, int p) {
        int result = 1;
        while (n > 0) {
            if (n % 2 == 0) {
                a = (a * a) % p;
                n /= 2;
            } else {
                result = (result * a) % p;
                n--;
            }
        }
        return result;
    }

    static class Reader {
        private InputStream mIs;
        private byte[] buf = new byte[1024];
        private int curChar, numChars;

        public Reader() {
            this(System.in);
        }

        public Reader(InputStream is) {
            mIs = is;
        }

        public int read() {
            if (numChars == -1) throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = mIs.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) return -1;
            }
            return buf[curChar++];
        }

        public String nextLine() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndOfLine(c));
            return res.toString();
        }

        public String s() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public long l() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public int i() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public double d() throws IOException {
            return Double.parseDouble(s());
        }

        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public boolean isEndOfLine(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

        public int[] arr(int n) {
            int[] ret = new int[n];
            for (int i = 0; i < n; i++) {
                ret[i] = i();
            }
            return ret;
        }

        public long[] arrLong(int n) {
            long[] ret = new long[n];
            for (int i = 0; i < n; i++) {
                ret[i] = l();
            }
            return ret;
        }
    }
    //    static class pairLong implements Comparator<pairLong> {
//        long first, second;
//
//        pairLong() {
//        }
//
//        pairLong(long first, long second) {
//            this.first = first;
//            this.second = second;
//        }
//
//        @Override
//        public int compare(pairLong p1, pairLong p2) {
//            if (p1.first == p2.first) {
//                if(p1.second > p2.second) return 1;
//                else return -1;
//            }
//            if(p1.first > p2.first) return 1;
//            else return -1;
//        }
//    }
//    static class pair implements Comparator<pair> {
//        int first, second;
//
//        pair() {
//        }
//
//        pair(int first, int second) {
//            this.first = first;
//            this.second = second;
//        }
//
//        @Override
//        public int compare(pair p1, pair p2) {
//            if (p1.first == p2.first) return p1.second - p2.second;
//            return p1.first - p2.first;
//        }
//    }
}
