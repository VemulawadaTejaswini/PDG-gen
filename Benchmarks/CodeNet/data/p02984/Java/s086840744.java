import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

class Solver {
    void solve(Scanner sc) {
        int N = sc.nextInt();
        
        int[] dams = new int[N];
        int[] mountains = new int[N];
        
        for (int i = 0; i < dams.length; i++) {
            dams[i] = sc.nextInt();
            mountains[0] += (i % 2 == 0 ? 1 : -1) * dams[i];
        }
        
        for (int j = 1; j < N; j++) {
            mountains[j] = dams[j - 1] * 2 - mountains[j - 1];
        }
        
        System.out.println(Arrays.stream(mountains).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        new Solver().solve(in);

        in.close();
    }
}