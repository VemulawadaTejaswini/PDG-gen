import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long start = 100;
        int answer = 0;

        while (x > start) {
            start *= 1.01;
            answer++;
        }

        System.out.println(answer);
        sc.close();
    }

}
