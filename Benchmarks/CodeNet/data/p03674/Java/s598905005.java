import java.util.*;
import java.math.*;
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
        int d = maxIndex - minIndex + 1;
        BigInteger moduler = new BigInteger("1000000007");
        BigInteger cof1 = new BigInteger("" + numOfNumber);
        BigInteger cof2 = new BigInteger("" + 1);
        BigInteger one = new BigInteger("" + 1);
        BigInteger mul1 = new BigInteger("" + (numOfNumber - 1));
        BigInteger mul2 = new BigInteger("" + (numOfNumber - d));
        for (int k = 1; k <= numOfNumber; k++) {
            BigInteger res = cof1.subtract(cof2);
            res = res.mod(moduler);
            System.out.println(res.toString());
            cof1 = cof1.multiply(mul1);
            mul1 = mul1.subtract(one);
            if (mul2.compareTo(new BigInteger("0")) >= 0) {
                cof2 = cof2.multiply(mul2);
                mul2 = mul2.subtract(one);
            }
            cof1 = cof1.divide(new BigInteger("" + (k + 1)));
            cof2 = cof2.divide(new BigInteger("" + k));
        }
    }
}