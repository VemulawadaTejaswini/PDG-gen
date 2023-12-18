import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        String line = Io.read();
        String answer = null;

        switch(line) {
            case "A":
                answer = "T";
                break;

            case "T":
                answer = "A";
                break;

            case "C":
                answer = "G";
                break;

            case "G":
                answer = "C";
                break;

            default:
                break;
        }

        Io.write(answer);
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