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
        if(array.length == 1) {
            System.out.println(array[0]);
        } else if(array.length == 2) {
            System.out.println(array[1] - array[0]);
        } else if(array.length == 3) {
            System.out.println(array[2] + array[0] - array[1]);
        } else {
            int aliceCards = array[array.length-1] + array[array.length-3];
            int bobCards = array[array.length-2] + array[array.length-4];
            System.out.println(aliceCards - bobCards);
        }
    }
}
