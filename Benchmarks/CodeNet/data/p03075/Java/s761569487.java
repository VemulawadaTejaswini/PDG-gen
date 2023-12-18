import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] pos = new int[5];
        int k;
        String result = "Yay!";

        for (int i = 0; i < 5; i++)
            pos[i] = sc.nextInt();

        k = sc.nextInt();

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (pos[j] - pos[i] > k) {
                    result = ":(";
                    break;
                }
            }
        }

        System.out.println(result);
    }
}