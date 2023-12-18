import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int X = sc.nextInt();

        int total = K * 500;

        if (total >= X)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}