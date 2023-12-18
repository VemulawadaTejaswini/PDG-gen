import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[4];
        for (int i = 0; i < 4; i++) {
            n[i] = sc.nextInt();
        }
        Arrays.sort(n);

        if (n[0] == 1) {
            if (n[1] == 4) {
                if (n[2] == 7) {
                    if (n[3] == 9) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}










