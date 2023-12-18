import java.util.*;

public class Main {
    public static void main(String args[]) {
        final Scanner lineScanner = new Scanner(System.in);
        final int lineNum = lineScanner.nextInt();
        final int expectA = lineScanner.nextInt();
        final int expectB = lineScanner.nextInt();
        final int expectC = lineScanner.nextInt();

        int mp = 0;
        List<Integer> bambooSizeList = new ArrayList<>();
        for (int i = 0; i < lineNum; i++) {
            int bambooSize = lineScanner.nextInt();
            bambooSizeList.add(bambooSize);
        }
        System.out.println(bambooSizeList);
        Integer min = bambooSizeList.stream()
                .min(Comparator.naturalOrder()).get();
        System.out.println(min);
        for (int j = 0; j < bambooSizeList.size() ; j++) {
            int size = bambooSizeList.get(j);
            if (size == expectA ||
                size == expectB ||
                size == expectC) {
                continue;
            }
            if (size == min && min > expectC) {
                bambooSizeList.set(j, size - 1);
                mp++;
            }
        }
        System.out.println(mp);
    }
}