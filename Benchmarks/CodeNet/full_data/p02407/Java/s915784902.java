import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sec[] = new int[n];
        for (int i = 0; i < n; i++) {
            sec[i] = scanner.nextInt();
        }
        for (int i = sec.length-1; i >= 0; i--) {
            if(i < sec.length-1) System.out.print(" ");
            System.out.print(sec[i]);
        }
        System.out.println();
    }
}
