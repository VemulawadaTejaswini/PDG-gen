import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author /\
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DGatheringChildren solver = new DGatheringChildren();
        solver.solve(1, in, out);
        out.close();
    }

    static class DGatheringChildren {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String str = in.nextLine();
            char c = 'R';
            List<Integer> cnt = new ArrayList<>();
            int temp = 0;
            for (char ch : str.toCharArray()) {
                if (ch == c) {
                    temp++;
                } else {
                    cnt.add(temp);
                    temp = 1;
                    c = c == 'R' ? 'L' : 'R';
                }
            }
            cnt.add(temp);
            int[] res = new int[str.length()];
            int r = 0;
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == 'R' && str.charAt(i + 1) == 'L') {
                    int tot = cnt.get(2 * r) + cnt.get(2 * r + 1);
                    if ((tot & 1) == 0) {
                        res[i] = tot / 2;
                        res[i + 1] = tot / 2;
                    } else {
                        if ((cnt.get(2 * r) & 1) == 0) {
                            res[i] = tot / 2;
                            res[i + 1] = tot / 2 + 1;
                        } else {
                            res[i] = tot / 2 + 1;
                            res[i + 1] = tot / 2;
                        }
                    }
                    r++;
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i : res) {
                sb.append(i).append(" ");
            }
            out.println(sb);
        }

    }

    static class Scanner {
        private BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
}

