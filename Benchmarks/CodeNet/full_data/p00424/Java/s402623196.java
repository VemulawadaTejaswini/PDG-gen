import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String line;
            while (true) {
                line = br.readLine();
                int sizeOfConvertTable = Integer.parseInt(line);
                if (sizeOfConvertTable == 0) {
                    System.exit(0);
                }

                Map<String, String> convertTable = new HashMap<>();
                for (int i = 0; i < sizeOfConvertTable; i++) {
                    line = br.readLine();
                    String[] lineStrs = line.split(" ");
                    convertTable.put(lineStrs[0], lineStrs[1]);
                }

                line = br.readLine();
                int numOfTarget = Integer.parseInt(line);
                for (int i = 0; i < numOfTarget; i++) {
                    line = br.readLine();
                    System.out.print(convertTable.getOrDefault(line, line));
                }
                System.out.println("");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            System.exit(-1);
        }
    }
}