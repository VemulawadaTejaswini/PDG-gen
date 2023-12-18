import java.util.*;
import java.lang.*;

public class Main {
    public static int helper(int N, int A, int B) {
        int sum = 0;
        for (int i = 1; i < N + 1; i++) {
            int digsum = sumDigit(i);
            if (digsum >= A && digsum <= B) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static int sumDigit(int num) {
        int digSum = 0;
        int pow = 0;
        while (Math.pow(10,pow) < num) {
            pow++;
        }
        for (int i = 0; i <= pow; i++) {
            int digits = num / (int) Math.pow(10,i);
            digSum = digSum + (digits % 10);
        }
        return digSum;
    }

    public static void main(String[] args) {
        Scanner dataScanner = new Scanner(System.in);
        String[] data = dataScanner.nextLine().split(" ");
        int intLim = Integer.parseInt(data[0]);
        int digLLim = Integer.parseInt(data[1]);
        int digULim = Integer.parseInt(data[2]);
        int sum = helper(intLim, digLLim, digULim);
      	System.out.println(sum);
    }
}
