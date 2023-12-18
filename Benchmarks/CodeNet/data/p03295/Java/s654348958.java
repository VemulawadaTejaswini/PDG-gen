
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        final int m = scanner.nextInt();

        final List<Integer> indexList = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            final int a = scanner.nextInt();
            final int b = scanner.nextInt();

            if (indexList.isEmpty()) {
                indexList.add(a);
                indexList.add(b);
                continue;
            }

            if (a >= indexList.get(indexList.size() - 1)) {
                indexList.add(a);
                indexList.add(b);
                continue;
            }

            if (b <= indexList.get(0)) {
                indexList.add(0, a);
                indexList.add(1, b);
                continue;
            }

            final int aIndex = extendedBinarySearch(indexList, a);
            if (aIndex % 2 == 1) {
                if (b > indexList.get(aIndex)) {
                    indexList.set(aIndex - 1, a);
                } else {
                    indexList.set(aIndex - 1, a);
                    indexList.set(aIndex, b);
                }
                continue;
            }

            final int bIndex = extendedBinarySearch(indexList, b);
            if (bIndex % 2 == 1) {
                if (a < indexList.get(bIndex - 1)) {
                    indexList.set(bIndex, b);
                } else {
                    indexList.set(bIndex - 1, a);
                    indexList.set(bIndex, b);
                }
                continue;
            }

            indexList.add(aIndex, a);
            indexList.add(bIndex + 1, b);
        }
        
        System.out.println(indexList.size() / 2);
    }

    private static int extendedBinarySearch(final List<Integer> indexes, final int value) {
        int rawIndex = Collections.binarySearch(indexes, value);

        if (rawIndex >= 0) {
            while (indexes.get(++rawIndex) == value) ;
            return rawIndex;
        }

        return -(rawIndex + 1);
    }
}
