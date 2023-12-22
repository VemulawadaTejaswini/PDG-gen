import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String[] array = sc.nextLine().split("[\\s]");
            int n1 = Integer.parseInt(array[0]);
            int n2 = Integer.parseInt(array[1]);
            int n3 = Integer.parseInt(array[2]);
            int swap = n3;
            if (n1 < n2 && n3 < n2) {
                n3 = n2;
                n2 = swap;
            } else if (n2 < n1 && n3 < n1) {
                n3 = n1;
                n1 = swap;
            }

            if ((n1 * n1) + (n2 * n2) == (n3 * n3)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }

}