import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Integer;
import java.lang.String;
import java.lang.System;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] a) throws IOException {
        BufferedReader r = new BufferedReader(InputStreamReader(System.in));

        try {
            int count = Integer.parseInt(r.readLine());
            String[] ans = new String[count];

            for(int i = 0; i < count; i++) {
                String s = r.readLine();
                StringTokenizer st = new StringTokenizer(s);
                int num[] = new int[4];
                for(int j = 0; j < 3;j++) {
                    num[j] = Integer.parseInt(st.nextToken());
                    if(num[0] < num[j]) {
                        int tmp = num[0];
                        num[0] = num[j];
                        num[j] = tmp;
                    }
                }
                if ( num[0] * num[0] == num[1] * num[1] + num[2] * num[2]) {
                    ans[i] = "YES";
                } else {
                    ans[i] = "NO";
                }
            }

            for(int i = 0; i < count; i++) {
                System.out.println(ans[i]);
            }
        } catch {
            System.exit(0);
        }
    }
}