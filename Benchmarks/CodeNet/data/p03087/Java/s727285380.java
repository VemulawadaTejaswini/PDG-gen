import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        int[] num = new int[n];
        for (int i = 0; i < n - 1; i++) {
            if(s.substring(i, i + 2).equals("AC")) {
                num[i + 1] = num[i] + 1;
            } else {
                num[i + 1] = num[i];
            }
        }
        for (int i = 0; i < q ; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = num[r - 1] - num[l - 1];
            System.out.println(ans);
        }
    }
}