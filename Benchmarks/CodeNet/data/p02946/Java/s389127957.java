import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int x = scan.nextInt();

        int s = x-k+1;
        int e = x+k-1;

        for (int i = s; i <= e; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

    }
}