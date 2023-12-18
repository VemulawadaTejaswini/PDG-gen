import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();

        int inputVal = Integer.valueOf(inputStr);
        int ans = 0;

        while (inputVal > 0) {
            int length = String.valueOf(inputVal).length();
            if (length == 1) {
                ans += inputVal;
                inputVal = 0;
                continue;
            }
            int nextVal = 0;

            for (int i = 0; i < length -1; i++) {
                int a = (int)Math.pow(10, i) * 9;
                nextVal += a;
            }

            if (length % 2 == 1) ans += (inputVal - nextVal);
            inputVal = nextVal;
        }

        System.out.println(ans < 0? 0: ans);
    }
}