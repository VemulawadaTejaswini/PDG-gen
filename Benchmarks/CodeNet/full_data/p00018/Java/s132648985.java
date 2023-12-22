import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        IntStream intLine = Arrays.stream(line)
                .mapToInt(Integer::parseInt)
                .sorted();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i: intLine.toArray()) {
            a.add(i);
        }
        a.sort(Comparator.reverseOrder());
        for (int j: a) {
            System.out.print(j);
            System.out.print(" ");
        }
    }
}