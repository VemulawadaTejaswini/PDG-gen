import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    static String INPUT = "";

    public static void main(String[] args) {
        InputStream is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());

        Scanner scanner = new Scanner(is);

        final int n = scanner.nextInt();

        List<Integer> mochi = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            mochi.add(scanner.nextInt());
        }
        System.out.println(solve(mochi));
    }

    static int solve(List<Integer> mochiList) {
        return new HashSet<>(mochiList).size();
    }

}
