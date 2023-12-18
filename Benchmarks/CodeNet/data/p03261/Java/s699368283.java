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
            char a = str[i].charAt(str[i].length() - 1);
            char b = str[i + 1].charAt(0);
            if (!(a == b)) {
                flag = false;
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (str[i].equals(str[j])) {
                    flag = false;
                }
            }
        }
        System.out.println(flag ? "Yes" : "No");
    }
}