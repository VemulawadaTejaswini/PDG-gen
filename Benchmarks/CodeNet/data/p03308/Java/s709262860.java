import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
	    String[] inputs = Io.read();

        int[] a = parse(inputs[1]);

        int min = Arrays.stream(a).min().getAsInt();
        int max = Arrays.stream(a).max().getAsInt();

        Io.write(max - min);
    }

    private static int[] parse(String line) {
        String[] split = line.split(" ");
        int[] parsed = new int[split.length];

        for (int i = 0; i < split.length; i++) {
            parsed[i] = Integer.parseInt(split[i]);
        }
        return parsed;
    }
}

class Io {

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

    public static void write(int answer)
    {
        System.out.println(answer);
    }
}