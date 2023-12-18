import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            int codep = (s.codePointAt(i) - 65 + n) % 26;
            String tmp = String.valueOf((char) (codep + 'A'));
            System.out.print(tmp);
        }
    }
}
