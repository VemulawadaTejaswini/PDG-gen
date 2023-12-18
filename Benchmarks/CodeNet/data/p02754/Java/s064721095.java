import java.util.Scanner;

/**
 * TITLE : Count Balls
 * URL : https://atcoder.jp/contests/abc158/tasks/abc158_b
 */
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();


        int answer = (N / (A + B)) * A;
        answer = (N % (A + B)) <= A ? answer + (A - (N % (A + B))) : answer;
        System.out.println(answer);
        sc.close();
    }
}