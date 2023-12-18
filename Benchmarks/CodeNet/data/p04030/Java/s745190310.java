import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) throws Exception {
	    String input = Io.read();

        ArrayDeque<Character> q = new ArrayDeque<Character>();
	    for (char c : input.toCharArray()){
            if (c == 'B') {
                if (!q.isEmpty()){
                    q.removeLast();
                }
            } else {
                q.add(c);
            }
        }
        StringBuilder builder = new StringBuilder();
        for (char c : q.toArray(new Character[0])) {
	        builder.append(c);
        }

        Io.write(builder.toString());
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