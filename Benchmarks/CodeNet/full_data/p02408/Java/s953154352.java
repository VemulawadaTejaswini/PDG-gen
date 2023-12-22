import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            if (type.equals("S")) {
                a[i] = sc.nextInt() + 100;
            } else if (type.equals("H")) {
                a[i] = sc.nextInt() + 200;
            } else if (type.equals("C")) {
                a[i] = sc.nextInt() + 300;
            } else if (type.equals("D")) {
                a[i] = sc.nextInt() + 400;
            }
        }
        Arrays.sort(a);
        for (int i = 1, j = 0; i <= 52; i++) {
            if (i <= 13) { //spade
                if (n > j && a[j] == 100 + i) {
                    j++;
                } else {
                    System.out.println("S " + i);
                }
            } else if (i <= 26) { //heart
                if (n > j && a[j] == 200 + i - 13) {
                    j++;
                } else {
                    System.out.println("H " + (i - 13));
                }
            } else if (i <= 39) { //club
                if (n > j && a[j] == 300 + i - 26) {
                    j++;
                } else {
                    System.out.println("C " + (i - 26));
                }
            } else { //dia
                if (n > j && a[j] == 400 + i - 39) {
                    j++;
                } else {
                    System.out.println("D " + (i - 39));
                }
            }
        }
    }
}