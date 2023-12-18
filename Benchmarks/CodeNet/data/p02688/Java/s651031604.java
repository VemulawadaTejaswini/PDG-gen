import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();

        int snack, people;
        int count = 0;
        boolean[] snuke = new boolean[N];
        for (int i = 0; i < K; i++) {
            people = input.nextInt();
            for (int j = 0; j < people; j++) {
                snuke[input.nextInt() - 1] = true;
            }
        }

        for (int i = 0; i < snuke.length; i++) {
            if (!snuke[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
