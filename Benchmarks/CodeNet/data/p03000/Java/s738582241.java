import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int D = 0;
        int count = 1;

        for (int i = 0; i < N; i++) {
            int L = sc.nextInt();
            D += L;
            if (D <= X) {
                count++;
            }
        }

        System.out.println(count);
    }

}