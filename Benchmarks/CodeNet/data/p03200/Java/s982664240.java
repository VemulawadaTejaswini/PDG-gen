import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.next();
        String[] input = in.split("");
        int wFixNum = Integer.MIN_VALUE;
        long count = 0;
        for (int i = 0; i < input.length; i++) {
            if ("W".equals(input[i])) {
                if (wFixNum < 0) {
                    wFixNum = 0;
                    input[0] = "W";
                    input[i] = "B";
                    count += i;
                    continue;
                }
                input[++wFixNum] = "W";
                input[i] = "B";
                count += i - wFixNum;
            }
        }
        System.out.println(count);
    }
}
