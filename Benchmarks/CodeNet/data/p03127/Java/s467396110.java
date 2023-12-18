
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int monsters = sc.nextInt();
        Set<Integer> initHPset = new HashSet<>(monsters);
        for (int i = 0; i < monsters; i++) {
            initHPset.add(sc.nextInt());
        }
        if (initHPset.size() == 1) {
            System.out.println(initHPset.iterator().next().toString());
            return;
        }

        int[] initHPArray = initHPset.stream().mapToInt(Integer::intValue).sorted().toArray();
        Set<Integer> allModSet = new HashSet<>(initHPset);
        for (int i = 0; i < initHPArray.length - 1; i++) {
            for (int j = i + 1; j < initHPArray.length; j++) {
                allModSet.add((initHPArray[j] % initHPArray[i]));
            }
        }

        int[] allModArray = allModSet.stream().mapToInt(Integer::intValue).filter(i -> i != 0).sorted().toArray();
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
