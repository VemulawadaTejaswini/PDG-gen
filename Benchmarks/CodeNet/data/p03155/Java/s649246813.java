import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int H = sc.nextInt();
        int W = sc.nextInt();

        int vh = N - H + 1;
        int vw = N - W + 1;

        System.out.println(vh * vw);
    }
}
