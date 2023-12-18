import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(reader.readLine());
            String S = reader.readLine();

            for (int n = N / 2; n > 0; n--) {
                for (int i = 0; i <= N - n - n; i++) {
                    String s1 = S.substring(i, i + n);
                    for (int j = i + n; j <= N - n; j++) {
                        String s2 = S.substring(j, j + n);
                        //System.out.println(s1 + " " + s2);
                        if (s1.equals(s2)) {
                            System.out.println(n);
                            System.exit(0);
                        }
                    }
                }
            }

            System.out.println(0);
        }
    }

}
