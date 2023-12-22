import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x * x * x);
    }
}
