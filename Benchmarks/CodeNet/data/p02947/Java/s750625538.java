import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = Integer.parseInt(stdin.nextLine());
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = stdin.nextLine();
        }

        long ans = Arrays.stream(s)
                          .map(str -> str.chars().sorted().toArray())
                          .collect(Collectors.groupingBy(Arrays::hashCode, Collectors.counting()))
                          .values()
                          .stream()
                          .collect(Collectors.summingLong(v -> v * (v - 1) / 2));
        System.out.println(ans);
    }

}