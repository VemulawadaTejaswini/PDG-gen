import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        int inputInt = scanner.nextInt();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(inputString);

        for (int i = 0; i < inputInt; i++) {
            int T = scanner.nextInt();
            if (T == 1) {
                stringBuilder.reverse();
            } else {
                int F = scanner.nextInt();
                String C = scanner.next();
                if (F == 1) {
                    stringBuilder.insert(0, C);
                } else {
                    stringBuilder.append(C);
                }
            }
        }

        System.out.println(stringBuilder.toString());
    }
}
