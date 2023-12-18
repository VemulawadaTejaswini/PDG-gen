import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Long> aList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            aList.add(scanner.nextLong());
        }
        Collections.sort(aList);

        ArrayList<ArrayList<Long>> xyList = new ArrayList<>();
        while (aList.size() > 2) {
            if (aList.get(aList.size()-1) > 0) {
                long n = aList.get(0) - aList.get(aList.size()-1);
                ArrayList<Long> xy = new ArrayList<>();
                xy.add(aList.get(0));
                xy.add(aList.get(aList.size()-1));
                xyList.add(xy);
                aList.remove(0);
                aList.remove(aList.size()-1);
                aList.add(0, n);
            } else {
                long n = aList.get(aList.size()-1) - aList.get(0);
                ArrayList<Long> xy = new ArrayList<>();
                xy.add(aList.get(aList.size()-1));
                xy.add(aList.get(0));
                xyList.add(xy);
                aList.remove(0);
                aList.remove(aList.size()-1);
                aList.add(n);
            }
        }
        long m = aList.get(1) - aList.get(0);
        ArrayList<Long> xy = new ArrayList<>();
        xy.add(aList.get(1));
        xy.add(aList.get(0));
        xyList.add(xy);
        System.out.println(m);
        for (ArrayList<Long> _xy : xyList) {
               System.out.println(_xy.get(0) + " " + _xy.get(1));
        }
    }
}