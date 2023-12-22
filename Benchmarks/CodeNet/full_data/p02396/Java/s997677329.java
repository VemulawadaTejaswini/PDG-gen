import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Scanner;

class PrintTestCases {
}

public class Main {
    public static void main(String... args) {
        ArrayList<Integer> data = new ArrayList<Integer>();

        // scan
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            data.add(scan.nextInt());
        }

        // print
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) == 0) break; // 0???????????????
            out.printf("Case %d: %d\n", i+1, data.get(i) );
        }
    }
}