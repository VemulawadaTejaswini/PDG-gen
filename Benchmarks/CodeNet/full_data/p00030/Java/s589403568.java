import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                int n = sc.nextInt();
                int s = sc.nextInt();
                if (s == 0 && n == 0)
                    break;
                System.out.println(searchAnswer(n, s, 0));
            }
        }
    }

    private static int searchAnswer(int availableNumberCount, int rest, int number) {
        if (availableNumberCount == 0 && rest == 0) return 1;
        if (availableNumberCount <= 0 || rest < 0 || number == 10) return 0;

        return searchAnswer(availableNumberCount, rest, number + 1) +
	    searchAnswer(availableNumberCount - 1, rest - number, number + 1);
    }
}
