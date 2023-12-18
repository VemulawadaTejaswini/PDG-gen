import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            int tmp = s.nextInt();
            if (max < tmp) {
                max = tmp;
            }
            if (min > tmp) {
                min = tmp;
            }
        }
        int k = s.nextInt();
        s.close();
        if (max - min > k) {
            System.out.println(":(");
        } else {
            System.out.println("Yay!");
        }
    }
}
