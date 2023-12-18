import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int score = 0;
        if (A > B) {
            score += A;
            A--;
        } else {
            score += B;
            B--;
        }
        if (A > B) {
            score += A;
            A--;
        } else {
            score += B;
            B--;
        }
        System.out.println(score);
    }
}