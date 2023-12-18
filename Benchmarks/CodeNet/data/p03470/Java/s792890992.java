import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int N = stdin.nextInt();

        Set<Integer> num = new HashSet<>();

        for (int i = 0; i < N; i++) {
            int n = stdin.nextInt();
            num.add(n);
        }

        System.out.println(num.size());
    }
}
