import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int x = sc.nextInt();
        int min = x - k + 1;
        int max = x + k - 1;
        if (min < -1000000) {
            min = -1000000;
        }
        if (max > 1000000) {
            max = 1000000;
        }
        for (int i = min; i <= max; i++) {
            System.out.print(i);
            if (i != max) {
                System.out.print(" ");
            }
        }
        System.out.println("");
        sc.close();
    }
}
