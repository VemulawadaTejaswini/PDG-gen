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
        long cof1 = numOfNumber;
        long cof2 = 1;
        long mul1 = numOfNumber - 1;
        long mul2 = numOfNumber - (maxIndex - minIndex + 1);
        for (int k = 1; k <= numOfNumber; k++) {

            System.out.println((cof1 - cof2) % 1000000007);
            cof1 *= mul1;
            mul1--;
            if (mul2 >= 0) {
                cof2 *= mul2;
                mul2--;
            }
            cof1 /= k + 1;
            cof2 /= k;
        }
    }
}