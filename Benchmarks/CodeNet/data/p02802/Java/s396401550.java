import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int acmap[] = new int[N];
        int wamap[] = new int[N];

        scanner.nextLine();

        for (int i = 0; i < M; i++) {
            int task = scanner.nextInt();
            String result = scanner.next();

            if (result.equals("AC")) {
                acmap[task - 1] = 1;
            } else {
                wamap[task - 1] = 1;
            }

            scanner.nextLine();
        }

        int ac = 0;
        int wa = 0;
        for (int i : acmap) {
            if (i == 1) {
                ac++;
            }
        }

        for (int i : wamap) {
            if (i == 1) {
                wa++;
            }
        }

        System.out.println(ac + " " + wa);
    }
}
