import java.util.*;
import java.lang.*;

/**
 * Rummy
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        loop: for (int i = 0; i < n; i++) {
            int numList[] = new int[9];
            List<Integer> redList = new ArrayList<Integer>();
            List<Integer> greenList = new ArrayList<Integer>();
            List<Integer> blueList = new ArrayList<Integer>();

            for (int j = 0; j < 9; j++) {
                numList[j] = sc.nextInt();
            }
            for (int j = 0; j < 9; j++) {
                switch (sc.next()) {
                case "R":
                    redList.add(numList[j]);
                case "G":
                    greenList.add(numList[j]);
                case "B":
                    blueList.add(numList[j]);
                }
            }

            Collections.sort(redList);
            Collections.sort(greenList);
            Collections.sort(blueList);

            // まず3の倍数になってない時点でNg
            if (redList.size() % 3 != 0 || blueList.size() % 3 != 0 || greenList.size() % 3 != 0) {
                System.out.println(0);
                continue loop;
            }

            // 各色について全探索して, 連番or同じ数にできるか
            if (Confirm(redList) && Confirm(blueList) && Confirm(greenList)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    private static boolean Confirm3(List<Integer> list) {
        if (list.get(0) == list.get(1) && list.get(1) == list.get(2)) {
            return true;
        } else if (list.get(0) + 1 == list.get(1) && list.get(1) + 1 == list.get(2)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean Confirm6(List<Integer> list) {
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                for (int k = j + 1; k < 6; k++) {
                    List<Integer> tmpList1 = new ArrayList<Integer>();
                    tmpList1.add(list.get(i));
                    tmpList1.add(list.get(j));
                    tmpList1.add(list.get(k));
                    if (Confirm3(tmpList1)) {
                        List<Integer> tmpList2 = new ArrayList<Integer>();
                        for (int l = 0; l < 6; l++) {
                            if (l != i && l != j && l != k) {
                                tmpList2.add(list.get(l));
                            }
                        }

                        if (Confirm3(tmpList2)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private static boolean Confirm9(List<Integer> list) {
        for (int i = 0; i < 7; i++) {
            for (int j = i + 1; j < 8; j++) {
                for (int k = j + 1; k < 9; k++) {
                    List<Integer> tmpList1 = new ArrayList<Integer>();
                    tmpList1.add(list.get(i));
                    tmpList1.add(list.get(j));
                    tmpList1.add(list.get(k));
                    if (Confirm3(tmpList1)) {
                        List<Integer> tmpList2 = new ArrayList<Integer>();
                        for (int l = 0; l < 9; l++) {
                            if (l != i && l != j && l != k) {
                                tmpList2.add(list.get(l));
                            }
                        }

                        if (Confirm6(tmpList2)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;

    }

    // bit全探索して, 連番or同じ数の組が作れたらtrueを返す
    private static boolean Confirm(List<Integer> list) {
        int len = list.size();

        if (len == 0)
            return true;

        if (len / 3 == 1) {
            return (Confirm3(list));
        } else if (len / 3 == 2) {
            return (Confirm6(list));
        } else {
            return (Confirm9(list));
        }
    }
}
