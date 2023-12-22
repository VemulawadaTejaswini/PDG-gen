import java.util.*;
import java.math.*;

class E {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = input.nextInt();
        Arrays.sort(arr);
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        BigInteger answer = new BigInteger("1");
        BigInteger M = new BigInteger("1000000007");
        int i = 0;
        while (i < k) {
            answer = answer.multiply(BigInteger.valueOf(arr[i]));
            i++;
        }
        BigInteger maxAnswer = answer;
        int j = n - 1;
        i--;
        while (i >= 0) {
            answer = answer.divide(BigInteger.valueOf(arr[i]));
            i--;
            answer = answer.multiply(BigInteger.valueOf(arr[j]));
            j--;
            if (maxAnswer.compareTo(answer) < 0) {
                maxAnswer = answer;
            }
        }
        if (maxAnswer.compareTo(BigInteger.valueOf(0)) < 0) {
            maxAnswer = maxAnswer.abs();
            maxAnswer = maxAnswer.mod(M);
            maxAnswer = M.subtract(maxAnswer);
            System.out.println(maxAnswer);
        } else {
            maxAnswer = maxAnswer.mod(M);
            System.out.println(maxAnswer);
        }
        input.close();
    }
}