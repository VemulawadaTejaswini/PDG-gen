import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] h = new Integer[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        boolean result = true;
        int max = h[0];
        for (int i = 1; i < n && result; i++) {
            if (max < h[i]){
                max = h[i] - 1;
            } else if (max > h[i]) {
                result = false;
            }
        }

        System.out.println(result ? "Yes" : "No");
    }
}
