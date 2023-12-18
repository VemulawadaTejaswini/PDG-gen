
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final char[] line = in.next().toCharArray();
        int from = 0;
        long result = 0;
        int index;
        int aCount = -1;
        while ((index = indexOfAbc(line, from)) != -1) {
            result++;
            int count = 0;
            line[index + 2] = 'A';
            if (aCount == -1 || index != from) {
                for (int i = index - 1; i >= from; --i) {
                    if (line[i] == 'A') {
                        count++;
                    } else {
                        break;
                    }
                }
            } else {
                count = aCount;
            }
            line[index + 2 - 1] = 'A';
            line[index + 2 - count - 1] = 'C';
            line[index + 2 - count - 2] = 'B';
            result += count;
            from = index + 2 - count;
            aCount = count;
        }
        System.out.println(result);
    }

    static int indexOfAbc(char[] input, int from) {
        if (from + 2 >= input.length) {
            return -1;
        }

        for (int i = from; i + 2 < input.length; i++) {
            if (input[i] == 'A' && input[i + 1] == 'B' && input[i + 2] == 'C') {
                return i;
            }
        }
        return -1;
    }

}
