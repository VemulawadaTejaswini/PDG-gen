import java.io.*;

public class Main {

    public static void main(String... args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            StringBuilder sb = new StringBuilder();
            char[] b = line.toCharArray();
            int p = 0;
            while (p < b.length) {
                switch (b[p]) {
                    case '@':
                        int n = (int) (b[p + 1] - '0');
                        for (int i = 0; i < n; i++)
                            sb.append(b[p + 2]);
                        p += 2;
                        break;
                    default:
                        sb.append(b[p]);
                }
                p++;
            }
            System.out.println(sb.toString());
        }
        br.close();
    }
}