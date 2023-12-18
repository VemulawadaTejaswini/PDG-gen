import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 4; j <= i + 6 && j <= s.length(); j++) {
                int target = Integer.parseInt(s.substring(i, j));

                if (target <= 200000 && target % 2019 == 0) {
                    result++;
                }
            }

        }

        System.out.println(result);
    }
}