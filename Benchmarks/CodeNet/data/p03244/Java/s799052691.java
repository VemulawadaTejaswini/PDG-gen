

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n / 2;
        int[] even = new int[m];
        int[] odd = new int[m];
        for (int i = 0; i < m; i++) {
            even[i] = sc.nextInt();
            odd[i] = sc.nextInt();
        }
        Map<Integer, Integer> evenMap = new HashMap<>();
        Map<Integer, Integer> oddMap = new HashMap<>();
        for (int i = 0; i < m; i++) {
            if (evenMap.containsKey(even[i])) {
                evenMap.put(even[i], evenMap.get(even[i]) + 1);
            } else {
                evenMap.put(even[i], 1);
            }
            if (oddMap.containsKey(odd[i])) {
                oddMap.put(odd[i], oddMap.get(odd[i]) + 1);
            } else {
                oddMap.put(odd[i], 1);
            }
        }

        List<Paramater> evenList = new ArrayList<>();
        List<Paramater> oddList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : evenMap.entrySet()) {
            Paramater parameter = new Paramater();
            parameter.setParam1(entry.getKey());
            parameter.setParam2(entry.getValue());
            evenList.add(parameter);
        }
        for (Map.Entry<Integer, Integer> entry : oddMap.entrySet()) {
            Paramater parameter = new Paramater();
            parameter.setParam1(entry.getKey());
            parameter.setParam2(entry.getValue());
            oddList.add(parameter);
        }

        Collections.sort(evenList, new TestComparator());
        Collections.sort(oddList, new TestComparator());

        if (evenList.size() == 1 && oddList.size() == 1) {
            if (evenList.get(0).getParam1() == oddList.get(0).getParam1()) {
                System.out.println(m);
            } else {
                System.out.println(0);
            }
        } else if (evenList.size() == 1 && oddList.size() > 1) {
            if (evenList.get(0).getParam1() == oddList.get(0).getParam1()) {
                System.out.println(m - oddList.get(1).getParam2());
            } else {
                System.out.println(m - oddList.get(0).getParam2());
            }
        } else if (evenList.size() > 1 && oddList.size() == 1) {
            if (evenList.get(0).getParam1() == oddList.get(0).getParam1()) {
                System.out.println(m - evenList.get(1).getParam2());
            } else {
                System.out.println(m - evenList.get(0).getParam2());
            }
        } else {
            int e1i = evenList.get(0).getParam1();
            int e1n = evenList.get(0).getParam2();
            int e2i = evenList.get(1).getParam1();
            int e2n = evenList.get(1).getParam2();
            int o1i = oddList.get(0).getParam1();
            int o1n = oddList.get(0).getParam2();
            int o2i = oddList.get(1).getParam1();
            int o2n = oddList.get(1).getParam2();
            if (e1i == o1i) {
                System.out.println(Math.min(n - e2n - o1n, n - e1n - o2n));
            } else {
                System.out.println(n - e1n - o1n);
            }

        }
    }

}
//複数キーのソート
class Paramater {
    private int param1;
    private int param2;

    public int getParam1() {
        return param1;
    }

    public void setParam1(int param1) {
        this.param1 = param1;
    }

    public int getParam2() {
        return param2;
    }

    public void setParam2(int param2) {
        this.param2 = param2;
    }

}

class TestComparator implements Comparator<Paramater> {
    @Override
    public int compare(Paramater o1, Paramater o2) {
        return o2.getParam2() - o1.getParam2();
    }

}
