import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] c = s.toCharArray();

        int min = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            if (min == 0 && c[i] == 'A')
                min = i;
            if (min > 0 && c[i] == 'Z')
                max = i;
        }

        System.out.println(max - min + 1);
    }
}