import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

class Solver {

    private final int[] students;

    Solver(Scanner in){
        int N = in.nextInt();
        students = new int[N];
        for (int i = 0; i < N; i++) {
            students[in.nextInt() - 1] = i + 1;
        }
    }

    void solve() {
        System.out.println(Arrays.stream(students).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }
}

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        new Solver(in).solve();

        in.close();
    }
}