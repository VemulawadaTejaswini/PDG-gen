import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] str = new String[3];
        int value = 700;
        str = s.split("");
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("o"))
                value += 100;
        }
        System.out.println(value);
    }
}