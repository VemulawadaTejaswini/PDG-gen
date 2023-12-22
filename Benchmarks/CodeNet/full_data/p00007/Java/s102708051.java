import java.util.Scanner;

public class Main {
    public static final double FIRST_DEBT = 100000.0;
    public static final double INTEREST = 0.05;
    public static final double CEIL_BASE = 1000.0;

    public static void main(String args[]) {
        System.out.println(
            calcDebt(FIRST_DEBT, new Scanner(System.in).nextInt())
        );

    }

    private static int calcDebt(double firstDebt, int nWeeks) {
        double debt = firstDebt;
        for(int i = 0; i< nWeeks; i++) {
            debt = Math.ceil(debt * (1 + INTEREST) / CEIL_BASE) * CEIL_BASE;
        }
        return (int)debt;
    }
} 