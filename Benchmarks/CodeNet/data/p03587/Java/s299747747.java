import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        int count = 0;
        for (int i = 0 ; i < 6 ; i++) {
            if (string.substring(i, i + 1).equals("1")) {
                count++;
            }
        }
        System.out.println(count);
    }

}
