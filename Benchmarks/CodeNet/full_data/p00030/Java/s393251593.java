import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Stack;

class Main {

    public static void main(String[] args) throws IOException {
        doit(args, System.in, System.out);
    }

    static void doit(String[] args, InputStream in, PrintStream out)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        while (true) {
            String[] values = reader.readLine().split(" ");
            int n = Integer.parseInt(values[0]);
            int s = Integer.parseInt(values[1]);
            if (n == 0 && s == 0) {
                break;
            }
            int count = countSum(s, n, new Stack<Integer>(), 0);
            out.println(count);
        }
    }

    static int countSum(int s, int n, Stack<Integer> numbers, int numbersSum) {
        if (n == 0) {
            return numbersSum == s ? 1 : 0;
        }

        int count = 0;
        for (int i = numbers.isEmpty() ? 0 : numbers.peek() + 1; i < 10; i++) {
            int nsi = numbersSum + i;
            if (nsi > s) {
                break;
            }
            numbers.push(i);
            count += countSum(s, n - 1, numbers, nsi);
            numbers.pop();
        }
        return count;
    }
}