import java.util.Scanner;

class Main {
    static class Calculator {
        enum Operator {
            NULL,
            PLUS {
                @Override
                public int apply(int r1, int r2) {
                    if (r1 + r2 > 9999) {
                        throw new RuntimeException();
                    } else {
                        return r1 + r2;
                    }
                }
            },
            MINUS {
                @Override
                public int apply(int r1, int r2) {
                    if (r1 - r2 < 0) {
                        throw new RuntimeException();
                    } else {
                        return r1 - r2;
                    }
                }
            },
            MULTIPLY {
                @Override
                public int apply(int r1, int r2) {
                    if (r1 * r2 > 9999) {
                        throw new RuntimeException();
                    } else {
                        return r1 * r2;
                    }
                }
            };
            public int apply(int r1, int r2) {
                if (r2 > 9999) {
                    throw new RuntimeException();
                } else {
                    return r2;
                }
            }
        }

        private final char[] input;

        public Calculator(char[] input) {
            this.input = input;
        }

        private int calc() {
            int R1 = 0;
            int R2 = 0;
            Operator R3 = Operator.NULL;
            for (int i = 0; input[i] != '='; i++) {
                if (Character.isDigit(input[i])) {
                    R2 = R2 * 10 + (input[i] - '0');
                } else if (input[i] == '+') {
                    R1 = R3.apply(R1, R2);
                    R2 = 0;
                    R3 = Operator.PLUS;
                } else if (input[i] == '-') {
                    R1 = R3.apply(R1, R2);
                    R2 = 0;
                    R3 = Operator.MINUS;
                } else if (input[i] == '*') {
                    R1 = R3.apply(R1, R2);
                    R2 = 0;
                    R3 = Operator.MULTIPLY;
                } else {
                    assert false;
                }
            }
            return R3.apply(R1, R2);
        }

        public void run() {
            try {
                System.out.println(calc());
            } catch (Throwable e) {
                System.out.println("E");
            }
        }
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            char[] input = scanner.next().toCharArray();
            new Calculator(input).run();
        }
    }

    public static void main(String... args) {
        solve();
    }
}