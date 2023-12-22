import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x == 0 && y == 0) break;
            String print = Arrays.asList(x, y).stream().sorted().map(num -> String.valueOf(num))
                    .collect(Collectors.joining(" "));
            System.out.println(print);
        }
        sc.close();
    }
}

