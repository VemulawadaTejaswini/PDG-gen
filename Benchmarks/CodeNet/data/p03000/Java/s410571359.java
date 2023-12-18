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
        ListIterator<Integer> iterLs = Ls.listIterator();

        int tSum = 0;
        while (iterLs.hasNext()) {
            int index = iterLs.nextIndex();
            tSum += iterLs.next();
            if (tSum > X) {
                System.out.println(String.format("%d", index + 1));
                return;
            }
        }
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