import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();

    public static void main(String[]$) throws IOException {
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        double a = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        double b = Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
        double c = Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
        double x = Math.max(Math.max(a,b),c)/(2+Math.max(Math.max(a,b),c)/(Math.abs((x2-x1)*(y3-y1)-(x3-x1)*(y2-y1))/(a+b+c)));
        System.out.println(x);
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() throws IOException {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
            return tokenizer.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }
}