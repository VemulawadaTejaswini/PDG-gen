import java.util.Scanner;

public class Main {
    static final boolean RED = true, WHITE = false;

    public Main() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        String S = scanner.next();
        boolean[] C = new boolean[N];
        for (int i = 0; i < N; i++) {
            C[i] = (S.charAt(i) == 'R') ? RED : WHITE;
        }

        int left = 0 , right = N-1, R = 0;
        while(true){
            while (C[left]  == RED   && left < N-1 ) left++;
            while (C[right] == WHITE && 0 < right  ) right--;

            if (left < right){
                R++;
                left++;
                right--;
            } else {
                break;
            }
        }

        System.out.println(R);
    }

    public static void main(String[] args) {
        new Main();
    }
}
