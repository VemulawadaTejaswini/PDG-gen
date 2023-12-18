import java.util.Scanner;

public class Main {

    public static void main(String args []) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int k = sc.nextInt();



        int line[] = new int[n];

        for (int i = 0; i<n; i++) {
            line[i] = sc.nextInt();
        }

        int x = line[0];

        for (int j = 1; j<k; j++) {
            x = line[x - 1];
        }

        System.out.println(String.valueOf(x));


    }
}
