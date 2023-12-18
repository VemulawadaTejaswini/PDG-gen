import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int v = (N * 100)/108;
        for (int i = v; i < v + 3; i++) {
            int X = i * 108 / 100;
            if(X == N) {
                System.out.println(i);
                return;
            }
        }
        
        System.out.println(":(");
        return;
    }

}