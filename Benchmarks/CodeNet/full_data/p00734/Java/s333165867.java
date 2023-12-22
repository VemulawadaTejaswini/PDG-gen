import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static ArrayList<Integer> list;

    public static void main(String args[]) throws FileNotFoundException {
        list = new ArrayList<Integer>();
        Scanner stdIn = new Scanner(System.in);
        while (stdIn.hasNext()) {
            list.add(stdIn.nextInt());
        }
        algorith(list.get(0), list.get(1), 2);
    }

    private static void algorith(Integer A, Integer B, int index) {
        int SumA = 0;
        int SumAB = 0;
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        List<Integer> listAB = new ArrayList<>();
        if (list.size() < (A + B + index + 2)) {
            return;
        }
        for (int i = index; i < (A + B + index); i++) {
            SumAB += list.get(i);
            listAB.add(list.get(i));
        }
        if (SumAB % 2 == 0) {
            for (int j = 0; j < A; j++) {
                listA.add(listAB.get(j));
                SumA += listA.get(j);
            }
            for (int k = A; k < listAB.size(); k++) {
                listB.add(listAB.get(k));
            }
            Collections.sort(listA);
            Collections.sort(listB);
            int tb = SumAB / 2;
            int freg = 0;
            boolean brkFlg = false;
            if (SumA <= tb) {
                freg = tb - SumA;
                for (int i = 0; i < listA.size(); i++) {
                    for (int j = 0; j < listB.size(); j++) {
                        if (listA.get(i) + freg == listB.get(j)) {
                            System.out.println(listA.get(i) + " " + listB.get(j));
                            algorith(list.get(A + B + index), list.get(A + B + index + 1), (A + B + index + 2));
                            return;
                        }
                    }
                }

                System.out.println(-1);
                algorith(list.get(A + B + index), list.get(A + B + index + 1), (A + B + index + 2));
            } else {
                freg = SumA - tb;
                for (int i = 0; i < listA.size(); i++) {
                    for (int j = 0; j < listB.size(); j++) {
                        if (listA.get(i) - freg == listB.get(j)) {
                            System.out.println(listA.get(i) + " " + listB.get(j));
                            algorith(list.get(A + B + index), list.get(A + B + index + 1), (A + B + index + 2));
                            return;
                        }
                    }
                }
                System.out.println(-1);
                algorith(list.get(A + B + index), list.get(A + B + index + 1), (A + B + index + 2));
            }
        } else {
            System.out.println(-1);
            algorith(list.get(A + B + index), list.get(A + B + index + 1), (A + B + index + 2));
        }
    }
}

