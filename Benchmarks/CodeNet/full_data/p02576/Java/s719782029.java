import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int t = Integer.parseInt(sc.next());
        int answer = 0;
        int takoyaki = 0;
        while (takoyaki < n) {
            takoyaki += x;
            answer += t;
        }
        System.out.println(answer);
        sc.close();
    }
}