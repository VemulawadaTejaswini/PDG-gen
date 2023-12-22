import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int T = scanner.nextInt();
        for(int i = 1; i < 100000; i++) {
            if(N <= X * i) {
                System.out.println(T*i);
                return;
            }
        }
    }
}