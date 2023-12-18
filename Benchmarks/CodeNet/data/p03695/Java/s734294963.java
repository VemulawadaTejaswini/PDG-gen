import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] ary = new int[13];
        int freeC = 0;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            ary[a / 400]++;
        }
        int ans = 0;
        for (int i = 0; i < 13; i++) {
            if (i >= 8 && ary[i] != 0) {
                freeC += ary[i];
            } else if (ary[i] != 0) {
                ans++;
            }
        }
        if (ans == 0 && freeC != 0) {
            System.out.println(1 + " " + freeC);
        } else {
            System.out.println(ans + " " + (ans + freeC));
        }
    }
}