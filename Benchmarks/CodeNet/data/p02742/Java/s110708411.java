import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long H = sc.nextInt();
        long W = sc.nextInt();

        if(W*H % 2 == 0) {
            long K = (H*W / 2);
            System.out.println(K);
        }
        else {
            long K = (H*W / 2) +1;
            System.out.println(K);
        }
    }
}