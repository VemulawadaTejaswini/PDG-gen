import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int k = sc.nextInt();
        String ss = s.substring(k - 1, k);
        for (int i = 0; i < n; i++) {
            String ans = s.substring(i, i + 1);
            if(ans.equals(ss)) System.out.print(ans);
            else System.out.print("*");
        }
    }
}