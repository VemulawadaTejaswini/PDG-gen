import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static Input in = new Input(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        List<String> S = new ArrayList<>();
        Map<String, List<Character>> last = new HashMap<>();
        for (int n = in.nextInt(); n > 0; n--) {
            String s = in.next();
            S.add(s);
            last.putIfAbsent(s.substring(1), new ArrayList<>());
            last.get(s.substring(1)).add(s.charAt(0));
        }
        long ans = 0;
        for (String s : S) {
            boolean[] b = new boolean['z' + 1];
            b[s.charAt(0)] = true;
            for (int i = 1; i < s.length(); i++) {
                b[s.charAt(i)] = true;
                String sub = s.substring(i + 1);
                if (last.containsKey(sub)) {
                    for (Character c : last.get(sub)) {
                        if (b[c]) ans++;
                    }
                }
            }
        }
        out.println(ans);

        out.flush();
    }

    static class Input {
        private BufferedReader br;
        private String[] buff;
        private int index = 0;

        Input(InputStream is) {
            br = new BufferedReader(new InputStreamReader(is));
        }
        String nextLine() {
            try {
                return br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        String next() {
            while (buff == null || index >= buff.length) {
                buff = nextLine().split(" ");
                index = 0;
            }
            return buff[index++];
        }
        byte nextByte() {
            return Byte.parseByte(next());
        }
        short nextShort() {
            return Short.parseShort(next());
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        float nextFloat() {
            return Float.parseFloat(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        BigInteger nextBigInteger() {
            return new BigInteger(next());
        }
        BigDecimal nextBigDecimal() {
            return new BigDecimal(next());
        }
    }
}

