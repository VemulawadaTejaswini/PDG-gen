import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int[] a = new int[n + 1];
        int count = 0 ;
        for (int i = 1 ; i < n + 1 ; i++) {
            if (s.substring(i - 1, i).equals("#")) {
                count++;
            }
            a[i] = count;
        }

        int min = 12345567;
        for (int i = 0 ; i < n + 1 ; i++) {
            int b = n - i - (a[n] - a[i]);
            int w = a[i];
            min = Math.min(min, b + w);
        }

        System.out.println(min);
    }

}
