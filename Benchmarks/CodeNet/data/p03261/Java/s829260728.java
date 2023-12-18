import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        String stush = sc.nextLine();
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }
        boolean flag = true;
        for (int i = 0; i < n - 1; i++) {
            if (!(str[i].charAt(str[i].length() - 1) == str[i + 1].charAt(0))) {
                flag = false;
            }
        }

        System.out.println(flag ? "Yes" : "No");
    }
}