import java.util.Scanner;

public class Main {
    public boolean isCorrect(int animalCount, int legCount) {
        // base case
        if (animalCount == 0) {
            return legCount == 0;
        }

        return isCorrect(animalCount - 1, legCount - 2) || isCorrect(animalCount - 1, legCount - 4);
    }

    public static void main(String[] args) throws Exception {
        Main solution = new Main();

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        boolean answer = solution.isCorrect(x, y);
        if (answer) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}