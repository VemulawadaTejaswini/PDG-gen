import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] input = readInput();
        int a = input[0];
        int b = input[1];
        System.out.printf("%d %d\n", area(a, b), perimeter(a, b));
    }

    public static int area(int a, int b) {
        return a * b;
    }

    public static int perimeter(int a, int b) {
        return (a + b) * 2;
    }
    

    public static Integer[] readInput() {
        List<Integer> l = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            l.add(sc.nextInt());
        }
        return l.toArray(new Integer[l.size()]);
    }
}