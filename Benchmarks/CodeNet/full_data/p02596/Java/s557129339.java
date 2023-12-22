import java.util.Scanner;

public class Main {

    public Main() {
        Scanner scanner = new Scanner(System.in);
        long K = scanner.nextLong();

        if(K % 2L == 0){
            System.out.println(-1);
            return;
        }

        long MOD = 7L % K;
        long R = 1L;

        while(MOD != 0L){
            MOD = ((MOD * 10) % K + 7L) % K;
            R++;
        }

        System.out.println(R);
    }

    public static void main(String[] args) {
        new Main();
    }
}
