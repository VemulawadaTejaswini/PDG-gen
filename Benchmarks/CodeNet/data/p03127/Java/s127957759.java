import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int monsters = sc.nextInt();
        int[] initHPArray = new int[monsters];
        for (int i = 0; i < monsters; i++) {
            initHPArray[i] = sc.nextInt();
        }
        Arrays.parallelSort(initHPArray);

        IntStream allModStream = IntStream.of(initHPArray);
        for (int i = 0; i < initHPArray.length - 1; i++) {
            int[] mods = new int[initHPArray.length];
            for (int j = i + 1; j < initHPArray.length; j++) {
                mods[j] = initHPArray[j] % initHPArray[i];
            }
            allModStream = IntStream.concat(allModStream, IntStream.of(mods).filter(n -> n != 0)).distinct();
        }

        int[] allModArray = allModStream.distinct().sorted().toArray();
        if (allModArray.length == 0) {
            System.out.println(initHPArray[0]);
            return;
        }

        int minDiff = allModArray[0];
        for (int i = 1; i < allModArray.length; i++) {
            int diff = allModArray[i] - allModArray[i - 1];
            minDiff = Math.min(minDiff, diff);
        }
        System.out.println(minDiff);
    }
}