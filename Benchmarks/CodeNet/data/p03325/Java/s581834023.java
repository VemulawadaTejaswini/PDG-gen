import java.util.Scanner;

class Solver {

    private final int N;
    private final int[] A;

    Solver(Scanner in){
        N = in.nextInt();
        A = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = in.nextInt();
        }
    }

    void solve() {
        int counter = 0;
        for (int value : A) {
            counter += Integer.numberOfTrailingZeros(value);
        }
        System.out.println(counter);
    }
}

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        new Solver(in).solve();

        in.close();
    }
}