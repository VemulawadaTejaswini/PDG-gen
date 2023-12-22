import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                int a = scanner.nextInt();
                Operation operation = Operation.fromOperation(scanner.next().charAt(0));
                int b = scanner.nextInt();
                if (operation == Operation.FINISH) {
                    return;
                }
                System.out.println(operation.calc(a, b));
            }
        }
    }
}

enum Operation {
    PLUS('+') {
        @Override
        int calc(int a, int b) {
            return a + b;
        }
    },
    MINUS('-') {
        @Override
        int calc(int a, int b) {
            return  a - b;
        }
    },
    MULTI('*') {
        @Override
        int calc(int a, int b) {
            return a * b;
        }
    },
    DIVISION('/') {
        @Override
        int calc(int a, int b) {
            return a / b;
        }
    },
    FINISH('?') {
        @Override
        int calc(int a, int b) {
            throw new IllegalArgumentException();
        }
    };

    final char op;

    Operation(char op) {
        this.op = op;
    }

    static Operation fromOperation(char c) {
        return Arrays.stream(Operation.values()).filter(op -> op.op == c).findFirst().get();
    }


    abstract int calc(int a, int b);
}