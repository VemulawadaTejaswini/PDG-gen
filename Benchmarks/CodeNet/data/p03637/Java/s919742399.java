import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int a4 = 0;
        int a2 = 0;
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            if(tmp % 4 == 0) {
                a4++;
            } else if(tmp == 2) {
                a2++;
            }
            a[i] = tmp;
        }
        String ans = "";
        if(a4 + (a2 / 2) >= n / 2) {
            ans = "Yes";
        } else if(a2 == n) {
            ans = "Yes";
        }
        else {
            ans = "No";
        }
        System.out.println(ans);
    }
}