import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Problem solver = new Problem();
        solver.solve(0, in, out);
        out.close();
    }

    static class Problem {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int H = in.nextInt(), N = in.nextInt();
            List<Attack> arr = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                int strength = in.nextInt(), magicPoints = in.nextInt();
                Attack attack = new Attack(strength, magicPoints);
                arr.add(attack);
            }

            Collections.sort(arr, new Comparator<Attack>() {
                @Override
                public int compare(Attack o1, Attack o2) {
                    double value1 = (double) (o1.strength / o1.magicPoints);
                    double value2 = (double) (o2.strength / o2.magicPoints);
                    if (value1 > value2)
                        return -1;
                    else if (value1 == value2)
                        return 0;
                    else
                        return 1;
                }
            });

            int i = 0, res = 0;
            boolean flag = false;
            while (i < arr.size() && H > 0) {
                int curStrength = arr.get(i).strength;
                int curPoints = arr.get(i).magicPoints;

                if (H >= curStrength) {
                    res = res + (curPoints * (H / curStrength));
                    if(H % curStrength == 0) {
                        flag = true;
                        break;
                    }
                    H = H % curStrength;
                }
                i++;
            }

            if(flag) {
                out.println(res);
            } else {
                int min = Integer.MAX_VALUE;
                for (Attack atk : arr) {
                    if (atk.strength >= H)
                        min = Math.min(min, atk.magicPoints);
                }
                out.println(res + min);
            }
        }

    }

    static class Attack {
        int strength;
        int magicPoints;

        public Attack(int strength, int magicPoints) {
            this.strength = strength;
            this.magicPoints = magicPoints;
        }
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

