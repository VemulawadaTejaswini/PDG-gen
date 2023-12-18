import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int baseNum = 100;

    public static void main(String[] args) throws Exception {
	    String line = Io.read();
	    int[] parsed = parse(line);

        int answer = 1;

        for (int i = 0; i < parsed[0]; i++) {
            answer *= baseNum;
        }
        int multi = 0;
        if (parsed[1] == 100) {
            multi = 101;
        } else {
            multi = parsed[1];
        }

        answer *= multi;

        Io.write(answer);
    }

    private static int[] parse(String line) {
        String[] strs = line.split(" ");
        int[] parsed = new int[strs.length];

        for (int i = 0; i < strs.length; i++) {
            parsed[i] = Integer.parseInt(strs[i]);
        }
        return parsed;
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
        return line;
    }

    /**
     * 標準出力
     * @param answer
     */
    public static void write(int answer)
    {
        System.out.println(answer);
    }
}