import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        doit(args, new Scanner(System.in), System.out);
    }

    static void doit(String[] args, Scanner scanner, PrintStream out) {
        List<Integer> heights = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int h = scanner.nextInt();
            heights.add(h);
        }
        Collections.sort(heights, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i = 0; i < 3; i++) {
            out.println(heights.get(i));
        }
    }
}