import java.util.Scanner;

public class Main {
    public static void main(String[] var0) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int AC = 0;
        int WA = 0;
        int TLE = 0;
        int RE = 0;

        for (int i = 0; i < N; i++) {
            String C = scanner.next();
            if (C.equals("AC")) {
                AC += 1;
            } else if(C.equals("WA")) {
                WA += 1;
            } else if(C.equals("TLE")) {
                TLE += 1;
            } else {
                RE += 1;
            }
        }

        System.out.println("AC x " + AC);
        System.out.println("WA x " + WA);
        System.out.println("TLE x " + TLE);
        System.out.println("RE x " + RE);
    }
}