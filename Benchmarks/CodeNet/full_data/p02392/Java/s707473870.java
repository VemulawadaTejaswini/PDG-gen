import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        StringBuffer sb = new StringBuffer();
        if (a < b && b < c) {
            sb.append("Yes");
        } else {
            sb.append("No");
        }

        System.out.println(sb);
    }
}