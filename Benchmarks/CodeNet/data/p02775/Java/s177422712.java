import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] values = line.split(" ");

        String n = values[0];

        long maisuu = 0;
        char[] charArray = n.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            int a = Character.getNumericValue(charArray[i]);
            if (i == 0) {
                if (a <= 4) {
                    maisuu = a;
                } else {
                    int b = a + 1;
                    if (b >= 10) {
                        maisuu = 1;
                    } else {
                        maisuu = b;
                    }
                }
            } else {
                if (a <= 4) {
                    maisuu += a + 1;
                } else {
                    maisuu += (10 - a - 1);
                }
            }
        }
        System.out.println(maisuu);
    }
}