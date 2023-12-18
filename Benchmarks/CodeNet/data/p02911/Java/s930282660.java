import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int[] a = new int[q];
        int[] participant = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < participant.length; i++) {
            participant[i] = k;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < participant.length; j++) {
                if (j == a[i] - 1) {
                    continue;
                }
                participant[j]--;
            }
        }
        for (int i = 0; i < participant.length; i++) {
            if (participant[i] > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}