import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        System.out.println(
            calcDebt(100000.0, new Scanner(System.in).nextInt())
        );

    }

    private static int calcDebt(double firstDebt, int nWeeks) {
        double debt = firstDebt;
        for(int i = 0; i< nWeeks; i++) {
            debt = Math.ceil(debt * (1 + 0.05) / 1000.0) * 1000.0;
        }
        return (int)debt;
    }
} 