import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        execute(br);
    }

    private static void execute(BufferedReader br) throws Exception {
        while (true) {
            String str = br.readLine();
            if (str.equals("-")) { break; }
            int m = Integer.parseInt(br.readLine());
            for (int i = 0; i < m; i++) {
                int n = Integer.parseInt(br.readLine());
                str = shuffle(str, n);
            }
            System.out.println(str);
        }
    }

    private static String shuffle(String str, int n) {
        String fromInitialsToN = str.substring(0, n);
        String fromN1ToEnd = str.substring(n, str.length());
        return fromN1ToEnd + fromInitialsToN;
    }
}