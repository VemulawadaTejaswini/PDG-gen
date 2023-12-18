import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int count = 0;

        for (int i = 0; i < n; i++) {
            int index = s.indexOf("ABC");
            if (index > -1) {
                count++;
                s = s.substring(index + 3);
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
