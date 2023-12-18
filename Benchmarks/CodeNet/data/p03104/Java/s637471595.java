import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        long[] inputs = Io.read();
        long result = f(inputs[0], inputs[1]);

        Io.write(result);
    }

    private static long f(long A, long B) {
        if (A == B) {
            return A;
        }

        long tmp = ((B - A) & 1) == 1 ? 0 : 1;

        return (A ^ B) - tmp;
    }
}

class Io {

    public static long[] read() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        br.close();

        long[] parsed = new long[2];
        String[] split = line.split(" ");

        parsed[0] = Long.parseLong(split[0]);
        parsed[1] = Long.parseLong(split[1]);

        return parsed;
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
