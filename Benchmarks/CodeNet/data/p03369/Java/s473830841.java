import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ans = 0;
        for (int i = 0; i < 3; i++) {
            if (str.charAt(i) == 'o') {
                ans++;
            }
        }
        System.out.println(ans * 100 + 700);

    }
}