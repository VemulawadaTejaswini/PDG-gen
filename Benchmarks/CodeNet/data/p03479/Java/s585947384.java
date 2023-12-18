import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long maxLen = 1l;
        for (int i = 0; i <= 60; i++) {
            long seqLen = (long) Math.pow(2, i);
            if ((double) (y / x) >= seqLen) {
                continue;
            }
            maxLen = i;
            break;
        }
        System.out.println(maxLen);
    }

}
