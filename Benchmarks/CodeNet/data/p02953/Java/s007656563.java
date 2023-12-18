import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < h.length; i++) {
            h[i] = sc.nextInt();
        }
        for (int i = 0; i < h.length - 1; i++) {
            if(h[i] < h[i + 1]) {
                h[i + 1] -= 1;
            }
            if(h[i] > h[i + 1]) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}