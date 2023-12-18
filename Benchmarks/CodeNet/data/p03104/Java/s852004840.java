import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] arr = br.readLine().split(" ");
        long A = Long.parseLong(arr[0]);
        long B = Long.parseLong(arr[1]);

        int digit = 0;
        while (Math.pow(2, digit) < B) {
            digit++;
        }

        int[] arr2 = new int[digit + 1];

        calcXOR(arr2, A - 1, digit);
        calcXOR(arr2, B, digit);

        String binAns = "";
        for (int l : arr2) {
            binAns += l % 2 == 1 ? "1" : "0";
        }
        out.println(Long.parseLong(binAns, 2));
        out.close();
    }
    
    private static void calcXOR(int[] arr, long X, int digit) {
        String digitStr = "%" + String.valueOf(digit + 1) + "s";
        if (X % 2 == 0) {
            String bin = String.format(digitStr, Long.toBinaryString(X));
            String[] arr3 = bin.split("");
            for (int j = 0; j < digit + 1; j++) {
                arr[j] += arr3[j].equals("1") ? 1 : 0;
            }
            if (X / 2 % 2 == 1) {
                arr[digit] += 1;
            }
        } else {
            if ((X + 1) / 2 % 2 == 1) {
                arr[digit] += 1;
            }
        }
    }
}