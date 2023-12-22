import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String answer = "";

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (Character.isLowerCase(c) == true) {
                c = Character.toUpperCase(c);
                answer += c;
            } else {
                c = Character.toLowerCase(c);
                answer += c;
            }
        }

        System.out.println(answer);

        sc.close();
    }
}

