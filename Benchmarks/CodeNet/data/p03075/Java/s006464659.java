import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
	    String[] lines = Io.read();

	    int[] parsed = parse(lines);

	    int a = parsed[0];
	    int e = parsed[4];
	    int k = parsed[5];

	    if (e - a >= k) {
	        Io.write(":(");
        } else {
	        Io.write("Yay!");
        }
    }

    private static int[] parse(String[] lines) {
        int[] parsed = new int[lines.length];

        for (int i = 0; i < lines.length; i++) {
            parsed[i] = Integer.parseInt((lines[i]));
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
    public static String[] read() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> inputs = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            if (line.equals(""))
                break;

            inputs.add(line);
        }
        br.close();
        return inputs.toArray(new String[0]);
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
