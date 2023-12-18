import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int[] array = new int[t];
        int[] copy = new int[t];
        for (int count = 0; count < t; count++) {
            int n = scan.nextInt();
            array[count] = n;
            copy[count] = n;
        }
        scan.close();
        Arrays.sort(copy);
        int counter = 0;
        for (int count = 0; count < t; count++) {
            if(array[count] != copy[count]) {
                counter++;
            }
        }
        if(counter < 3) {
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }

}