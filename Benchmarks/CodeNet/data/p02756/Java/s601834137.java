import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        int inputInt = scanner.nextInt();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(inputString);

        int reverseCounter = 0;
        boolean startIsStart = true;
        for (int i = 0; i < inputInt; i++) {
            int T = scanner.nextInt();
            if (T == 1) {
                reverseCounter++;
                if (startIsStart) {
                    startIsStart = false;
                } else {
                    startIsStart = true;
                }
            } else {
                int F = scanner.nextInt();
                String C = scanner.next();
                if (startIsStart) {
                    if (F == 1) {
                        stringBuilder.insert(0, C);
                    } else {
                        stringBuilder.append(C);
                    }
                } else {
                    if (F == 2) {
                        stringBuilder.insert(0, C);
                    } else {
                        stringBuilder.append(C);
                    }
                }
            }
        }

        int a = reverseCounter % 2;
        if (a == 1) {
            stringBuilder.reverse();
        }

        System.out.println(stringBuilder.toString());
    }
}