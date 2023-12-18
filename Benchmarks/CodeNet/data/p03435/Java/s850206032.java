import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> c1 = new ArrayList<>();
        List<Integer> c2 = new ArrayList<>();
        List<Integer> c3 = new ArrayList<>();
        IntStream.range(0, 3).forEach(i -> c1.add(sc.nextInt()));
        IntStream.range(0, 3).forEach(i -> c2.add(sc.nextInt()));
        IntStream.range(0, 3).forEach(i -> c3.add(sc.nextInt()));

        int a1 = 0;
        int b1 = c1.get(0) - a1;
        int a2 = c2.get(0) - b1;
        int b2 = c2.get(1) - a2;
        int a3 = c3.get(0) - b1;
        int b3 = c3.get(2) - a3;

        if (c1.get(0) == a1 + b1 && c1.get(1) == a1 + b2 && c1.get(2) == a1 + b3
                && c2.get(0) == a2 + b1 && c2.get(1) == a2 + b2 && c2.get(2) == a2 + b3
                && c3.get(0) == a3 + b1 && c3.get(1) == a3 + b2 && c3.get(2) == a3 + b3) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }

}
