import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String str = sc.next();
        boolean flag = true;
        if (str.length() != a + b + 1) {
            flag = false;
        }
        if (str.charAt(a) != '-') {
            flag = false;
        }
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '-') {
                count++;
            }
        }
        if (count != 1) {
            flag = false;
        }
        System.out.println(flag ? "Yes" : "No");
    }
}