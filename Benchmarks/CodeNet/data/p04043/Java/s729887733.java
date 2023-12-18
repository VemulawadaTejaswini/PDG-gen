import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);
        if (array[0] == 5 && array[1] == 5 && array[2] == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}