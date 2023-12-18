import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if ("".equals(str.substring(i, i + 1))) {
                count++;
            }
        }
        System.out.println(count);
    }
}
