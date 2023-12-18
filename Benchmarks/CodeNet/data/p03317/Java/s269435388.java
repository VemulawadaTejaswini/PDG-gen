import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int p = 0;
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
            if (a[i] == 1) {
                p = i;
            }
        }
        int c = 0;
        int temp = p;
        int temp2 = p;
        while (temp < n -1  ) {
            temp += (k - 1);
            c++;
        }
        while (temp2 > 0) {
            temp2 -= (k - 1);
            c++;
        }

        System.out.println(c);
    }

}