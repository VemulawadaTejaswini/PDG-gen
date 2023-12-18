import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        Set<Integer> set = new HashSet<Integer>();
        for (int i = 2; i * i <= X; ++i) set.add(i);

        int max = 1;
        for (Integer i : set) {
            for (int j = i * i; j <= X; j *= i) {
                max = Math.max(max, j);
            }
        }

        System.out.println(max);

        return;
    }

}
