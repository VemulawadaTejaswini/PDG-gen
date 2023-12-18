import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String initial = sc.next();
        Integer numberOfOperation = sc.nextInt();
        byte[] asciiBytes = initial.getBytes(StandardCharsets.US_ASCII);
        for (int i = 0; i < asciiBytes.length; i++) {
            asciiBytes[i] -= 97;
        }
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < asciiBytes.length; i++) {
                if (asciiBytes[i] + numberOfOperation >= 26) {
                    numberOfOperation -= 26 - asciiBytes[i];
                    asciiBytes[i] = 0;
                }
            }
        }
        asciiBytes[asciiBytes.length - 1] += numberOfOperation;
        for (int i = 0; i < asciiBytes.length; i++) {
            asciiBytes[i] += 97;
        }
        System.out.println(new String(asciiBytes));
    }
}