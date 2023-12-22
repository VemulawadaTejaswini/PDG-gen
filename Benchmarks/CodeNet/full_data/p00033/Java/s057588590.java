import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] origin = new int[10];
        int[] s = new int[11];
        int[] t = new int[11];

        int posS = 0;
        int posT = 0;

        s[0] = -1;
        t[0] = -1;

        for (int i = 1; i < 11; i++) {
            s[i] = 0;
            t[i] = 0;
        }

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            boolean result = true;
            for (int j = 0; j < 10; j++) {
                origin[j] = Integer.parseInt(line[j]);
            }

            for (int j = 0; j < 10; j++) {
                if (s[posS] < origin[j]) {
                    posS++;
                    s[posS] = origin[j];
                } else if (t[posT] < origin[j]) {
                    posT++;
                    t[posT] = origin[j];
                } else {
                    result = false;
                    break;
                }
            }

            if (result) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
        
    }
}
