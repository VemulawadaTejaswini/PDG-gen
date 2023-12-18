import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());

        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = s.nextInt();
        }


        int answer = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (h[j] > h[i]) {
                    break;
                }

                if (j == i - 1) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}