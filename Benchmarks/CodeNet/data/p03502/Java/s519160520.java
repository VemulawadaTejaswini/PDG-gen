import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    BufferedReader rd;

    Main() throws IOException {
        rd = new BufferedReader(new InputStreamReader(System.in));
        compute();
    }

    private void compute() throws IOException {
        String s = rd.readLine().trim();
        int x = pint(s);
        boolean res = x%sumDigits(s)==0;
        out(res?"Yes":"No");
    }

    private int sumDigits(String s) {
        int sum = 0;
        for(int i=0;i<s.length();i++) {
            sum += s.charAt(i)-'0';
        }
        return sum;
    }

    private int pint() throws IOException {
        return pint(rd.readLine());
    }

    private int pint(String s) {
        return Integer.parseInt(s);
    }

    private static void out(Object x) {
        System.out.println(x);
    }

    public static void main(String[] args) throws IOException {
        new Main();
    }
}
