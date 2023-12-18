import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> lines = readLines();
        int X = Integer.parseInt(lines.get(0).split(" ")[1]);
        List<Integer> Ls = Arrays.stream(lines.get(1).split(" "))
                .map((l) -> Integer.parseInt(l))
                .collect(Collectors.toList());

        int tSum = 0;
        int boundCount = 1;
        for (int l : Ls) {
            tSum += l;
            if (tSum > X) {
                break;
            }
            boundCount += 1;
        }
        System.out.println(String.format("%d", boundCount));
    }

    public static List<String> readLines() throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in, "utf-8");
        BufferedReader br = new BufferedReader(reader);

        List<String> retList = new ArrayList<>();
        String line = br.readLine();
        while (line != null && !line.isEmpty()) {
            retList.add(line);
            line = br.readLine();
        }

        reader.close();
        br.close();
        return retList;
    }
}