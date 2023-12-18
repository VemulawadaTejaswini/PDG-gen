import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] s = new int[n][2];
        for (int i = 0; i < n; i++) {
            s[i][0] = i;
            s[i][1] = sc.nextInt();
        }
        Arrays.sort(s, Comparator.comparingInt(s1 -> s1[1]));
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < n; i++) {
            sj.add(String.valueOf(s[i][0] + 1));
        }
        System.out.println(sj.toString());
    }

}

