import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
	    String str = Io.read();

	    Solver solver = new Solver(str);

	    int answer = solver.solve();

	    Io.write(answer);
    }
}

class Solver {

    private String line;

    private String answer = "";

    public Solver(String line) {
        this.line = line;
    }

    public int solve() {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            if (isACGT(line.charAt(i))) {
                builder.append(line.charAt(i));
            } else {
                String tmp = builder.toString();

                if (answer.length() < tmp.length()) {
                    answer = tmp;
                }
                builder.setLength(0);
            }
        }

        return answer.length();
    }

    private boolean isACGT(char c) {
        switch(c) {
            case 'A':
                return true;

            case 'C':
                return true;

            case 'G':
                return true;

            case 'T':
                return true;

            default:
                return false;
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
     * @param answer
     */
    public static void write(int answer)
    {
        System.out.println(answer);
    }
}