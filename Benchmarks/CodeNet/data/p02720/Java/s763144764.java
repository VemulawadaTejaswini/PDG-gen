
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Long> aList = new ArrayList<Long>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int k = Integer.parseInt(scan.next());

        scan.close();

        aList.add((long) 0);
        aList.add((long) 1);
        aList.add((long) 2);
        aList.add((long) 3);
        aList.add((long) 4);
        aList.add((long) 5);
        aList.add((long) 6);
        aList.add((long) 7);
        aList.add((long) 8);
        aList.add((long) 9);

        long i = 1;
        while (aList.size() < 100001) {
            i *= 10;
            addA(i);
        }

        System.out.println(aList.get(k));
    }

    private static void addA(long keta) {
        List<Long> addList = new ArrayList<Long>();
        long curKeta = keta / 10;

        addList.add(keta);

        for (long a : aList) {
            if (a < curKeta) {
                String aStr = String.valueOf(a);
                if (aStr.startsWith("1")) {
                    addList.add(keta + a);
                }

                continue;
            }

            long headNum = a / curKeta;
            if (headNum == 1) {
                addList.add(keta + a);
                addList.add(keta * 2 + a);
            } else if (headNum == 9) {
                addList.add(keta * 8 + a);
                addList.add(keta * 9 + a);
            } else {
                addList.add(keta * (headNum - 1) + a);
                addList.add(keta * headNum + a);
                addList.add(keta * (headNum + 1) + a);
            }
        }

        Collections.sort(addList);
        for (long addNum : addList) {
            aList.add(addNum);
        }
    }

}
