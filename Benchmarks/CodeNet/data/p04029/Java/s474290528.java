import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws Exception {
        Io.write(IntStream.range(1, Io.read() + 1).sum());
    }
}

class Io {

    /**
     * 標準入力から1行ずつ受け取る
     * @return
     * @throws IOException
     */
    public static int read() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        br.close();
        return Integer.parseInt(line);
    }

    /**
     * 標準出力
     * @param ans
     */
    public static void write(int ans)
    {
        System.out.println(ans);
    }
}
