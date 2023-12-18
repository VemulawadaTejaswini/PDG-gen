import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        InputReader reader = new InputReader(System.in);
        int nums[] = reader.readNums();
        int N = nums[0];
        int M = nums[1];

        String[] imgN = reader.readLines().limit(N).toArray(String[]::new);
        String[] imgM = reader.readLines().limit(M).toArray(String[]::new);

        for(int i = 0; i < imgN.length; i++) {
            if(imgN[i].contains(imgM[0])) {
                boolean containing = true;
                for (int j = 1; j < imgM.length; j++) {
                    if (!imgN[i + j].contains(imgM[j])) {
                        containing = false;
                        break;
                    }
                }
                if(containing) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }

    static class InputReader {
        private BufferedReader reader;

        public InputReader(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public int[] readNums() {
            return Arrays.stream(readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        public Stream<String> readLines() {
            return reader.lines();
        }

        public String readLine() {
            try {
                return reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}