import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public Main() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        HashMap<Integer, Integer> C = new HashMap<>();
        for (int x = 1; x*x < 2*N; x++) {
            for (int y = 1; (x+y)*(x+y) < 2*N; y++) {
                for (int z = 1; (x+y+z)*(x+y+z) < 5*N; z++) {
                    int key = x*x+y*y+z*z+x*y+y*z+z*x;
                    C.put(key, C.getOrDefault(key,0)+1);
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            System.out.println(C.getOrDefault(i,0));
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
