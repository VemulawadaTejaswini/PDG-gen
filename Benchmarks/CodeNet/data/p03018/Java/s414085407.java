
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final char[] line = in.next().toCharArray();
        int from = 0;
        int result = 0;
        int index;
        while ((index = indexOfAbc(line, from)) != -1) {
            result++;
            int count = 0;
            line[index + 2] = 'A';
            for (int i = index - 1; i >= from; --i) {
                if (line[i] == 'A') {
                    count++;
                } else {
                    break;
                }
            }
            for (int i = 0; i < count; ++i) {
                line[index + 2 - count] = 'A';
            }
            line[index + 2 - count - 1] = 'C';
            line[index + 2 - count - 2] = 'B';
            result += count;
            from = index + 2;
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