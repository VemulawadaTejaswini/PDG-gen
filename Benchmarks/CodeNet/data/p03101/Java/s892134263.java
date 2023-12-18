import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        String[] inputs = Io.read();
        Integer[][] parsed = parse(inputs);

        int[][] blocks = new int[parsed[0][0]][parsed[0][1]];
        for (int i = 0; i < blocks.length; i++) {
            Arrays.fill(blocks[i], 1);
        }

        for (int y = 0; y < blocks.length; y++) {
            if (y < parsed[1][0]) {
                Arrays.fill(blocks[y], 0);
            }
            Arrays.fill(blocks[y], 0, parsed[1][1], 0);
        }

        int allBlocks = 0;
        for (int y = 0; y < blocks.length; y++) {
            for (int x = 0; x < blocks[y].length; x++) {
                allBlocks += blocks[y][x];
            }
        }

        Io.write(allBlocks);
    }

    private static Integer[][] parse(String[] lines) {
        Integer[][] result = new Integer[lines.length][2];
        for (int i = 0; i < lines.length; i++) {
            String[] split = lines[i].split(" ");
            result[i][0] = Integer.parseInt(split[0]);
            result[i][1] = Integer.parseInt(split[1]);
        }
        return result;
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
    public static void write(int answer)
    {
        System.out.println(answer);
    }
}
