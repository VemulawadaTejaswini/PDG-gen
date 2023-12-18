import java.util.Scanner;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        final int count = Integer.parseInt(SCANNER.nextLine());
        int[] rabbits = new int[count];

        for (int i = 0; i < rabbits.length; i++) {
            rabbits[i] = SCANNER.nextInt();
        }

        int countPairs = 0;
        for (int i = 0; i < rabbits.length; i++) {
            if (rabbits[i] - 1 != i && rabbits[rabbits[i] - 1] == (i + 1)) {
                ++countPairs;
            }
        }
        System.out.println(countPairs / 2);
    }
}