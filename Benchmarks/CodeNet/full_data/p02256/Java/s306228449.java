import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int[] numArray = parseInt(getSplitLine(line));

        int x;
        int y;
        if (numArray[0] > numArray[1]) {
            x = numArray[0];
            y = numArray[1];
        } else {
            x = numArray[1];
            y = numArray[0];
        }

//計算
        int tmp;
        while ((tmp = x % y) != 0) {
            x = y;
            y = tmp;
        }

        System.out.println(y);
    }

    private static String[] getSplitLine(String line) {
        return line.split("\\s");
    }

    private static int[] parseInt(String[] line) {
        int[] numArray = new int[line.length];
        for (int i = 0; i < line.length; i++) {
            numArray[i] = Integer.parseInt(line[i]);
        }
        return numArray;
    }
}
