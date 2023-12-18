import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long K = sc.nextInt();
        long A = sc.nextInt();
        long B = sc.nextInt();
        
        long nBiscuits = 1;
        while (K > 0) {
            if (nBiscuits < A) {
                nBiscuits += 1;
                K -= 1;
            } else {
                if (B - A > 2 && K > 1) {
                    nBiscuits += B - A;
                    K -= 2;
                } else {
                    nBiscuits += 1;
                    K -= 1;
                }
            }
        }

        System.out.println(nBiscuits);

    }

}
