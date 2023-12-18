import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> tyotenListA = new ArrayList<>();
        List<Integer> tyotenListB = new ArrayList<>();
        List<Integer> henList = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            tyotenListA.add(sc.nextInt());
            tyotenListB.add(sc.nextInt());
            henList.add(sc.nextInt());
        }

        // 長さが奇数の頂点の組のリスト
        List<Integer> kisuuTyotenList = new ArrayList<>();

        // 2回以上奇数に登場した頂点のリスト
        Set<Integer> duplicateKisuuSet = new HashSet<>();

        for (int i = 0; i < n - 1; i++) {
            if (henList.get(i) % 2 == 0) {
                continue;
            }
            if (kisuuTyotenList.contains(tyotenListA.get(i))) {
                duplicateKisuuSet.add(tyotenListA.get(i));
            } else {
                kisuuTyotenList.add(tyotenListA.get(i));
            }

            if (kisuuTyotenList.contains(tyotenListB.get(i))) {
                duplicateKisuuSet.add(tyotenListB.get(i));
            } else {
                kisuuTyotenList.add(tyotenListB.get(i));
            }
        }

        Set<Integer> singleLeftTyotenList = new HashSet<>();

        for (int i = 0; i < n - 1; i++) {
            if (henList.get(i) % 2 == 0) {
                continue;
            }

            if (duplicateKisuuSet.contains(tyotenListA.get(i)) || duplicateKisuuSet.contains(tyotenListB.get(i))) {
                continue;
            }

            singleLeftTyotenList.add(tyotenListA.get(i));

        }

        for (int i = 0; i < n; i++) {
            if (duplicateKisuuSet.contains(i) || singleLeftTyotenList.contains(i)) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}