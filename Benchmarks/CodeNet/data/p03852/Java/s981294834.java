import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        sc.close();

        boolean ans = false;

        if (s.equals("a") || s.equals("i") || s.equals("u") || s.equals("e") || s.equals("o")) {
            ans = true;
        }

        System.out.println(ans ? "vowel" : "consonant");
    }
}