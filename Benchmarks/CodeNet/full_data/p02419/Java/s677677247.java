import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String w = sc.next();
        String t = "";
        while (true) {
            t = sc.next();
            if (w.equals(t)) count++;
            else if (t.equals("END_OF_TEXT")) break;
        }
        System.out.println(count);
    }
}

