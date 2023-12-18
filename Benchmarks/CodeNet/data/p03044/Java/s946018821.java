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
        Set<Integer> changeColorSet = new HashSet<>();

        for (int i = 0; i < n - 1; i++) {
            if (henList.get(i) % 2 == 0) {
                continue;
            }
            if (kisuuTyotenList.contains(tyotenListA.get(i))) {
                changeColorSet.add(tyotenListA.get(i));
            } else {
                kisuuTyotenList.add(tyotenListA.get(i));
            }

            if (kisuuTyotenList.contains(tyotenListB.get(i))) {
                changeColorSet.add(tyotenListB.get(i));
            } else {
                kisuuTyotenList.add(tyotenListB.get(i));
            }
        }

        for (int i = 0; i < n - 1; i++) {
            if (henList.get(i) % 2 == 0) {
                continue;
            }

            if (changeColorSet.contains(tyotenListA.get(i)) || changeColorSet.contains(tyotenListB.get(i))) {
                continue;
            }

            changeColorSet.add(tyotenListA.get(i));

        }

        for (int i = 0; i < n; i++) {
            if (changeColorSet.contains(i)) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}