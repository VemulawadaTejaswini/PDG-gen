import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        String line = Io.read();

        int[] ab = parse(line);

        if (can_get(ab[0], ab[1])) {
            Io.write("Yay!");
        } else {
            Io.write(":(");
        }
    }

    private static int[] parse(String line) {
        String[] strs = line.split(" ");

        int[] parsed = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            parsed[i] = Integer.parseInt((strs[i]));
        }

        return parsed;
    }

    private static boolean can_get(int a, int b) {
        if (a <= 8 && b <= 8) return true;

        return false;
    }
}

class Io {

    /**
     * 標準入力から1行ずつ受け取る
     * @return
     * @throws IOException
     */
    public static String read() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        br.close();
        return line;
    }

    /**
     * 標準出力
     * @param answer
     */
    public static void write(String answer)
    {
        System.out.println(answer);
    }
}