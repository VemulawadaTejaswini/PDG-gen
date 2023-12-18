import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
        int count = 0;
        int num = 0;
        while (s.contains("ABC")) {
            do {
                num = s.indexOf(s, num) + 1;
                count++;
            } while (num > 0);
            s = s.replace("ABC", "BCA");
        }
        System.out.println(count);
    }
}
