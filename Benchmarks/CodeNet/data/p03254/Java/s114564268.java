import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int givenNumber = scanner.nextInt();
        int quantity = scanner.nextInt();
        scanner.nextLine();
        int[] array = new int[givenNumber];
        for(int i=0; i<givenNumber; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        int count = 0;
        for(int i=0; i<array.length; i++) {
            if(i == array.length-1) {
                if(quantity - array[i] == 0) {
                    count += 1;
                }
            } else {
                if(quantity - array[i] >= 0) {
                    count += 1;
                    quantity -= array[i];
                }
            }
        }
        System.out.println(count);
    }
}
