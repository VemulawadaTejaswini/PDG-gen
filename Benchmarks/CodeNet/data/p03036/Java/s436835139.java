import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int D = sc.nextInt();
        int x_2000 = sc.nextInt();

        int x_i = x_2000;
        for (int i=1; i<11; i++) {
            x_i = r*x_i - D;
            System.out.println(x_i);
        }
    }
}
