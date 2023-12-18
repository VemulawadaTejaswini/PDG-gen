import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] split = str.split("");
        int count = 0;
        for (String s : split) {
            if (s.equals("1")) count += 1;
            else continue;
        }
        System.out.println(count);
    }
}