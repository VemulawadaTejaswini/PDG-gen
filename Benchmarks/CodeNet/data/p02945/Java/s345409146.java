import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer a = Integer.valueOf(args[0]);
        Integer b = Integer.valueOf(args[1]);

        List<Integer> results = new ArrayList<Integer>();
        results.add(a + b);
        results.add(a - b);
        results.add(a * b);
        results.sort(Comparator.reverseOrder());

        System.out.println(results.get(0));
    }
}