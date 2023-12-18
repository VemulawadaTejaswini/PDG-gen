import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {
        try (Scanner sc = new Scanner(System.in, Charset.defaultCharset().name())) {
            int n = Integer.parseInt(sc.next());

            List<Range> rangeList = new ArrayList<Range>();
            Range range = null;
            for (int i = 0; i < n; i++) {
                int a = Integer.parseInt(sc.next());
                if (i == 0 || a <= range.upperBound) {
                    // 最初
                    range = new Range();
                    range.lowerBound = a;
                    rangeList.add(range);
                }
                range.upperBound = a;
            }
            int count = 0;
            for (int i = 0; i < rangeList.size(); i++) {
                Range rangeI = rangeList.get(i);
                if (rangeI.used) {
                    continue;
                }
                rangeI.used = true;
                count++;
                int upperBound = rangeI.upperBound;
                for (int j = i + 1; j < rangeList.size(); j++) {
                    Range rangeJ = rangeList.get(j);
                    if (rangeJ.used) {
                        continue;
                    }
                    if (upperBound < rangeJ.lowerBound) {
                        rangeJ.used = true;
                        upperBound = rangeJ.upperBound;
                    }
                }
            }
            System.out.println(count);
        }
    }

}

class Range {
    int lowerBound = 0;
    int upperBound = 0;
    boolean used = false;
}