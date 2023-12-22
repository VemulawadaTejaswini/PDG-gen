import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> l = new ArrayList<>();

        while(sc.hasNextInt()) {
            l.add(sc.nextInt());
        }

        Collections.sort(l, Collections.reverseOrder());
        l.stream().limit(3).forEach(System.out::println);
    }
}