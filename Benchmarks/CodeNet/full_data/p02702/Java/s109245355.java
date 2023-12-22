import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sStr = sc.next();
//        String sStr = "1817181712114";


        int[] sArray = new int[sStr.length()];
        for (int i = 0; i < sArray.length; i++) {
            sArray[i] = Integer.parseInt(sStr.substring(i, i + 1));
        }

        int answer = 0;
        for (int j = 4; j <= sStr.length(); j++) {
            for (int i = 1; i <= j; i++) {
                int digits = j - i + 1;
                int target = 0;
                int count = 0;
                for (int k = digits - 1; k >= 0; k--) {
                    target += sArray[i + count - 1] * (int) Math.pow(10, k);
                    count++;
                }
                if (target % 2019 == 0) {
                    answer++;
                }
            }
        }

        System.out.println(answer);

    }
}