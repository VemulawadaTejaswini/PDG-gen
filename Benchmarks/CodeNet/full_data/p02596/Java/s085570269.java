import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int[] a = new int[1000001];

        a[1] = 7 % K;
        for (int i = 2; i <= K; i++) {
            a[i] = (a[i-1] * 10 + 7) % K;
        }

        for(int i = 1; i <= K; i++) {
            if (a[i] == 0) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }

}
