import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] boss = new int[n];
        for (int i = 0; i < n; i++){
            boss[scanner.nextInt() - 1]++;
        }
        for (int i : boss) {
            System.out.println(i);
        }
    }
}