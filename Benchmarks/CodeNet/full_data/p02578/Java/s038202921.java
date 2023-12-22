import java.util.Scanner;

public class Main2 {

    public static void main(String args []) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] line = new int[n];
        long sum= 0;

        for (int i = 0; i<n; i++) {

            line[i] = sc.nextInt();
        }

        for (int i = 0; i<n-1; i++) {

            if (line[i] > line[i+1]) {
                int a = line[i] - line[i+1];
                line[i + 1] = line[i];
                sum += a;
            }
        }

        System.out.println(sum);
    }
}
