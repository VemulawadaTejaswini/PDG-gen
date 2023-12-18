import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
 
public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
        int k = in.nextInt();
        in.nextLine();

        int[] res = new int[2];  //res[0] is ac, res[1] is wa
        int[] arr = new int[n + 1];
        boolean[] ac = new boolean[n + 1];
        for (int i = 0; i < k; i++) {
            String s = in.nextLine();
            String[] str = s.split(" ");
            int index = Integer.parseInt(str[0]);
            boolean correct = str[1].equals("AC");
            if (correct && !ac[index]) {
                ac[index] = true;
                res[0]++;
                res[1] += arr[index];
                continue;
            }

            if (!correct && !ac[index]) {
                arr[index]++;
            }
        }

        System.out.println(res[0] + " " + res[1]);
    }

}
