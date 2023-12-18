import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
	    String input = Io.read();

	    Searcher searcher = new Searcher();
	    int[] result = searcher.search(input);

        String ans = String.format("%d %d", result[0], result[1]);

        Io.write(ans);
    }
}

class Searcher {
    public int[] search(String input) {
        int[] result = {-1, -1};

        char startStr;
        char nextStr;
        char endStr = 'Z';

        if (input.length() > 2) {
            for (int i = 0; i <= input.length() - 3; i++) {
                startStr = input.charAt(i);
                nextStr = input.charAt(i + 1);
                endStr = input.charAt(i + 2);

                int checkRes = checkSame(startStr, nextStr, endStr);

                if (checkRes != 0) {
                    result[0] = i + 1;
                    result[1] = i + checkRes + 1;
                    break;
                }
            }
        } else {
            startStr = input.charAt(0);
            nextStr = input.charAt(1);
            int checkRes = checkSame(startStr, nextStr, endStr);

            if (checkRes != 0) {
                result[0] = 1;
                result[1] = 2;
            }
        }


        return result;
    }

    private int checkSame(char a, char b, char c) {
        if (a == b) {
            return 1;
        } else if (a == c) {
            return 2;
        } else {
            return 0;
        }
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
     * @param line
     */
    public static void write(String line)
    {
        System.out.println(line);
    }
}
