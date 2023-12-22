import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Main {

    public static void main(String[] args) throws IOException {
        doit(args, System.in, System.out);
    }

    static void doit(String[] args, InputStream in, PrintStream out)
            throws IOException {
        int[][] permutations = calcPermutations();
        int[][] operations = calcOperations();

        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        while (true) {
            String[] values = reader.readLine().split(" ");
            int[] numbers = new int[4];
            int sum = 0;
            for (int i = 0; i < 4; i++) {
                numbers[i] = Integer.parseInt(values[i]);
                sum += numbers[i];
            }
            if (sum == 0) {
                break;
            } else if (sum == 10) {
                out.println(format(format012, numbers, operations[0]));
                continue;
            }

            String result = null;
            int[] sortedNumbers = new int[4];
            for (int i = 0; i < permutations.length; i++) {
                for (int p = 0; p < 4; p++) {
                    sortedNumbers[p] = numbers[permutations[i][p]];
                }
                for (int j = 0; j < operations.length; j++) {
                    int answer = apply012(sortedNumbers, operations[j]);
                    if (answer == 10) {
                        result = format(format012, sortedNumbers, operations[j]);
                        break;
                    }
                    answer = apply021(sortedNumbers, operations[j]);
                    if (answer == 10) {
                        result = format(format021, sortedNumbers, operations[j]);
                        break;
                    }
                }
                if (result != null) {
                    break;
                }
            }
            if (result == null) {
                result = "0";
            }
            out.println(result);
        }
    }

    private static int apply012(int[] numbers, int[] operation) {
        int result = apply(operation[0], numbers[0], numbers[1]);
        result = apply(operation[1], result, numbers[2]);
        return apply(operation[2], result, numbers[3]);
    }

    private static int apply021(int[] numbers, int[] operation) {
        int result1 = apply(operation[0], numbers[0], numbers[1]);
        int result2 = apply(operation[2], numbers[2], numbers[3]);
        return apply(operation[1], result1, result2);
    }

    private static int apply(int operator, int x, int y) {
        if (operator == 0) {
            return x + y;
        } else if (operator == 1) {
            return x - y;
        } else {
            return x * y;
        }
    }

    private static int[][] calcPermutations() {
        int[][] permutations = new int[24][4];
        int i = 0;
        for (int a = 0; a < 4; a++) {
            for (int b = 0; b < 4; b++) {
                if (b == a) {
                    continue;
                }
                for (int c = 0; c < 4; c++) {
                    if (c == a || c == b) {
                        continue;
                    }
                    for (int d = 0; d < 4; d++) {
                        if (d == a || d == b || d == c) {
                            continue;
                        }
                        permutations[i][0] = a;
                        permutations[i][1] = b;
                        permutations[i][2] = c;
                        permutations[i][3] = d;
                        i++;
                        break;
                    }
                }
            }
        }
        return permutations;
    }

    private static int[][] calcOperations() {
        int[][] operations = new int[27][3];
        int i = 0;
        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 3; b++) {
                for (int c = 0; c < 3; c++) {
                    operations[i][0] = a;
                    operations[i][1] = b;
                    operations[i][2] = c;
                    i++;
                }
            }
        }
        return operations;
    }

    private static final String format012 = "(((%d %s %d) %s %d) %s %d)";

    private static final String format021 = "((%d %s %d) %s (%d %s %d))";

    private static String format(String format, int[] numbers, int[] operation) {
        return String.format(format, numbers[0], operatorStrings[operation[0]],
                numbers[1], operatorStrings[operation[1]], numbers[2],
                operatorStrings[operation[2]], numbers[3]);
    }

    private static final String[] operatorStrings = { " + ", " - ", " * " };
}