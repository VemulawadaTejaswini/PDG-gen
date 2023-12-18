import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] level = new int[n];
        int count = 1;
        int min = 0;
        for (int i = 0; i < n; i++) {
            level[i] = input.nextInt();
            if (i == 0) {
                min = level[0];
            } else {

                if (level[i] <= min) {
                    count++;
                    min = level[i];
                }
            }
        }
        System.out.println(count);

    }
}