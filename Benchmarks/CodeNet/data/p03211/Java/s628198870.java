import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");

        int min = 753;
        for (int i = 0; i < s.length - 2; i++) {
            int num = Integer.parseInt(s[i] + s[i + 1] + s[i + 2]);
            min = Math.min(min, Math.abs(753 - num));
        }

        System.out.println(min);
    }
}