import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            int x = i;

            if (x % 3 == 0) {
                System.out.print(" " + i);
                continue;
            }
            while (x != 0) {
                if (x % 10 == 3) {
                    System.out.print(" " + i);
                    break;

                }
                x /= 10;
            }
        }
        
        System.out.println("");

    }

}
