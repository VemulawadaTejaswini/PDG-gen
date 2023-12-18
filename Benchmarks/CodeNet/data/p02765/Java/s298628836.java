import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] a) {
        Scanner scan = new Scanner(System.in);
        int plc = Integer.valueOf(scan.nextLine());
        System.out.println(
            Arrays.stream(scan.nextLine().split("\\s"))
                    .mapToInt(
                    c -> {
                        int t = Integer.valueOf(c);
                        int p = t - plc;
                        return p * p;
                    }).sum()
        );
    }
}