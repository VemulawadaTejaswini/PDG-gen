import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] l = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
            total += l[i];
            if(total > x) {
                System.out.println(i + 1);
                return;
            }
        }
    }
}