import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long Y = Long.parseLong(sc.next());

        for (int i = 0; 1000*i <= Y && i <= N; i++) {
            for (int j = 0; 1000*i + 5000*j <= Y && (i+j) <= N ; j++) {
                for (int k = 0; 1000*i + 5000*j + 10000*k <= Y && i+j+k <= N; k++) {
                    if (1000*i + 5000*j + 10000*k == Y && (i+j+k == N)) {
                        System.out.println(k + " " + j + " " + i);
                        System.exit(0);
                    }
                }
            }
        }

        System.out.println("-1 -1 -1");
    }
}
