
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int num[] = new int[3];

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++)
            num[i] = sc.nextInt();
        Arrays.sort(num);
        for (int i = 0; i < 3; i++) {
            System.out.print(num[i]);
            if (i != 2){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

