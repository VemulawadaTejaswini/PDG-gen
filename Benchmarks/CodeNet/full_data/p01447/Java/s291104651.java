import java.util.Scanner;


public class Main {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int count=0;
        int N = s.nextInt();

        while (true) {
            int rest = N / 3;
            int right = N / 3;
            int left = N / 3;

            if (N % 3 == 1) {
                rest += 1;
            } else if (N % 3 == 2) {
                right += 1;
                left += 1;
            }

            N = Math.max(right, left);
            N = Math.max(N, rest);
            count++;

            if(N==1) break;
        }
        System.out.println(count);
    }
}