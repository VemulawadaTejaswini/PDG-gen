import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        int count = 1;
        long thres = K;
        while(true) {
            if(thres > N) break;
            thres *= K;
            count++;
        }

        System.out.println(count);
        return;
    }
}
