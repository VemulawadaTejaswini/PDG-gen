import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.next());
        sc.close();
        System.out.println(N * (N - 1) / 2);
    }
}
