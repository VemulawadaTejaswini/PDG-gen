import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
        }
        Arrays.sort(score);

        for (int i = 0; i < n; i++) {
            sum += score[i];
        }

        if (sum % 10 != 0) {
            System.out.println(sum);
        } else {                        //sumが10の倍数の場合
            for (int i = 0; i < n; i++) {
                if (i != (n-1)) {
                    sum -= score[i];
                }
                if (sum % 10 != 0) {
                    System.out.println(sum);
                    break;
                }
                if (i == (n- 1) && sum % 10 == 0) {
                    System.out.println(0);
                    break;
                } else if (i == (n- 1)){
                    System.out.println(sum);
                    break;
                }
            }
        }
    }
}