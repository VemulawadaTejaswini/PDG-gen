import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        int[] heightlist = new int[10];
        for (int i = 1; i < 11; i++) {
            System.out.println("height of mountain" + i + "(integer)");
            heightlist[i-1] = input.nextInt();
        }
        Arrays.sort(heightlist);
        System.out.println("height of the 1st mountain " + heightlist[9]);
        System.out.println("height of the 2nd mountain " + heightlist[8]);
        System.out.println("height of the 3rd mountain " + heightlist[7]);
    }
}