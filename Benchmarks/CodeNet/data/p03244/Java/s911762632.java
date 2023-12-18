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

        int oddTargetKey = 0;
        int evenTargetKey = 0;
        int oddSecondTargetVal = 0;
        int evenSecondTargetVal = 0;

        int oddTargetVal = 0;
        int evenTargetVal = 0;

        for (java.util.Map.Entry<Integer, Integer> entry : oddMap.entrySet()) {
            if (entry.getValue() > oddTargetKey) {
                oddSecondTargetVal = oddTargetVal;
                oddTargetKey = entry.getKey();
                oddTargetVal = entry.getValue();
            } else if (entry.getValue() > oddSecondTargetVal){
                oddSecondTargetVal = entry.getValue();
            }
        }

        for (java.util.Map.Entry<Integer, Integer> entry : evenMap.entrySet()) {
            if (entry.getValue() > evenTargetKey) {
                evenSecondTargetVal = evenTargetKey;
                evenTargetKey = entry.getKey();
                evenTargetVal = entry.getValue();
            } else if (entry.getValue() > evenSecondTargetVal){
                evenSecondTargetVal = entry.getValue();
            }
        }

        if (oddTargetKey == evenTargetKey) {
            int secondOdd = n - (oddSecondTargetVal + evenTargetVal);
            int secondEven = n - (oddTargetVal + evenSecondTargetVal);
            System.out.println(Math.min(secondOdd, secondEven));

            System.out.println(Math.min(secondOdd, secondEven));
        } else {
            System.out.println(n - (oddTargetVal + evenTargetVal));
        }


    }
}