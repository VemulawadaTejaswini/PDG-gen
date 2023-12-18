import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.nextLine();
        int count = 0;
        char c = S.charAt(0);

        for (int i = 0; i < N; i++) {
            if (S.charAt(i) != c) {
                count++;
                c = S.charAt(i);
            }
        }

        System.out.println(count);


    }
}
