import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int givenNumber = scanner.nextInt();
        int[] array = new int[givenNumber];
        for(int i=0; i<givenNumber; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        int aliceCards = 0;
        int bobCards = 0;
        for(int i=0; i<array.length; i++) {
            if(i % 2 == 0) {
                bobCards += array[i];
            } else {
                aliceCards += array[i];
            }
        }
        System.out.println(Math.abs(aliceCards - bobCards));
    }
}
