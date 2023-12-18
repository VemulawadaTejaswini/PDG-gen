import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String line;
        String[] sline = new String[10];
        String[] array = new String[N];

        line = sc.nextLine();

        for (int i = 0; i < N; i++) {
            line = sc.nextLine();
            sline = line.split("");
            Arrays.sort(sline);
            array[i] = String.join("", sline);
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = N-i+1; j < N; j++) {
                 if (array[i].equals(array[j])) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}