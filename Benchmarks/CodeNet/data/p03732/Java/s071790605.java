
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        Map<Integer, ArrayList<Integer>> itemMap = new HashMap<>();
        int w0 = sc.nextInt();
        for (int i = 0; i < 4; i++) {
            itemMap.put(w0 + i, new ArrayList<>());
        }
        itemMap.get(w0).add(sc.nextInt());
        for (int i = 1; i < N; i++) {
            itemMap.get(sc.nextInt()).add(sc.nextInt());
        }
        for (int i = 0; i < 4; i++) {
            Collections.sort(itemMap.get(w0 + i), (o1, o2) -> o2 - o1);
            itemMap.get(w0 + i).add(0, 0);
        }
        int max = 0;

        long wSum0 = 0;
        int vSum0 = 0;
        for (int i = 0; i < itemMap.get(w0).size(); i++) {
            vSum0 += itemMap.get(w0).get(i);
            long wSum1 = 0;
            int vSum1 = 0;
            for (int j = 0; j < itemMap.get(w0 + 1).size(); j++) {
                vSum1 += itemMap.get(w0 + 1).get(j);
                long wSum2 = 0;
                int vSum2 = 0;
                for (int k = 0; k < itemMap.get(w0 + 2).size(); k++) {
                    vSum2 += itemMap.get(w0 + 2).get(k);
                    long wSum3 = 0;
                    int vSum3 = 0;
                    for (int l = 0; l < itemMap.get(w0 + 3).size(); l++) {
                        vSum3 += itemMap.get(w0 + 3).get(l);
                        if (wSum0 + wSum1 + wSum2 + wSum3 <= W) {
                            max = Math.max(max, vSum0 + vSum1 + vSum2 + vSum3);
                        }
                        wSum3 += w0 + 3;
                    }
                    wSum2 += w0 + 2;
                }
                wSum1 += w0 + 1;
            }
            wSum0 += w0;
        }
        System.out.println(max);
    }
}
