import java.util.Scanner;
public class Main {
    long La = 2L;
    long Lb = 1L;
    long Lc = 1L;
    public static void main(String[] args) {
        new Main().run();
    }
    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N-1; i++) {
            Lc = Lb + La;
            La = Lb;
            Lb = Lc;
        }
        System.out.println(Lc);
    }
}