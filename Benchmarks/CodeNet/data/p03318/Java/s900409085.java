import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
	    long k = Io.read();

	    int cnt = 0;

	    // 1桁
	    for (int i = 1; cnt < k && i < 10; i++) {
            Io.write(i);
            cnt++;
        }

	    for (int i = 1; cnt < k; i++) {
            long ans = 1;
            for (int j = 0; j < i; j++) {
                ans *= 10;
            }
            for (int j = 1; j < 10 && cnt < k; j++) {
                if (j * ans == 10) continue;
                Io.write(j * ans - 1);
                cnt++;
            }
        }
    }
}

class Io {

    /**
     * 標準入力から1行ずつ受け取る
     * @return
     * @throws IOException
     */
    public static long read() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        br.close();
        return Long.parseLong(line);
    }

    /**
     * 標準出力
     * @param answer
     */
    public static void write(long answer)
    {
        System.out.println(answer);
    }
}