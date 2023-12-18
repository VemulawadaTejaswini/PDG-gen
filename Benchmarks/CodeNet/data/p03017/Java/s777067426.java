
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final char[] line = in.next().replaceAll("BC", "D").toCharArray();
        long result = 0;
        int aCount = 0;
        for (int i = 0; i < line.length; i++) {
            if (line[i] == 'B' || line[i] == 'C') {
                aCount = 0;
            }
            if (line[i] == 'D') {
                result += aCount;
            }
            if (line[i] == 'A') {
                aCount++;
            }
        }
        System.out.println(result);
    }

}
