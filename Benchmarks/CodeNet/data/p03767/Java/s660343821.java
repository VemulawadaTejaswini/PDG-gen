import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int givenNumber = scanner.nextInt();
        scanner.nextLine();
        long[] strength = new long[givenNumber*3];
        for(int i=0; i<givenNumber*3; i++) {
            strength[i] = scanner.nextLong();
        }
        Arrays.sort(strength);
        long targetStrength = 0;
        for(int i=0; i<givenNumber; i++) {
            targetStrength += strength[strength.length-(1+i+givenNumber)];
        }
        System.out.println(targetStrength);
    }
}
