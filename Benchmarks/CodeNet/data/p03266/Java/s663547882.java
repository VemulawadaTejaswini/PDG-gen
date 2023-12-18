import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int countDif = 0;
        int countSame = 0;
        int count2num = 0;
        for (int a = 1; a <= N; a++) {
            if ((a + a) % K == 0) {
                countSame++;
                for (int b = 1; b <= N; b++) {
                    if ((a + b) % K == 0 && a != b) {
                        count2num++;
                    }
                }
            }
            for (int b = a + 1; b <= N; b++) {
                if ((a + b) % K != 0) {
                    continue;
                }
                for (int c = b + 1; c <= N; c++) {
                    if ((b + c) % K == 0 && (c + a) % K == 0) {
                        countDif++;
                    }
                }
            }
        }
        System.out.println(countDif * 6 + countSame + count2num * 3);
    }
}