import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();

        long[] la = new long[121];
        for (int i = 0; i <= 120; i++) {
            la[i] = (long) i * i * i * i * i;
        }
        out:
        for (int i = 0; i < la.length; i++) {
            for (int j = 0; j < la.length; j++) {
                if (la[i] - la[j] == X) {
                    System.out.println(i + " " + j);
                    break out;
                } else if (la[i] + la[j] == X) {
                    System.out.println(i + " -" + j);
                    break out;
                }
            }
        }
    }
}