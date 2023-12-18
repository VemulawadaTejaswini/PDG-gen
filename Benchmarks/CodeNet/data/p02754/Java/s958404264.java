import java.util.Scanner;

/**
 * TITLE : Count Balls
 * URL : https://atcoder.jp/contests/abc158/tasks/abc158_b
 */
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long A = sc.nextInt();
        long B = sc.nextInt();


        long answer = (N / (A + B)) * A;
        answer = (N % (A + B)) <= A ? answer + (A - (N % (A + B))) : answer;
        System.out.println(answer);
        sc.close();
    }
}