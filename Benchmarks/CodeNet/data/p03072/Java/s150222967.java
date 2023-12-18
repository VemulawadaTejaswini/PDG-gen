import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        List<Integer> tmp = Arrays.stream(sc.nextLine().split(" ")).map(e -> Integer.valueOf(e)).collect(Collectors.toList());
        int available = 0;
        int preMax = -1;

        for (int tar : tmp) {
            if (preMax <= tar) {
                preMax = tar;
                available++;
            }
        }

        System.out.println(available);
    }
}
