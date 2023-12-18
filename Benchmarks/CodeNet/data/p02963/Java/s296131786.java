import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int[] answer = new int[6];
        int x = (int) Math.sqrt(S);
        answer[0] = x;
        answer[1] = x;
        answer[2] = 0;
        answer[3] = x / 2;
        answer[4] = x / 2;
        answer[5] = 0;
        for (int i = 0; i < 6; i++)
            if (i == 5) {
                System.out.println(answer[i]);
            } else {
                System.out.print(answer[i] + " ");
            }
    }
}