import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int num = 1;
        int sum = 0;
        int[] L = new int[N];
        for(int i = 0; i < N; i++) {
            L[i] = scanner.nextInt();
            sum += L[i];
            if(sum <= X) {
                num++;
            }
        }
        System.out.println(num);
    }
}
