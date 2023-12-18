import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int comboN = (N*(N-1))/2;
        int comboM = (M*(M-1))/2;

        System.out.println(comboN+comboM);
    }
}
