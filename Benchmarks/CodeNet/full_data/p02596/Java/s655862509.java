import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        long K = scanner.nextLong();
        if (K % 2 == 0) {
            System.out.println(-1);
            return;
        }
        long div = 7;
        int ret = 1;

        while(true){
            double sample = (double)div / (double)K;
            if(div > K && sample - Math.floor(sample) < 0.001) break;
            div *=10;
            div +=7;
            ret++;
        }

        System.out.println(ret);
    }
}