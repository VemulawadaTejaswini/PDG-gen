import java.util.*;

public class Main {

    private int N;

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
    }

    public void run() {
        inputData();
        System.out.println(N / 3);
    }

    public static void main(String[] args) {
        (new Main()).run();
    }

}
