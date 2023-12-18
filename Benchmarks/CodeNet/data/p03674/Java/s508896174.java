import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfNumber = scanner.nextInt() + 1;
        int[] numbers = new int[numOfNumber];
        for (int i = 0; i < numOfNumber; i++) {
            numbers[i] = scanner.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numOfNumber; i++) {
            if (map.containsKey(numbers[i]) == false) {
                map.put(numbers[i], 1);
            }
            else {
                map.put(numbers[i], map.get(numbers[i]) + 1);
            }
        }
        int dup = 0;
        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                dup = key;
                break;
            }
        }
        int minIndex = -1;
        int maxIndex = -1;
        for (int i = 0; i < numOfNumber; i++) {
            if (numbers[i] == dup) {
                if (minIndex >= 0) {
                    maxIndex = i;
                }
                else {
                    minIndex = i;
                }
            }
        }
        int d = maxIndex - minIndex - 1;
        //System.out.println(dup);
        HashMap<String, Integer> mymap = new HashMap<String, Integer>();
        for (int k = 1; k <= numOfNumber; k++) {
            int coe1 = getBinomialCoefficient(numOfNumber, k, mymap);
            int coe2 = getBinomialCoefficient(numOfNumber - d - 2, k - 1, mymap);
            System.out.println(coe1 - coe2 + " ");
        }
    }
    public static int getBinomialCoefficient(int n, int k, HashMap<String, Integer> map) {
        String key = n + " " + k;
        if (map.containsKey(key)) {
            return map.get(key);
        }
        if (n < k || k < 0 || n <= 0) {
            return 0;
        }
        if (n == k || k == 0) {
            return 1;
        }
        if (k == 1) {
            return n;
        }
        int sum = getBinomialCoefficient(n - 1, k - 1, map) + getBinomialCoefficient(n - 1, k, map);
        map.put(key, sum);
        return sum;
    }
}