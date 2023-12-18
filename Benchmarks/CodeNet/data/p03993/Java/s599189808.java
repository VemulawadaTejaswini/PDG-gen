import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt() - 1;
        }
        int count = 0;
        for (int i = 0 ; i < n ; i++) {
            if (a[a[i]] == i) {
                count++;
            }
        }
        System.out.println(count/2);
    }

}
