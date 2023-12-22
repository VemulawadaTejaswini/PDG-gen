import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        ArrayList<Integer> input = new ArrayList<>();

        int rows = inp.nextInt();
        int columns = inp.nextInt();

        int totalTotal = 0;

        for (int i = 0; i < rows; i++){
            int total = 0;
            for (int j = 0; j < columns; j++) {
                int number = inp.nextInt();

                if (j != 0) {
                    System.out.print(" ");
                }

                System.out.print(number);

                total += number;
            }

            System.out.print(" " + total);

            totalTotal += total;
            total = 0;

            if (i == rows-1) {
                System.out.print(" " + totalTotal + "\n");
            } else {
                System.out.print("\n");
            }
        }
    }
}

