import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        java.util.Map<Integer, Integer> oddMap = new HashMap<>();
        java.util.Map<Integer, Integer> evenMap = new HashMap<>();
        int currentVal = 0;
        for (int i = 0; i < n; i++) {
            currentVal = sc.nextInt();
            if (i % 2 == 0) {
                oddMap.put(currentVal, oddMap.getOrDefault(currentVal, 0) + 1);
            } else {
                evenMap.put(currentVal, evenMap.getOrDefault(currentVal, 0) + 1);
            }
        }

        int o1_k = -1;
        int e1_k = -1;
        int o2 = -1;
        int e2 = -1;

        int o1 = -1;
        int e1 = -1;

        for (java.util.Map.Entry<Integer, Integer> entry : oddMap.entrySet()) {
            if (entry.getValue() > o1) {
                o2 = o1;
                o1_k = entry.getKey();
                o1 = entry.getValue();
            } else if (entry.getValue() > o2){
                o2 = entry.getValue();
            }
        }

        for (java.util.Map.Entry<Integer, Integer> entry : evenMap.entrySet()) {
            if (entry.getValue() > e1) {
                e2 = e1;
                e1_k = entry.getKey();
                e1 = entry.getValue();
            } else if (entry.getValue() > e2){
                e2 = entry.getValue();
            }
        }

        if (o1_k == e1_k) {
            System.out.println(Math.min(n - o2 - e1, n - o1 - e2));
        } else {
            System.out.println(n - o1 - e1);
        }


    }
}